package com.programs.numaric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numaric6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size :");
		int size = Integer.parseInt(rd.readLine());
		int odd = 1;
		int spaces = size;
		int start = 0;
		for (int i = 1; i <= size; i++) {
			for (int j = spaces; j >= 1; j--) {
				System.out.print(" ");
			}
			if (i < size) {
				start = i;
			} else {
				start = size - i;
			}
			for (int j = 1; j <= odd; j++) {
				int mid = spaces / 2 + 1;
				System.out.print(start);
				if (j < mid) {
					start--;
				} else {
					start++;
				}
			}
			System.out.println();
			if (i < size / 2+1) {
				odd = odd + 2;
				spaces = spaces - 1;
			} else {
				odd = odd - 2;
				spaces = spaces + 1;
			}
		}
	}
}
/*
Enter the size :9
         1
        210
       32101
      4321234
     543456789
      6543456
       76545
        876
         0
*/