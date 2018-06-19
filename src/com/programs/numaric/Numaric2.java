package com.programs.numaric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numaric2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size :");
		int size = Integer.parseInt(rd.readLine());
		int spaces = size;
		for (int i = 1; i <= size; i++) {
			for (int j = spaces; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= size; j++) {
				if (j <= i) {
					System.out.print(" ");
					System.out.print(i);
				}
			}
			System.out.println();
			spaces = spaces - 1;
		}
	}

}
