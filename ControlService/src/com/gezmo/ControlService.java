package com.gezmo;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ControlService {
	private static int numberPort = 8189;
	public static void main(String[] args) {
		try {
		ServerSocket serverSocket = new ServerSocket(numberPort);
		while(true) {
			Socket socket = serverSocket.accept();
			new Thread(new MyServer(socket,serverSocket)).start();
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class MyServer implements Runnable{
	Socket socket;
	ServerSocket serverSocket;
	
	public MyServer(Socket socket, ServerSocket serverSocket) {
		this.socket = socket;
		this.serverSocket = serverSocket;
	}
	@Override
	public void run() {
		try {
			Scanner scanner = new Scanner(socket.getInputStream());
			PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
			Service service = new Service(writer);
			writer.println("You connect to: " + InetAddress.getLocalHost());
			writer.println("Use command help!");
			while(true) {
				String str = "";
				if(scanner.hasNext()) {
					str = scanner.nextLine();
					System.out.println("Str 3= "+ str);
				}
				System.out.println("Str 2= "+ str);
				if(str.equals("exit")) {
					scanner.close();
					socket.close();
					break;
				}
				if(str.equals("list")) {
					service.getService();
				}
				if(str.matches("^stop .*")) {
					writer.println("Run stop service");
				}
				if(str.matches("^run .*")){
					writer.println("Run run service");
				}
				if(str.matches("^find .*")) {
					service.getState(str.replaceAll("find ", ""));
				}
				if(str.matches("^help")) {
					writer.println("You can do next:");
					writer.println("1. Get list service. Use command \"list\"");
					writer.println("2. Stop service. Use command \"stop name_service\"");
					writer.println("3. Run service. Use command \"run name_service\"");
					writer.println("4. Get status service. Use command \"find name_service\"");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}