package com.programs.important;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeriesCalculation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Number :");
		int number = Integer.parseInt(rd.readLine());
		// sum= (1/1)^1+(1/2)^2+(1/3)^3+(1/4)^4+....

		double sum=0.0;
		for (int i = 1; i <= number; i++) {
			double currentTerm=Math.pow((double)1/i, i);
			sum=sum+currentTerm;
		}
		System.out.println(sum);
	}

}
