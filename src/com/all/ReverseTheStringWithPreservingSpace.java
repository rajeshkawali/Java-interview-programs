package com.all;

public class ReverseTheStringWithPreservingSpace {
	static void reverseString(String inputString) {
		// Converting inputString to char array 'inputStringArray'
		char[] inputStringArray = inputString.toCharArray();
		// Defining a new char array 'resultArray' with same size as inputStringArray
		char[] resultArray = new char[inputStringArray.length];
		// First for loop :
		// For every space in the 'inputStringArray',
		// we insert spaces in the 'resultArray' at the corresponding positions
		for (int i = 0; i < inputStringArray.length; i++) {
			if (inputStringArray[i] == ' ') {
				resultArray[i] = ' ';
			}
		}
		// Initializing 'j' with length of resultArray
		int j = resultArray.length - 1;
		// Second for loop :
		// we copy every non-space character of inputStringArray
		// from first to last at 'j' position of resultArray
		for (int i = 0; i < inputStringArray.length; i++) {
			if (inputStringArray[i] != ' ') {
				// If resultArray already has space at index j then decrementing 'j'
				if (resultArray[j] == ' ') {
					j--;
				}
				resultArray[j] = inputStringArray[i];
				j--;
			}
		}
		System.out.println(inputString + " ---> " + String.valueOf(resultArray));
	}

	public static void main(String[] args) {
		reverseString("I Am Not String");
		reverseString("JAVA JSP ANDROID");
		reverseString("1 22 333 4444 55555");
	}
}