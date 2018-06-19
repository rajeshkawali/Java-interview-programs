package com.programs.array;
public class Dimention2JaggedArraysInJava
{
    public static void main(String[] args)
    {
        //Jagged Two Dimensional Array, No need to mention the size of it's contained arrays
        int[][] jaggedTwoDimensionalArray = new int[5][];
        //One Dimensional Array of lenghth 3
        int[] OneDimensionalArray1 = {1, 2, 3};
        //One Dimensional Array of lenghth 4
        int[] oneDimensionalArray2 = {4, 5, 6, 7};
        //One Dimensional Array of lenghth 5
        int[] oneDimensionalArray3 = {8, 9, 10, 11, 12};
        //Initializing elements of Jagged Array
        jaggedTwoDimensionalArray[0] = OneDimensionalArray1;
        jaggedTwoDimensionalArray[1] = oneDimensionalArray2;
        jaggedTwoDimensionalArray[2] = oneDimensionalArray3;
        
        for (int i = 0; i < jaggedTwoDimensionalArray.length; i++) {
			System.out.print("{");
			for (int j = 0; j < jaggedTwoDimensionalArray[i].length; j++) {
				
				System.out.print(jaggedTwoDimensionalArray[i][j] + "\t");
			}
			System.out.print("}");
			System.out.println();
		}
    }
}