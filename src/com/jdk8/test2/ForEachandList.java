package com.jdk8.test2;

import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

public class ForEachandList {

	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		for (String item : items) {
			System.out.println(item);
		}
		System.out.println("------1-----In Java 8----------");
		items.forEach(data -> System.out.println(data));
		System.out.println("------2-----In Java 8----------");
		items.forEach(itemList -> {
			if ("D".equals(itemList)) {
				System.out.println(itemList);
			}
		});
		System.out.println("------3-----In Java 8----------");
		items.forEach(System.out::println);
		System.out.println("------4-----In Java 8----------");
		items.stream().filter(s -> s.contains("B")).forEach(System.out::println);
	}
}
