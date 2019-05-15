package com.programs.matrix;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the row :");
		int row = sc.nextInt();
		System.out.println("Please Enter the col :");
		int col = sc.nextInt();
		int matrix1[][] = new int[row][col];
		int matrix2[][] = new int[row][col];
		int sum[][] = new int[row][col];
		System.out.println("Please Enter the Matrix1 values :");
		for(int i = 0;i<row;i++) {
			for(int j =0;j<col;j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Please Enter the Matrix2 values :");
		for(int i = 0;i<row;i++) {
			for(int j =0;j<col;j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("You Entered Matrix1 values are...");
		for(int i = 0;i<row;i++) {
			for(int j =0;j<col;j++) {
				System.out.print(matrix1[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("You Entered Matrix2 values are...");
		for(int i = 0;i<row;i++) {
			for(int j =0;j<col;j++) {
				System.out.print(matrix2[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Sum of Matrix1 and Matrix2 are...");
		for(int i = 0;i<row;i++) {
			for(int j =0;j<col;j++) {
				System.out.print(matrix1[i][j] + matrix2[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
