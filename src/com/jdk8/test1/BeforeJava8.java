package com.jdk8.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BeforeJava8 {

	public static void main(String[] args) {

		List<String> lines = Arrays.asList("spring", "node", "mkyong", "rajesh", "mahesh", "koli", "diebold");

		List<String> result = lines.stream() // convert list to stream
				.filter(line -> !"mkyong".equals(line)) // we dont like mkyong
				.collect(Collectors.toList()); // collect the output and convert streams to a List
		result.forEach(System.out::println); // output : spring, node
		System.out.println("-------------------------");
		List<String> lines1 = Arrays.asList("spring", "node", "mkyong", "rajesh", "mahesh", "koli", "diebold");
		List<String> result1 = getFilterOutput(lines1, "mkyong");
		for (String temp : result1) {
			System.out.println(temp); // output : spring, node
		}
	}

	private static List<String> getFilterOutput(List<String> lines1, String filter) {
		List<String> result = new ArrayList<>();
		for (String line : lines1) {
			if (!"mkyong".equals(line)) { // we dont like mkyong
				result.add(line);
			}
		}
		return result;
	}
}