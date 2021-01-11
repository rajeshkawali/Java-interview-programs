package com.programs.basicprograms;

public class DiamondPattern2 {

	public static void main(String[] args) {

		int size = 9;
		int oddNo = 1;
		int noOfSpace = size / 2;
		for (int i = 1; i <= size; i++) {
			for (int j = noOfSpace; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= oddNo; j++) {
				System.out.print("*");
			}
			System.out.println();
			if (i < size / 2 + 1) {
				oddNo = oddNo + 2;
				noOfSpace = noOfSpace - 1;
			} else {
				oddNo = oddNo - 2;
				noOfSpace = noOfSpace + 1;
			}
		}
	}
}
/*
 
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 
 */
