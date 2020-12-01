package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapStream {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		// Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		System.out.println(al);
		
		// Output: [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
		List result = al.stream().map(i -> i + i).collect(Collectors.toList());
		System.out.println(result);
		System.out.println("--------------------------------------");
		ArrayList<String> city = new ArrayList<String>();
		city.add("Mumbai");
		city.add("Delhi");
		city.add("Bangalore");
		city.add("Borivali");
		
		//find the length of each city
		List cityLength = city.stream().map(str -> str.length()).collect(Collectors.toList());
		System.out.println(cityLength);
		
		//Find the city who's length is greater than 8
		List cityLen = city.stream().filter(x -> x.length() > 8).collect(Collectors.toList());
		System.out.println(cityLen);
		
		//Sort out the length of the city which is more than 6 length
		List cityLengthGT6 = city.stream().map(str -> str.length()).filter(x -> x > 6).collect(Collectors.toList());
		System.out.println(cityLengthGT6);
		
		//Count the number of city who's length is greater than 5
		long cityLeng = city.stream().filter(x -> x.length() > 5).count();
		System.out.println(cityLeng);
	}
}
