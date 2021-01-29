package com.programs.slidenerd;

public class Pattern3 {

	public static void main(String[] args) {

		int size = 5;
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
/*
 
*****
 ****
  ***
   **
    *

 */