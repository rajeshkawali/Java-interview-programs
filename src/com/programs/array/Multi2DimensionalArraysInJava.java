package com.programs.array;

public class Multi2DimensionalArraysInJava {
	public static void main(String[] args) {
		int[] fisrtElement = { 1, 2, 3 }; // One Dimensional Array
		int[] secondElement = { 4, 5, 6 }; // One Dimensional Array
		int[] thirdElement = { 7, 8, 9 }; // One Dimensional Array
		// Two Dimensional Array
		int[][] twoDimensionalArray = { fisrtElement, secondElement, thirdElement };
		// Printing elements of two dimensional array
		for (int i = 0; i < twoDimensionalArray.length; i++) {
			System.out.print("{");
			for (int j = 0; j < twoDimensionalArray[i].length; j++) {
				
				System.out.print(twoDimensionalArray[i][j] + "\t");
			}
			System.out.print("}");
			System.out.println();
		}
	}
}