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
/*
Immutability: All the classes in the new Date Time API are immutable and good for multithreaded environments.

Separation of Concerns: The new API separates clearly between human readable date time and machine time (unix timestamp). 
It defines separate classes for Date, Time, DateTime, Timestamp, Timezone etc.

Clarity: The methods are clearly defined and perform the same action in all the classes. For example, 
to get the current instance we have now() method. There are format() and parse() methods defined in all 
these classes rather than having a separate class for them.
All the classes use Factory Pattern and Strategy Pattern for better handling. Once you have used the 
methods in one of the class, working with other classes won’t be hard.

Utility operations: All the new Date Time API classes comes with methods to perform common tasks, 
such as plus, minus, format, parsing, getting separate part in date/time etc.

Extendable: The new Date Time API works on ISO-8601 calendar system but we can use it with 
other non ISO calendars as well.
*/