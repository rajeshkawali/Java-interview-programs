package com.programs.array;

public class Array2D {

	public static void main(String[] args) {

		// int[][] i = new int[4][4];
		int[][] i = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 },{ 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		System.out.println(i[0][0]);
		System.out.println(i[0][1]);
		System.out.println(i[0][2]);
		System.out.println(i[0][3]);
		System.out.println(i[1][0]);
		System.out.println(i[1][1]);
		System.out.println(i[1][2]);
		System.out.println(i[1][3]);
		System.out.println(i[2][0]);
		System.out.println(i[2][1]);
		System.out.println(i[2][2]);
		System.out.println(i[2][3]);
		System.out.println(i[3][0]);
		System.out.println(i[3][1]);
		System.out.println(i[3][2]);
		System.out.println(i[3][3]);
		System.out.println("----------------------------------");
		for (int j = 0; j < i.length; j++) {
			//System.out.print("{"+i.length+"}");
			for (int k = 0; k < i[j].length; k++) {
				//System.out.print("{"+i[j].length+"}");
				System.out.print("("+i[j][k]+"),");
			}
		}

	}

}
