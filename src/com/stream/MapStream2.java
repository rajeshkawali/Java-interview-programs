package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStream2 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		List<Integer> intValues = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(intValues);

		// For each input it produce one output in map(one to one)
		List<Integer> values1 = intValues.stream().map(x -> x).collect(Collectors.toList());
		System.out.println(values1);

		// For each input it produce one output in map inner list
		List values2 = intValues.stream().map(x -> Arrays.asList(x, x + 10)).collect(Collectors.toList());
		System.out.println(values2);
	}
}
/*
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[[1, 11], [2, 12], [3, 13], [4, 14], [5, 15], [6, 16], [7, 17], [8, 18], [9, 19], [10, 20]]
*/
