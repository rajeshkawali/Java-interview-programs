package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapStream {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		List<Integer> intValues = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(intValues);
		
		// For each input it produce one output in map(one to one)
		List<Integer> values1 = intValues.stream().map(x -> x).collect(Collectors.toList());
		System.out.println(values1);
		
		// For each input it produce one output in map
		List values2 = intValues.stream().map(x -> Arrays.asList(x, x + 1)).collect(Collectors.toList());
		System.out.println(values2);
		
		// For each input it produce zero or more output in flatmap
		List<Integer> values3 =intValues.stream().flatMap(x->Stream.of(x,x+1,x+2)).collect(Collectors.toList());
		System.out.println(values3);
	}
}
/*
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[[1, 2], [2, 3], [3, 4], [4, 5], [5, 6], [6, 7], [7, 8], [8, 9], [9, 10], [10, 11]]
[1, 2, 3, 2, 3, 4, 3, 4, 5, 4, 5, 6, 5, 6, 7, 6, 7, 8, 7, 8, 9, 8, 9, 10, 9, 10, 11, 10, 11, 12]
 */
