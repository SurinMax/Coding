package com.surin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Service {
	PrintWriter writer;
	
	public Service(PrintWriter writer) {
		this.writer = writer;
	}

	void getService() {
		try {
			String str1 = "sdfsdf sdf  sdfs     sfsf sfsfsf    sf";
			Process process = Runtime.getRuntime().exec("sc query type= service state= all");
		    final Scanner reader = new Scanner(process.getInputStream());
		    int i=1;
		    while(reader.hasNextLine()) {
		    	String str = new String(reader.nextLine());
		    	if(str.matches("^SERVICE_NAME:.*") || str.matches("^DISPLAY_NAME:.*") || str.matches(".*STATE.*")) {
		    		str.replaceAll("\\s\\{2,}", " ");
		    		writer.println(str.trim());
		    	}
		    }
		    System.out.println(str1);
		    System.out.println(str1.replaceAll("\\s\\{2,}", " "));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	void stopService() {
		
	}
	
	void runService() {
		
	}
}
