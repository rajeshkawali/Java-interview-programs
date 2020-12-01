package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedStream {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(13);
		al.add(52);
		al.add(53);
		al.add(34);
		al.add(51);
		al.add(16);
		al.add(37);
		al.add(28);
		al.add(19);
		al.add(10);
		System.out.println(al);
		
		//natural sorting using streams sorted()
		List sortedList = al.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		//Coustomize sorting using sorted(a,b)
		List sorted = al.stream().sorted((a,b) -> -a.compareTo(b)).collect(Collectors.toList());
		System.out.println(sorted);
		
	}

}
