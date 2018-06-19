package com.programs.array;

public class ArrayBasics {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int[] a1 = { 11, 22, 33 };
		int[] a2 = { 44, 55, 66 };
		int[] a3 = { 77, 88, 99 };

		int[][] b1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] b2 = { { 11, 21, 31 }, { 41, 51, 61 }, { 71, 81, 91 } };
		int[][] b3 = { { 12, 22, 32 }, { 42, 52, 62 }, { 72, 82, 92 } };

		int[][][] c1 = { b1, b2, b3 };
		int[][][] c2 = { b1, b2, b3 };
		int[][][] c3 = { b1, b2, b3 };

		int[][][][] d1 = { c1, c2, c3 };

		System.out.println("\n---------1Dimention------------");
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] + ",");
		}
		System.out.println("\n---------2Dimention------------");
		for (int i = 0; i < b1.length; i++) {
			for (int j = 0; j < b1[i].length; j++) {
				System.out.print(b1[i][j] + ",");
			}
		}
		System.out.println("\n---------3Dimention------------");
		for (int i = 0; i < c1.length; i++) {
			for (int j = 0; j < c1[i].length; j++) {
				for (int k = 0; k < c1[i][j].length; k++) {
					System.out.print(c1[i][j][k] + ",");
				}
			}
		}
		System.out.println("\n---------4Dimention------------");
		for (int i = 0; i < d1.length; i++) {
			for (int j = 0; j < d1[i].length; j++) {
				for (int k = 0; k < d1[i][j].length; k++) {
					for (int l = 0; l < d1[i][j][k].length; l++) {
						System.out.print(d1[i][j][k][l] + ",");
					}
				}
			}
		}
	}
}
