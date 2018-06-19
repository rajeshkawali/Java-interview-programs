package com.programs.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Size :");
		int size = Integer.parseInt(rd.readLine());

		for (int i = 1; i <= size; i++) {
			for (int j = size; j >= i; j--) {
				if (j <= i) {
					System.out.print(" ");
				} else {
					System.out.print(j);
					// System.out.print(i);
				}
			}
			System.out.println();
		}

	}

}
