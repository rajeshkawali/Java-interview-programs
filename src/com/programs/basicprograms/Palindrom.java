package com.programs.basicprograms;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {

		String original, reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		original = sc.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse+original.charAt(i);
		}
		if(original.equals(reverse)) {
			System.out.println("String is palindrom");
		}else {
			System.out.println("String is not palindrom");
		}

	}
}
