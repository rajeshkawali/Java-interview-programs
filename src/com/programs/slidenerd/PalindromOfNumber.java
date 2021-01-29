package com.programs.slidenerd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromOfNumber {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number :");
		int number = Integer.parseInt(bf.readLine());
		StringBuilder string = new StringBuilder(number + "");
		string.reverse();
		String reverse = string.toString();
		int rev = Integer.parseInt(reverse);
		if (rev == number) {
			System.out.println("Palindro");
		} else {
			System.out.println("Not Palindro");
		}

	}

}
