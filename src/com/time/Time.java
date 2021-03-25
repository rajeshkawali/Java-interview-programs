package com.time;

import java.time.*;
public class Time {

	public static void main(String[] args) {
		LocalDate date =LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		int hour = time.getHour();
		int min = time.getMinute();
		int sec = time.getSecond();
		int nanoSec = time.getNano();
		
		System.out.println(hour);
		System.out.println(min);
		System.out.println(sec);
		System.out.println(nanoSec);
	}

}
