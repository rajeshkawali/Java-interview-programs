package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapStream2 {

	public static void main(String[] args) {

		List<Integer> intValues = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(intValues);

		// For each input it produce zero or more output in flatmap
		List<Integer> values3 = intValues.stream().flatMap(x -> {
			if (x % 2 == 0) {
				return Stream.empty();
			} else {
				return Stream.of(x, x + 1, x + 2);
			}
		}).collect(Collectors.toList());
		System.out.println(values3);
	}
}
/*
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9, 10, 11]
*/
