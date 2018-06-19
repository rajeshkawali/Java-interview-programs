package com.programs.important;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number :");
		int number = Integer.parseInt(rd.readLine());
		
		while(number!=0){
			System.out.print(number%10);
			number=number/10;
		}
		System.out.println();
		
	}

}
