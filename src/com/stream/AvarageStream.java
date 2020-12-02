package com.stream;

import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.Set;
import java.util.stream.Collectors;

public class AvarageStream {

	public static void main(String[] args) {

		Set<Integer> number = new HashSet<>();
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		number.add(6);
		
		//3.5
		System.out.println(number.stream().collect(Collectors.averagingInt(x->x)));
		
		//IntSummaryStatistics{count=6, sum=21, min=1, average=3.500000, max=6}
		IntSummaryStatistics val = number.stream().collect(Collectors.summarizingInt(x->x));
		System.out.println(val);
	}

}
