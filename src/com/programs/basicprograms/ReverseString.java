package com.programs.basicprograms;

public class ReverseString {
	static String str = "rajesh";

	public static void main(String[] args) {

		String reverse = "";
		String original = "rajesh";
		int length = original.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		System.out.println(reverse);
		System.out.println("--------------------");
		char[] c = original.toCharArray();
		for (int i = length - 1; i >= 0; i--) {
			System.out.print(c[i]);
		}
		System.out.println("\n--------------------");
		String rev = recursiveCall(str);
		System.out.println(rev);
		System.out.println("--------------------");
	}

	static String recursiveCall(String s) {
		if (s.isEmpty()) {
			return s;
		}
		return recursiveCall(s.substring(1)) + s.charAt(0);
	}

}
