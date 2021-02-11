package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekSkipStreams {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("A32","A44","C12","A12","B32","A24","C42","A15","E62","a132","B2","a12","b41");
		System.out.println(strings);
		
		//filter only start with "A"
		List<String> val1 = strings.stream().filter(x->x.startsWith("A")).collect(Collectors.toList());
		val1.forEach(System.out::println);
		System.out.println("----------------");
		//filter only start with "A" , sort and distinct
		List<String> val2 =strings.stream().filter(x->x.startsWith("A")).filter(x->x.startsWith("A")).sorted().distinct().collect(Collectors.toList());
		System.out.println(val2);
		System.out.println("----------------");
		//filter only start with "A" , sort ,distinct and skip first 2 values
		List<String> val3 =strings.stream().filter(x->x.startsWith("A")).filter(x->x.startsWith("A")).sorted().distinct().skip(2).collect(Collectors.toList());
		System.out.println(val3);
		System.out.println("----------------");
		//filter only start with "A" , sort ,distinct and skip first 2 values. and print values after filter(Peek used to debug stream)
		List<String> val4 =strings.stream().filter(x->x.startsWith("A")).filter(x->x.startsWith("A")).peek(System.out::println).sorted().distinct().collect(Collectors.toList());
		System.out.println("----------------");
		System.out.println(val4);
		System.out.println("----------------");
		Stream.of("one", "two", "three", "four")
        .filter(e -> e.length() > 3)
        .peek(e -> System.out.println("Filtered value: " + e))//This method exists mainly to support debugging
        .map(String::toUpperCase)
        .peek(e -> System.out.println("Mapped value: " + e))
        .collect(Collectors.toList());
	}

}

/*
[A32, A44, C12, A12, B32, A24, C42, A15, E62, a132, B2, a12, b41]
A32
A44
A12
A24
A15
----------------
[A12, A15, A24, A32, A44]
----------------
[A24, A32, A44]
----------------
A32
A44
A12
A24
A15
----------------
[A12, A15, A24, A32, A44]
----------------
Filtered value: three
Mapped value: THREE
Filtered value: four
Mapped value: FOUR
*/