package com.programs.slidenerd;

public class SeriesMath {
	// (1/1)^1+(1/2)^2+(1/3)^3+(1/4)^4....
	public static void main(String[] args) {
		int no = 3;
		double sum = 0;
		for (int i = 0; i <= no; i++) {
			double currentTerm = Math.pow((double) 1 / i, i);
			sum = sum + currentTerm;
		}
		System.out.println(sum);
	}
}
