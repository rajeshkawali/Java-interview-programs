package com.programs.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Size :");
		int size = Integer.parseInt(rd.readLine());
		int oddNo = 1;
		int noOfSpaces = size -1;
		for (int i = 1; i <= size; i++) {
			int k = 0;
			for (int j = noOfSpaces; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= oddNo; j++) {
				if (j <= i) {
					k = k + 1;
				} else {
					k = k - 1;
				}
				System.out.print(k);
			}
			System.out.println();

			oddNo = oddNo + 2;
			noOfSpaces = noOfSpaces - 1;
		}
	}

}
