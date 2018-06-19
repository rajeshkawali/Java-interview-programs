package com.programs.interviewprograms;

public class ArmstrongNumberOrNot {
	static void checkArmstrongNumber(int number) {
		int copyOfNumber = number;
		int noOfDigits = String.valueOf(number).length();
		int sum = 0;
		while (copyOfNumber != 0) {
			int lastDigit = copyOfNumber % 10;
			int lastDigitToThePowerOfNoOfDigits = 1;
			for (int i = 0; i < noOfDigits; i++) {
				lastDigitToThePowerOfNoOfDigits = lastDigitToThePowerOfNoOfDigits * lastDigit;
			}
			sum = sum + lastDigitToThePowerOfNoOfDigits;
			copyOfNumber = copyOfNumber / 10;
		}
		if (sum == number) {
			System.out.println(number + " is an armstrong number");
		} else {
			System.out.println(number + " is not an armstrong number");
		}
	}
	public static void main(String[] args) {
		checkArmstrongNumber(153);
		checkArmstrongNumber(371);
		checkArmstrongNumber(9474);
		checkArmstrongNumber(54748);
		checkArmstrongNumber(407);
		checkArmstrongNumber(1674);
	}
}