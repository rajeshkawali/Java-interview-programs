package com.jdk8.test4;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConcatStreams {

	public static void main(String[] args) {
		
		
		String[] arr1 = { "a", "b", "c", "d" };
		String[] arr2 = { "e", "f", "g" };
		Stream<String> stream1 = Stream.of(arr1);
		Stream<String> stream2 = Stream.of(arr2);
		 
		Stream<String> stream3 = Stream.concat(stream1, stream2);
		String[] arr = stream3.toArray(String[]::new);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("-------------------------------------------");
		String[] arr11 = { "abc", "bcd", "cdef", "defgh" };
		String[] arr22 = { "af", "fg", "gh" };
		Stream<String> stream11 = Stream.of(arr11);
		Stream<String> stream22 = Stream.of(arr22);
		 
		Stream<String> stream33 = Stream.concat(stream11.filter(x -> x.length()<4), stream22);
		String[] arr33 = stream33.toArray(String[]::new);
		System.out.println(Arrays.toString(arr33));
		
		System.out.println("-------------------------------------------");
		String[] arr111 = { "a", "b", "c", "d" };
		String[] arr222 = { "e", "f", "g" };
		String[] arr333 = { "h", "i", "j" };
		Stream<String> stream111 = Stream.of(arr111);
		Stream<String> stream222 = Stream.of(arr222);
		Stream<String> stream333 = Stream.of(arr333);
		 
		Stream<String> stream = Stream.concat(Stream.concat(stream111, stream222), stream333);
		String[] arr4 = stream.toArray(String[]::new);
		System.out.println(Arrays.toString(arr4));
		System.out.println("-------------------------------------------");
		String[] arr15 = { "a", "b", "c", "d" };
		String[] arr25 = { "e", "f", "g" };
		String[] arr35 = { "h", "i", "j" };
		Stream<String> stream15 = Stream.of(arr15);
		Stream<String> stream25 = Stream.of(arr25);
		Stream<String> stream35 = Stream.of(arr35);
		 
		//use Stream.of(T... values)
		Stream<String> stream5 = Stream.of(stream15, stream25, stream35).flatMap(x -> x);
		 
		String[] arr5 = stream5.toArray(String[]::new);
		System.out.println(Arrays.toString(arr5));

	}

}
