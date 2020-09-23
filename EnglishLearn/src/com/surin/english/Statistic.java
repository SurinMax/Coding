package com.surin.english;

import java.util.ArrayList;

public class Statistic {
	private ArrayList<String> statisticLearn;
	
	public Statistic() {
		statisticLearn = new ArrayList<String>();
	}

	public void updateStatisticLearn(String stat) {
		statisticLearn.add(stat);
	}
	
	public void getStatitisticLearn() {
		System.out.println("\nStatistic Learn:");
		for (String string : statisticLearn) {
			System.out.println(string);
		}
	}
	
	public void summary(int correct, int incorrect) {
		System.out.println("\nCorrect answer="+correct);
		System.out.println("Incorrect answer="+incorrect);
	}
}
