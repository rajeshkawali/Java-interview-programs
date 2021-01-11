package com.programs.basicprograms;

// String to ASCII values
public class StingToASCII {
	public static void main(String[] args) {
		String str = "ABCDE";
		char c[] = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.println((int) c[i]);
		}
		
		System.out.println("------------------");
		char a = 'A';
		do {
			System.out.println((int)a++);
		}while(a<'Z');

	}
}
