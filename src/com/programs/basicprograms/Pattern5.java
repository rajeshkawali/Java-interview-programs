package com.programs.basicprograms;

public class Pattern5 {

	public static void main(String[] args) {

		int number = 5;
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				if(j<=i)
				System.out.print(i);
			}
			System.out.println();
		}
		for (int i = 1; i <= number; i++) {
			for (int j = number; j >= 0; j--) {
				if(j>=i)
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("----------------------------------");
		for (int i = 1; i <= number; i++) {
			for (int j = i; j <= number; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------------------");
		for (int i = 1; i <= number; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= number-2; i++) {
			for (int j = 1; j <= number; j++) {
				if(j==1 || j==number) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 1; i <= number; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("----------------------------------");
		
		
	}

}
