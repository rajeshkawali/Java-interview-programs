package com.programs.basicprograms;

public class SortArrayElements {

	public static void main(String[] args) {

		int[] a = { 3, 2, 5, 1, 4, 6, 8, 7 };
		a = sortArray(a);
		for (int ch : a) {
			System.out.print(ch+" ");
		}
	}

	public static int[] sortArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				int t;
				if (a[i] > a[j]) {
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		return a;
	}

}
