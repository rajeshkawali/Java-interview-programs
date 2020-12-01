package com.stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ReduceStream {

	public static void main(String[] args) {

		//print natural number using IntStream rangeClosed
		IntStream isRange = IntStream.rangeClosed(1, 10); 
		isRange.forEach((x) ->System.out.print(" "+x));
		System.out.println("\n---------------------------");
		//sum of natural numbers
		OptionalInt isRangeReduce = IntStream.rangeClosed(1, 10).reduce((s1,s2) -> s1+s2); 
		System.out.println(isRangeReduce.getAsInt());
	}

}
/*
 1 2 3 4 5 6 7 8 9 10
---------------------------
55
*/