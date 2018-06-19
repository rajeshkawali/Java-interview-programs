package com.programs.numaric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numaric3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size :");
		int size = Integer.parseInt(rd.readLine());
		int spaces = size;
		int odd = 1;
		for (int i = 1; i <= size; i++) {
			int k = 0;
			for(int j=spaces;j>=1;j--){
				System.out.print(" ");
			}
			for (int j = 1; j <= odd; j++) {
				if (j <= i) {
					k = k + 1;
				} else {
					k = k - 1;
				}
				System.out.print(k);
			}
			System.out.println();
			odd = odd + 2;
			spaces=spaces-1;
		}

	}

}
