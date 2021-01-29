package com.programs.slidenerd;

public class CharachterClassMethods {

	public static void main(String[] args) {

		char c = 'A';
		if (Character.isAlphabetic(c)) {
			System.out.println("Alphabetic ");
		} else if (Character.isLetter(c)) {
			System.out.println("Letter ");
		} else if (Character.isDigit(c)) {
			System.out.println("Digit ");
		} else if (Character.isWhitespace(c)) {
			System.out.println("Whitespace ");
		} else if (Character.isLowerCase(c)) {
			System.out.println("LowerCase ");
		} else if (Character.isUpperCase(c)) {
			System.out.println("UpperCase ");
		}
	}
}
