package com.gezmo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Service {
	PrintWriter writer;
	
	public Service(PrintWriter writer) {
		this.writer = writer;
	}

	void getService() {
		try {
			Process process = Runtime.getRuntime().exec("sc query type= service state= all");
		    Scanner reader = new Scanner(process.getInputStream());
		    while(reader.hasNextLine()) {
		    	String str = new String(reader.nextLine());
		    	if(str.matches("^SERVICE_NAME:.*") || str.matches("^DISPLAY_NAME:.*") || str.matches(".*STATE.*")
		    			|| str.matches("^Имя_службы:.*") || str.matches("^Выводимое_имя:.*") || str.matches(".*Состояние.*")) {
		    		writer.println(changeStr(str));
		    		Thread.sleep(2);
		    	}
		    }
		    reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	void chahgeStateService(String state, String nameService) {
		try {
			Process process = null;
			if(state.equals("stop")) {
				process = Runtime.getRuntime().exec("net stop "+nameService);
			}
			if(state.equals("start")) {
				process = Runtime.getRuntime().exec("net start "+nameService);
			}
			Scanner reader = new Scanner(process.getInputStream());
			while(reader.hasNextLine()) {
				String str = new String(reader.nextLine());
				str = str.trim();
				writer.println(str);
				Thread.sleep(2);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	void getState(String nameService) {
		try {
			Process process = Runtime.getRuntime().exec("sc query "+nameService);
			Scanner reader = new Scanner(process.getInputStream());
			while(reader.hasNextLine()) {
				String str = new String(reader.nextLine());
	    		writer.println(changeStr(str));
	    		Thread.sleep(2);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	String changeStr(String str) {
		String regexp = "[\\s]{2,}";//pattern regexp
		Pattern pattern = Pattern.compile(regexp);
		Matcher matcher = pattern.matcher(str);
		str = matcher.replaceAll(" ");
		System.out.println("str1 = " + "\""+ str+ "\"");
		str = str.trim();
		return str;
	}
}
