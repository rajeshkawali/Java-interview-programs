package com.programs.important;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberToWord {

	public static void main(String[] args) throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Numbers :");
		String number = rd.readLine();
		int length = number.length();
		for (int i = 0; i < length; i++) {
			char c = number.charAt(i);
			if (c == '0') {
				System.out.println("zero");
			} else if (c == '1') {
				System.out.println("one");
			} else if (c == '2') {
				System.out.println("two");
			} else if (c == '3') {
				System.out.println("three");
			} else if (c == '4') {
				System.out.println("four");
			} else if (c == '5') {
				System.out.println("five");
			} else if (c == '6') {
				System.out.println("six");
			} else if (c == '7') {
				System.out.println("seven");
			} else if (c == '8') {
				System.out.println("eight");
			} else if (c == '9') {
				System.out.println("nine");
			}
		}

	}

}
