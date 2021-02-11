package com.stream;

import java.util.stream.Stream;

public class SkipAndLimit {

	public static void main(String[] args) {
		skipDemo();
		System.out.println("---------------------");
		limitDemo();
	}

	private static void skipDemo() {
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(i -> i % 2 == 0).skip(2)
				.forEach(i -> System.out.println(i + " "));

	}

	private static void limitDemo() {
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(i -> i % 2 == 0).limit(2)
				.forEach(i -> System.out.println(i + " "));

	}
}
/*

6 
8 
10 
---------------------
2 
4 

*/