package com.programs.algorithms;

public class LinearSearch {

	public static void main(String[] args) {
		int val[] = {2,5,3,2,6,8,4,9,7};
		int len = val.length;
		int elem = 9;
		int result = search(val,len,elem);
		System.out.println(result);
		
	}
	// This function returns index of element x in arr[]
	public static int search(int arr[], int n, int x) {
		for (int i = 0; i < n; i++) {
			// Return the index of the element if the element
			// is found
			if (arr[i] == x)
				return i;
		}

		// return -1 if the element is not found
		return -1;
	}
}