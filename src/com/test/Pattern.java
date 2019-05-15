package com.test;

public class Pattern {

	public static void main(String[] args) {

		int len = 5;
		for (int i = 0; i <= len; i++) {
			for (int j = i; j <= len; j++) {
				if (j <= i) {
					System.out.print("*");
				} else {
					System.out.println(" ");
				}
			}
			System.out.println();
		}
	}
}
