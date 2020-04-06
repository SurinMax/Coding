package com.surin.time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Time {
public static void main(String[] args) {
	System.out.println("We start learn date class");
	Date date = new Date();
	System.out.println("Now: " + date);
	Calendar calendar = new GregorianCalendar();
	calendar.setTime(date);
	calendar.add(Calendar.DAY_OF_WEEK, -1);
	System.out.println(calendar);
}
}
