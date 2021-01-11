package com.programs.basicprograms;

public class DiamondPattern {

	public static void main(String[] args) {

		int number = 7;
		int oddNo =1;
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= oddNo; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<number/2+1) {
				oddNo = oddNo+2;
			}else {
				oddNo = oddNo-2;
			}
		}
		
	}

}
