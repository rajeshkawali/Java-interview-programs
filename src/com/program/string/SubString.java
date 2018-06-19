package com.program.string;

public class SubString {
	public static void main(String[] args) {
		String s = "Java Concept Of The Day";
		String subString1 = s.substring(11);
		System.out.println(subString1); // Output : t Of The Day
		String subString2 = s.substring(5, 15);
		System.out.println(subString2); // Output : Concept Of
	}
}