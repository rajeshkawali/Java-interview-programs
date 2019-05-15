package com.programs.matrix;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the row :");
		int row = sc.nextInt();
		System.out.println("Please Enter the col :");
		int col = sc.nextInt();
		int matrix[][] = new int[row][col];
		System.out.println("Please Enter the Matrix values :");
		for(int i = 0;i<row;i++) {
			for(int j =0;j<col;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("You Entered Matrix values are...");
		for(int i = 0;i<row;i++) {
			for(int j =0;j<col;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
