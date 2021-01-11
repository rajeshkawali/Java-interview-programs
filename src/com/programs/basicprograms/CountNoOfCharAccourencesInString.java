package com.programs.basicprograms;

import java.util.HashMap;

public class CountNoOfCharAccourencesInString {

	public static void main(String[] args) {

		String str = "java is object oriented programming language";
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		for (char character : ch) {
			if (charCount.containsKey(character)) {
				charCount.put(character, charCount.get(character) + 1);
			} else {
				charCount.put(character, 1);
			}
		}
		System.out.println(charCount);
	}
}
