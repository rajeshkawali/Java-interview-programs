package com.programs.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Size :");
		int size = Integer.parseInt(rd.readLine());

		for (int i = 1; i <= size; i++) {
			int j = 0;
			for (; j <= size - i; ++j) {
				System.out.print(" ");
			}
			
			for (j = 1; j <= i; ++j) {

				System.out.print(j);
			}
			for ( j = j-1; j >1; --j) {

				System.out.print(j-1);
			}
			
			for (; j <= size - i; ++j) {
				System.out.print(" ");
			}
			System.out.println();

		}
	}

}
