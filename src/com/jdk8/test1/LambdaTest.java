package com.jdk8.test1;

import java.util.stream.Stream;

public class LambdaTest {

	public static void main(String[] args) {
		
		
		//String[] arr = { "program", "creek", "is", "a", "java", "site" };
		//Arrays.sort(arr, (m, n) -> Integer.compare(m.length(), n.length()));
		//System.out.println(Arrays.toString(arr));
		
		String[] arr = { "program", "creek", "is", "a", "java", "site" };
		Stream<String> stream = Stream.of(arr);
		stream.forEach(x -> System.out.println(x));


	}
}
