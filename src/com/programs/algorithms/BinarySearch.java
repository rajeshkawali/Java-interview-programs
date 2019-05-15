package com.programs.algorithms;

// Java implementation of recursive Binary Search
public class BinarySearch {
	// Returns index of x if it is present in arr[l..r], else return -1
	int binarySearch(int array[], int left, int right, int searchElement) {
		if (right >= left) {
			int middleElement = left + (right - left) / 2;

			// If the element is present at the
			// middle itself
			if (array[middleElement] == searchElement)
				return middleElement;

			// If element is smaller than mid, then
			// it can only be present in left subarray
			if (array[middleElement] > searchElement)
				return binarySearch(array, left, middleElement - 1, searchElement);

			// Else the element can only be present
			// in right subarray
			return binarySearch(array, middleElement + 1, right, searchElement);
		}

		// We reach here when element is not present
		// in array
		return -1;
	}

	// Driver method to test above
	public static void main(String args[]) {
		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 10;
		int result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}
}
