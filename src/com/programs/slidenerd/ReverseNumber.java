package com.programs.slidenerd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Reverse the number
public class ReverseNumber {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number :");
		int number = Integer.parseInt(bf.readLine());
		int temp = number;
		int digit;
		while (temp != 0) {
			digit = temp % 10; 
			System.out.print(digit); // It will give last digit of the number
			temp = temp / 10; // This provide next digit
		}
		System.out.println();
	}
}
