package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class FindAverageFromListMain {
	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 100, 24, 13, 44, 114, 200, 40, 112 };
		List<Integer> list = Arrays.asList(arr);
		OptionalDouble average = list.stream().mapToInt(n -> n * n).filter(n -> n > 10000).average();

		if (average.isPresent())
			System.out.println(average.getAsDouble());

	}
}