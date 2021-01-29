package com.programs.slidenerd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfDigitsOfReversedNumber {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number :");
		int number = Integer.parseInt(bf.readLine());
		int sum=0;
		int digit;
		int temp = number;
		while (temp != 0) {
			digit = temp % 10; // It will give last digit of the number
			System.out.print(digit);
			sum = sum + digit;
			temp = temp / 10; // This provide next digit
		}
		System.out.println("Sum of digits = "+sum);
	}

}
