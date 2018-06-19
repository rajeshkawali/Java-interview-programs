package com.programs.interviewPrograms;

import java.util.Arrays;

public class SortArrayElements {

	public static void main(String[] args) {
		int[] inNumber = { 3, 2, 5, 4, 1 };
		System.out.print("Ascending Order:");
		int[] a = sortingArrayElements(inNumber);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
	public static int[] sortingArrayElements(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] > array[j]) {
					
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}
