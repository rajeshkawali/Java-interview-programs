package com.programs.important;

import java.util.Scanner;

public class NumbersToWordsConversion {

	public static void main(String[] args) {

		int number = 0;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the number between 0 and 999 OR type -1 to exit: ");
		number = scanner.nextInt();
		while (number != -1) {
			if (number >= 0 && number <= 999) {
				if (number == 0) {
					System.out.print("\tZERO");
				} else {
					System.out.print("\t");
					numbersToWordsConversion(((number / 100) % 10), " HUNDRED");
					//System.out.println("modulus1="+(number / 100) % 10);
					numbersToWordsConversion((number % 100), " ");
					//System.out.println("modulus2="+(number % 100));
					//System.out.println("modulus3="+(number % 10));
				}

			} else {
				System.out.print("NUMBER OUT OF RANGE");
			}
			System.out.print("\nPlease type a number between 0 and 999 OR type -1 to exit:  ");
			number = scanner.nextInt();
		}
	}

	public static void numbersToWordsConversion(int num, String val) {
		String ones[] = { " ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN"," ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN"," NINETEEN" };
		String tens[] = { " ", " ", " TWENTY", " THIRTY", " FOURTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY"," NINETY" };
		if (num > 19) {
			System.out.print(tens[num / 10] + " " + ones[num % 10]);
		} else {
			System.out.print(ones[num]);
		}
		if (num > 0) {
			System.out.print(val);
		}
	}

}
