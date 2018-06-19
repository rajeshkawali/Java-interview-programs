package com.program.string;

public class getCharArray {
	public static void main(String[] args) {
		String s = "Java Concept Of The Day";
		// Converting string 's' into character array.
		char[] dst = s.toCharArray();
		for (char c : dst) {
			System.out.print(c); // Output : Java Concept Of The Day
		}
	}
}