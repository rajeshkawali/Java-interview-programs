package com.programs.slidenerd;

public class PatternTriangle {

	public static void main(String[] args) {

		int size = 7;
		int noOfSpaces = size - 1;
		for (int i = 1; i <= size; i++) {
			for (int j = noOfSpaces; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
			noOfSpaces = noOfSpaces - 1;
		}
	}
}
/*

      1 
     2 2 
    3 3 3 
   4 4 4 4 
  5 5 5 5 5 
 6 6 6 6 6 6 
7 7 7 7 7 7 7 

*/