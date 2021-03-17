package com.all;

// A simple Java program 
// to find three elements 
// whose sum is equal to 
// given sum 
import java.io.*;

class GFG {

	// Prints all triplets in
	// arr[] with given sum
	static void findTriplets(int arr[], int n, int sum) {
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == sum) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
					}
				}
			}
		}
	}

	// Driver code
	public static void main(String[] args) {
		int arr[] = { 0, -1, 2, -3, 1 };
		int n = arr.length;
		findTriplets(arr, n, -2);
	}
}