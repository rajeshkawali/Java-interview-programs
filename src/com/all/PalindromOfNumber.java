package com.all;

public class PalindromOfNumber {

	public static void main(String[] args) {

		int number = 234;
		int original = number;
		String sum = "";
		int result;
		while (number > 0) {
			result = number % 10;
			sum = sum + result;
			number = number / 10;
		}
		System.out.println(Integer.parseInt(sum)==original);
	}

}
