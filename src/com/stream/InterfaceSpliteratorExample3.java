package com.stream;

import java.util.*;

public class InterfaceSpliteratorExample3 {
	public static void main(String[] args) {
		List<String> progList = Arrays.asList("Java", "Android", "Python", "C++");
		Spliterator<String> splitr = progList.spliterator();
		Spliterator<String> st = splitr.trySplit();
		splitr.forEachRemaining(System.out::println);
		System.out.println("Traversing the next half of the spliterator-");
		st.forEachRemaining(System.out::println);
	}
}