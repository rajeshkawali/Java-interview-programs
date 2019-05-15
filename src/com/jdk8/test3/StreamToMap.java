package com.jdk8.test3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToMap {

	public static void main(String[] args) {


		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("php");
		list.add("python");
		Stream<String> wordStream = list.stream();
		 
		// to map
		Map<String, Integer> map = wordStream.collect(Collectors.toMap(Function.identity(), s->s.length()));
		System.out.println(map);

	}

}
