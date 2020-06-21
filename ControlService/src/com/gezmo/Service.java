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
			String regexp = "[\\s]{2,}";//pattern regexp
			Pattern pattern = Pattern.compile(regexp);
			Process process = Runtime.getRuntime().exec("sc query type= service state= all");
		    Scanner reader = new Scanner(process.getInputStream());
		    while(reader.hasNextLine()) {
		    	String str = new String(reader.nextLine());
		    	if(str.matches("^SERVICE_NAME:.*") || str.matches("^DISPLAY_NAME:.*") || str.matches(".*STATE.*")
		    			|| str.matches("^Имя_службы:.*") || str.matches("^Выводимое_имя:.*") || str.matches(".*Состояние.*")) {
		    		Matcher matcher = pattern.matcher(str);
		    		str = matcher.replaceAll(" ");
		    		str = str.trim();
		    		writer.println(str);
		    		Thread.sleep(2);
		    	}
		    }
		    reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	void stopService() {
		
	}
	
	void runService() {
		
	}
	
	void getState(String nameService) {
		try {
			String regexp = "[\\s]{2,}";//pattern regexp
			Pattern pattern = Pattern.compile(regexp);
			Process process = Runtime.getRuntime().exec("sc query "+nameService);
			Scanner reader = new Scanner(process.getInputStream());
			while(reader.hasNextLine()) {
				String str = new String(reader.nextLine());
				Matcher matcher = pattern.matcher(str);
	    		str = matcher.replaceAll(" ");
	    		str = str.trim();
	    		writer.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
