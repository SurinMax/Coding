package com.surin.study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User implements Serializable {
	private int level;
	private Sord sord;
	
	void setLevel(int level) {
		this.level = level;
	}
	int getLevel() {
		return level;
	}

	public static void main(String[] args) {
		User user = new User();
		User user1 = null;
		user.setLevel(3);
		Sord sord = new Sord();
		sord.setLevel(5);
		user.sord = sord;
		
		String path = "E:\\CodingTemp\\test";
		
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		try {
			fileOutputStream = new FileOutputStream(path);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(user);
			fileInputStream = new FileInputStream(path);
			objectInputStream = new ObjectInputStream(fileInputStream);			
			user1 = (User) objectInputStream.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(user1.getLevel());

	}
}
