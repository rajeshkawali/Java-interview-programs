package com.stream;

import java.util.Arrays;
import java.util.List;
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
		System.out.println("\n---------------------------");
		List<Integer> numbers= Arrays.asList(2,4,6,8);
        int result=numbers.stream().reduce(1,(total,element)-> total+element);
        System.out.println(result);
        System.out.println("\n---------------------------");
        List<String> letters= Arrays.asList("a","b","c","d","e","f");
        String output=letters.stream().reduce("",(String::concat));
        String outputConcatenate=letters.stream().reduce("",(string,element)->string.toUpperCase()+element.toLowerCase());
        System.out.println(output);
        System.out.println(outputConcatenate);
	}

}
/*
 1 2 3 4 5 6 7 8 9 10
---------------------------
55

---------------------------
21

---------------------------
abcdef
ABCDEf
*/