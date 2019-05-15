package com.jdk8.test1;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {

		List<String> aList = new ArrayList<String>();

		aList.add("Arjit");
		aList.add("Lokendra");
		aList.add("MAHESH");
		aList.add("Chandru");
		aList.add("Ramesh");

		aList.stream().forEach(n -> System.out.println(n));
		System.out.println("------------------");
		aList.forEach((n) -> System.out.println(n));
		System.out.println("------------------");
		aList.stream().forEach(names -> System.out.println(names.toLowerCase()));
	}
}