package com.programs.basicprograms;

import java.util.Scanner;
// Program to print prime number
public class PrimeNumber {

	public static void main(String[] args) {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		for (i = 2; i < number; i++) {
			if (number % i == 0) {
				break;
			}
		}
		if (number == i) {
			System.out.println(number+" is a Prime number");
		} else {
			System.out.println(number+" is not a Prime number");
		}

	}

}
