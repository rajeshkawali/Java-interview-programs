package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OfArraysStream {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		//Arrays.stream()
		//Stream.of()
		
		int a[] = {1,2,3,4,5};
		IntStream is =Arrays.stream(a);
		is.forEach(System.out::print);
		System.out.println("\n------------------------------");
		
		//IntStream isRange = IntStream.range(1, 5); //1234
		IntStream isRange = IntStream.rangeClosed(1, 5); //12345
		isRange.forEach(System.out::print);
		System.out.println("\n------------------------------");
		Stream s1 = Stream.of(1,2,5,4,3);
		Stream s2 = Stream.of(6,7,8);
		//Concat two streams
		Stream s3 = Stream.concat(s1,s2);
		s3.forEach(System.out::print);
		//Sorted order and distinct of concated streams : 12345678
		//s3.distinct().sorted().forEach(System.out::print);
	}

}
/*
12345
------------------------------
12345
------------------------------
12543678
*/