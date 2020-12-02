package com.time;
import java.time.*;
public class DateTimeAPI {

	public static void main(String[] args) {

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		//You can pass date time to this API
		LocalDateTime dateTime2 = LocalDateTime.of(2020, 12, 02, 10, 29, 47, 1000000);
		System.out.println(dateTime2);
	}

}
