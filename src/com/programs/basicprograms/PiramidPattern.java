package com.programs.basicprograms;

public class PiramidPattern {

	public static void main(String[] args) {

		
		int number = 7;
		int noOfSpaces =number;
		for (int i = 1; i <= number; i++) {
			for (int j = noOfSpaces; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= number; j++) {
				if(j<=i) {
					System.out.print(" ");
					System.out.print("*");
				}
			}
			System.out.println();
			noOfSpaces = noOfSpaces-1;
		}
	}

}
