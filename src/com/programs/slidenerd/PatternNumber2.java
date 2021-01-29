package com.programs.slidenerd;

public class PatternNumber2 {

	public static void main(String[] args) {

		int size = 5;
		for (int i = 1; i <= size; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
/*

1
21
321
4321
54321
*/