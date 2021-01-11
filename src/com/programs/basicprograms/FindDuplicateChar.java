package com.programs.basicprograms;

public class FindDuplicateChar {

	public static void main(String[] args) {

		String str[] = { "ab", "bc", "ab", "db", "bc", "be" };
		for (int i = 0; i < str.length - 1; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					System.out.println(str[j]);
				}
			}
		}

	}

}
