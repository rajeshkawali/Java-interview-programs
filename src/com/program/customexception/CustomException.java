package com.program.customexception;

import java.util.Scanner;

public class CustomException {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age=");
		int age = sc.nextInt();
		if (age > 0) {
			System.out.println("Your age is " + age);
		} else {
			// throw new AgeZeroOrNagativeException();
			throw new AgeZeroOrNagativeException("Age cannot be zero or negative");
		}
	}
}
