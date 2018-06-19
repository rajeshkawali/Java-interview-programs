package com.programs.important;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumToWord {
	public void numberToword(int n, String ch) {
		//System.out.println("  number="+n);
		String one[] = { " ", " one", " two", " three", " four", " five", " six", " seven", " eight", " Nine", " ten",
				" eleven", " twelve", " thirteen", " fourteen", "fifteen", " sixteen", " seventeen", " eighteen"," nineteen" };
		String ten[] = { " ", " ", " twenty", " thirty", " forty", " fifty", " sixty", "seventy", " eighty"," ninety" };
		if (n > 19) {
			System.out.print(ten[n / 10] + " " + one[n % 10]);
		} else {
			System.out.print(one[n]);
		}
		if (n > 0) {
			System.out.print(ch);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = 0;
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter an integer number: ");
		n = Integer.parseInt(rd.readLine());
		if (n <= 0) {
			System.out.print("Enter numbers greater than 0");
		} else {
			NumToWord a = new NumToWord();
			//System.out.print("After conversion number in words is :");
			a.numberToword((n / 1000000000), " Hundred");
			//System.out.println("1=="+(n / 1000000000));
			a.numberToword(((n / 10000000) % 100), " crore");
			//System.out.println("2=="+((n / 10000000) % 100));
			a.numberToword(((n / 100000) % 100), " lakh");
			//System.out.println("3=="+((n / 100000) % 100));
			a.numberToword(((n / 1000) % 100), " thousand");
			//System.out.println("4=="+((n / 1000) % 100));
			a.numberToword(((n / 100) % 10), " hundred");
			//System.out.println("5=="+((n / 100) % 10));
			a.numberToword((n % 100), " ");
			//System.out.println("6=="+(n % 100));
		}
	}
}
