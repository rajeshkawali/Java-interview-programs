package com.programs.interviewprograms;
// Java Program To Check Whether The Given Number Is Binary Or Not.
public class MainClass {
	static void isBinaryOrNot(int number) {
		boolean isBinary = true;
		int copyOfNumber = number;
		while (copyOfNumber != 0) {
			int temp = copyOfNumber % 10; // Gives last digit of the number
			if (temp > 1) {
				System.out.println( " if (temp > 1)=="+temp);
				isBinary = false;
				break;
			} else {
				System.out.println(number + " is a binary number=="+temp);
				copyOfNumber = copyOfNumber / 10; // Removes last digit from the number
			}
		}

		if (isBinary) {
			System.out.println(number + " is a binary number");
		} else {
			System.out.println(number + " is not a binary number");
		}
	}

	public static void main(String[] args) {
		//isBinaryOrNot(128956);
		isBinaryOrNot((101110));
	//	isBinaryOrNot((42578));
		//isBinaryOrNot((10110101));
	}
}