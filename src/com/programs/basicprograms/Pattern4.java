package com.programs.basicprograms;

public class Pattern4 {

	public static void main(String[] args) {
		int number = 5;
		for (int i = 1; i <= number; i++) {
			for (int j = number; j >= 0; j--) {
				if(j>=i)
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				if(j<=i)
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
