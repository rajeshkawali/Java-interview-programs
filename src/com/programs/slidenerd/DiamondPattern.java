package com.programs.slidenerd;

public class DiamondPattern {

	public static void main(String[] args) {

		int size = 7;
		int odd = 1;
		int noOfSpaces = 3;
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= noOfSpaces; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= odd; j++) {
				System.out.print("*");
			}
			System.out.println();
			if (i < (size / 2) + 1) {
				odd = odd + 2;
				noOfSpaces = noOfSpaces - 1;
			} else {
				odd = odd - 2;
				noOfSpaces = noOfSpaces + 1;
			}
		}
	}
}
/*

   *
  ***
 *****
*******
 *****
  ***
   *

 */
