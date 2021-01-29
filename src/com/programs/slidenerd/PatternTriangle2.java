package com.programs.slidenerd;

public class PatternTriangle2 {

	public static void main(String[] args) {

		int size = 7;
		int odd = 1;
		int noOfSpaces = size - 1;
		for (int i = 1; i <= size; i++) {
			for (int j = noOfSpaces; j >= 1; j--) {
				System.out.print(" ");
			}
			int k = 0;
			for (int j = 1; j <= odd; j++) {
				if (j <= i) {
					k = k + 1;
				} else {
					k = k - 1;
				}
				System.out.print(k);
			}
			System.out.println();
			noOfSpaces = noOfSpaces - 1;
			odd = odd + 2;
		}
	}
}
/*
      1
     121
    12321
   1234321
  123454321
 12345654321
1234567654321
 
 */