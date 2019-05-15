package com.jdk8.test3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class WaysOfCreatingStream {

	public static void main(String[] args) {

		// 1. From Arrays
		String[] arr = { "program", "creek", "program", "creek", "java", "web", "program" };
		Stream<String> stream = Stream.of(arr);

		stream = Stream.of("program", "creek", "program", "creek", "java", "web", "program");

		String[] stringArr = { "a", "b", "c", "d" };
		Stream<String> stream1 = Arrays.stream(stringArr);
		System.out.println(stream1);
		
		// 2. From Collection
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("php");
		list.add("python");
		stream = list.stream();

		// 3.using generate()
		Stream<String> stream2 = Stream.generate(() -> "test").limit(10);
		String[] strArr = stream2.toArray(String[]::new);
		System.out.println(Arrays.toString(strArr));
		
		//4. Use Stream.iterate()
		// iterate()
		Stream<BigInteger> bigIntStream = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE)).limit(10);
		BigInteger[] bigIntArr = bigIntStream.toArray(BigInteger[]::new);
		System.out.println(Arrays.toString(bigIntArr));
		
		// 5. stream method from APIs
		String sentence = "Program creek is a Java site.";
		Stream<String> wordStream = Pattern.compile("\\W").splitAsStream(sentence);
		String[] wordArr = wordStream.toArray(String[]::new);
		System.out.println(Arrays.toString(wordArr));

	}

}
