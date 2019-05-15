package com.jdk8.test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectStream {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("php");
		list.add("python");
		list.add("Springn MVC");
		Stream<String> wordStream = list.stream();

		Stream<Integer> lengthStream = wordStream.map(s -> s.length());
		
		Integer[] lenArr = lengthStream.toArray(Integer[]::new);
		System.out.println(Arrays.toString(lenArr));

		//String str = wordStream.filter(data -> data.equals("java")).findAny().orElse(null);
		//List<Integer> intList = lengthStream.collect(Collectors.toList());
		//Set<Integer> intSet = lengthStream.collect(Collectors.toSet());
		//TreeSet<Integer> intTree = lengthStream.collect(Collectors.toCollection(TreeSet::new));

	}

}
