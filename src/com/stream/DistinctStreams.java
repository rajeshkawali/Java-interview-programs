package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DistinctStreams {

	public static void main(String[] args) {

		List<Integer> intValues = Arrays.asList(22, 3, 52, 31, 5, 13, 3, 52, 62, 31, 27, 3, 4, 5);
		System.out.println("List: " + intValues);

		//Sorted order
		List<Integer> sortVal = intValues.stream().sorted().collect(Collectors.toList());
		System.out.println(sortVal);
		
		//Sorted order with distinct(unique values)
		List<Integer> distinctSortVal = intValues.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println(distinctSortVal);
		
		//Sorted order with distinct(unique values) and only max even number 
		Integer distinctSortMaxVal = intValues.stream().sorted().distinct().filter(x-> x % 2 == 0).max((x,y)->x.compareTo(y)).get();
		System.out.println("distinctSortMaxVal:"+distinctSortMaxVal);

	}

}
/*
List: [22, 3, 52, 31, 5, 13, 3, 52, 62, 31, 27, 3, 4, 5]
[3, 3, 3, 4, 5, 5, 13, 22, 27, 31, 31, 52, 52, 62]
[3, 4, 5, 13, 22, 27, 31, 52, 62]
distinctSortMaxVal:62
*/