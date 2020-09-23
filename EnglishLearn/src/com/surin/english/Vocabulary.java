package com.surin.english;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * @author surin
 *
 */
public class Vocabulary {
	/**
	 * Path to file with vocabulary
	 */
	private String patchToFile;
	private ArrayList<String> wordsToLearn;
	private boolean write = false;
	public Vocabulary(String patchToFile) {
		this.patchToFile = patchToFile;
	}
	/**
	 * 
	 * @return
	 */
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
			e.printStackTrace();
		} 
		return wordsToLearn;
	}
	
	public String nextWord(ArrayList<String> wordsToLearn) {
		return wordsToLearn.get(genNumberWord(wordsToLearn.size()));
	}
	
	public int genNumberWord(int sizeArrayList){
		int number = 0;
		if(sizeArrayList != 0)
			number = new Random().nextInt(((sizeArrayList-1) - 0) + 1) + 0;
		return number;
    }
	
}
