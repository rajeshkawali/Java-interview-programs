package com.jdk8.test4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceStream {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("php");
		list.add("python");
		list.add("perl");
		list.add("c");
		list.add("lisp");
		list.add("c#");
		Stream<String> wordStream = list.stream();
		System.out.println("------------------------------");
		Stream<Integer> lengthStream = wordStream.map(s -> s.length());
		Optional<Integer> summ = lengthStream.reduce((x, y) -> x + y);
		summ.ifPresent(System.out::println);
		System.out.println("------------------------------");
		//int sum = wordStream.map(s -> s.length()).mapToInt(Integer::new).sum();
		//System.out.println(sum);
		System.out.println("------------------------------");

	}

}
