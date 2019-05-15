package com.programs.algorithms;

public class ReverseWordsInString {

	public static void main(String[] args) {

		String str = "Diebold Office In Mumbai";
		char[] ch = str.toCharArray();
		
		reverseWords(ch);
		
	}

	public static String reverseWords(char[] s) {
		int i = 0;
		String str = "";
		for (int j = 0; j < s.length; j++) {
			if (s[j] == ' ') {
				reverse(s, i, j - 1);
				i = j + 1;
			}
		}
		reverse(s, i, s.length - 1);
		reverse(s, 0, s.length - 1);
		return str;
	}

	public static void reverse(char[] s, int i, int j) {
		while (i < j) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++;
			j--;
		}
	}
}
