package com.programs.basicprograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int n1,n2;
		n1=5; n2=10;
		
		n1 = n1 * n2;
		n2 = n1 / n2;
		n1 = n1 / n2;
		
		System.out.println(n1);
		System.out.println(n2);
		
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		
		System.out.println(n1);
		System.out.println(n2);
		
		
	}

}
