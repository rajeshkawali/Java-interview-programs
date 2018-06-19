package com.programs.important;

import java.io.*;

public class PrimeNumber {

	public static void main(String[] args) throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number :");
		int number = Integer.parseInt(rd.readLine());

		for (int j = 2; j <= 100; j++) {
			int count = 0;
			int no = j;
			for (int i=1; i <= no; i++) {
				//System.out.println(number % i);
				if (number % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(number + " is prime number");
			}else{
				System.out.println("Not Prime Number");
			}
		}
	}
}
