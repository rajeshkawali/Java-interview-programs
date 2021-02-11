package com.stream.employee;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
	public static void main(String[] args) {
		String string = "hsejar";
		// 1st way
		System.out.println(reverseUsingLambda(string));
		// 2nd way
		System.out.println(reverse(string));
		// 3rd way
		ReverseStringUsingLambda reverse = (String str) -> {
			StringBuilder result = new StringBuilder();
			String[] words = str.split("");
			for (int i = words.length - 1; i >= 0; i--) {
				result.append(words[i]);
			}
			System.out.println("using lambda expression::" + result);
		};
		reverse.reverseString("hello");
	}

	// reverse the string using traditional way
	private static String reverseUsingLambda(String string) {
		StringBuilder reverseString = new StringBuilder();
		String[] words = string.split("");
		for (int i = words.length - 1; i >= 0; i--) {
			reverseString.append(words[i]);
		}
		return reverseString.toString();
	}

	// reverse the string using stream
	private static String reverse(String string) {
		String reverseString = Stream.of(string).map(word -> new StringBuilder(word).reverse())
				.collect(Collectors.joining(""));
		return reverseString;
	}

	public interface ReverseStringUsingLambda {
		public void reverseString(String s);
	}
}
/*
rajesh
rajesh
using lambda expression::olleh
*/