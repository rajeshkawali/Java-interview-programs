package com.programs.important;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfDigits {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number :");
		int number = Integer.parseInt(rd.readLine());
		int sum=0;
		while(number!=0){
			int digit = number%10;
			System.out.print(digit);
			sum=sum+digit;
			number=number/10;
		}
		System.out.println("Sum Of Digits="+sum);
		
	}
}
