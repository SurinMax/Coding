package com.surin.english;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
	String patchToFile;
	ArrayList<String> wordsToLearn;
	boolean write = false;
	public ReadFile(String patchToFile) {
		this.patchToFile = patchToFile;
	}
	public ArrayList<String> startReadFile() {
		wordsToLearn = new ArrayList<String>();
		try {
			File file = new File(patchToFile);
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = bufferedReader.readLine();
			while (line != null) {
				if(line.equals(">") && write == true)
					write = false;
				if(line.equals("<") && write == false)
					write = true;
				if(write) {
					line = bufferedReader.readLine();
					if(line.equals("<") || line.equals(">") || line.equals(""))
						continue;
					wordsToLearn.add(line);
					//System.out.println(line);
				}
				else {
					line = bufferedReader.readLine();
				}
			}
			bufferedReader.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found. Please, check file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return wordsToLearn;
	}
}
