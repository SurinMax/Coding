package com.surin;

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
	Boolean isActive = true;
	
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
			while(isActive) {
				String str = scanner.nextLine();
				if(str.equals("exit")) {
					isActive = false;
					scanner.close();
					socket.close();
					break;
				}
				if(str.equals("list")) {
					service.getService();
				}
				if(str.equals("stop")) {
					
				}
				if(str.equals("run")) {
					
				}
				writer.println("You write: " + str);	
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
