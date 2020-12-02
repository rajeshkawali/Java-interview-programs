package com.stream;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ToSetStream {

	public static void main(String[] args) {
		Set<Integer> number = new HashSet<>();
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		number.add(6);
		System.out.println(number);
		
		//Stream returns Set which is greater than 3 number
		Set<Integer> Values = number.stream().filter(x->x>3).collect(Collectors.toSet());
		System.out.println(Values);
	}

}
/*
[1, 2, 3, 4, 5, 6]
[4, 5, 6]
 */
