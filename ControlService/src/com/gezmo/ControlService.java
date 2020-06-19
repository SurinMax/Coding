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
			//PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "866")), true);
			Service service = new Service(writer);
			writer.println("You connect to: " + InetAddress.getLocalHost());
			while(true) {
				String str = "";
				if(scanner.hasNext()) {
					str = scanner.nextLine();
				}
				if(str.equals("exit")) {
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
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
