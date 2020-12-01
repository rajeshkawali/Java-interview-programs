package com.stream;

import java.util.Arrays;
import java.util.List;

public class MinMaxStreams {

	public static void main(String[] args) {
		// List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		List<Integer> intValues = Arrays.asList(22, 3, 52, 31, 5, 13, 62, 31, 27);
		System.out.println("List: " + intValues);
		
		//Find min Value
		int minValue = intValues.stream().min((x,y) ->x.compareTo(y)).get();
		System.out.println("List:minValue: " + minValue);
		
		//Find Max value
		int maxValue = intValues.stream().max((x,y) ->x.compareTo(y)).get();
		System.out.println("List:maxValue: " + maxValue);
		
		//using Static method referencing
		int maxValueWithStatic = intValues.stream().max(MinMaxStreams::toSort).get();
		System.out.println("List:maxValueWithStatic: " + maxValueWithStatic);

	}
	
	public static int toSort(Integer a, Integer b) {
		return a.compareTo(b);
	}
}
/*
List: [22, 3, 52, 31, 5, 13, 62, 31, 27]
List:minValue: 3
List:maxValue: 62
List:maxValueWithStatic: 62
*/
