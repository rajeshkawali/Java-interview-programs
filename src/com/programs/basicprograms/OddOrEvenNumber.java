package com.programs.basicprograms;

import java.util.Scanner;

public class OddOrEvenNumber {

	public static void main(String[] args) {

		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		for (i = 2; i < number; i++) {
			if (number % i == 0) {
				continue;
			}
		}
		System.out.println("It is a Odd Number:"+number);
		/*
		int number = 5;
		for (int i = 0; i <=number; i++) {
			if(number%2==0) {
				System.out.println("It is not a Odd Number:"+number);
			}else {
				System.out.println("It is a Odd Number:"+number);
			}
		}*/
	}
	

}
