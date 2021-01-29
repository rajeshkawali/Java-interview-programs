package com.time;

import java.time.LocalDate;
import java.time.LocalTime;

public class Date {

	public static void main(String[] args) {
		// 2020-12-02
		LocalDate date = LocalDate.now();
		System.out.println(date);
		// 10:19:16.116
		LocalTime time = LocalTime.now();
		System.out.println(time);
		// 02
		int day = date.getDayOfMonth();
		System.out.println(day);
		// 12
		int mon = date.getMonthValue();
		System.out.println(mon);
		// 2020
		int year = date.getYear();
		System.out.println(year);

		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
	}

}
