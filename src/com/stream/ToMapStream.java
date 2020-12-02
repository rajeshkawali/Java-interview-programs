package com.stream;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ToMapStream {

	public static void main(String[] args) {

		Set<Integer> number = new HashSet<>();
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		number.add(6);
		System.out.println(number);
		
		//Stream returns Map number
		Map<Integer,Integer> values = number.stream().collect(Collectors.toMap(x->x, y->y*100));
		System.out.println(values);
		
		Map<Integer,String> val = new HashMap<>();
		val.put(1, "mumbai");
		val.put(2, "delhi");
		val.put(3, "bangalore");
		val.put(4, "hydarabad");
		val.put(5, "bihar");
		System.out.println(val.getOrDefault(6, "Mahesh"));
		System.out.println(val);
	}

}
/*
[1, 2, 3, 4, 5, 6]
{1=100, 2=200, 3=300, 4=400, 5=500, 6=600}
Mahesh
{1=mumbai, 2=delhi, 3=bangalore, 4=hydarabad, 5=bihar}
*/