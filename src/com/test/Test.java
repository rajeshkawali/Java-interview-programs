package com.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number Of Rows");
		int rows = sc.nextInt();
		System.out.println("Enter The Number Of Columns");
		int cols = sc.nextInt();
		int[][] matrix = new int[rows][cols];
		
		System.out.println("Enter The Data For Matrix :");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("Your Matrix is :");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				//System.out.print(matrix[i][j] + " ");
				System.out.print(j+ " ");
				System.out.print(i + " ");
				
			}
			System.out.println();
		}
	}
}
