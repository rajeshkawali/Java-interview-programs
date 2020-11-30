package com.functionalinterface.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Collection> p = c -> c.isEmpty();

		ArrayList<Object> al = new ArrayList<>();
		al.add("Monday");
		al.add("Sunday");
		ArrayList<Object> al1 = new ArrayList<>();
		System.out.println(p.test(al)); // false
		System.out.println(p.test(al1)); // true
		System.out.println("----------------------");
		Predicate<Integer> p2 = age -> (age > 18);
		System.out.println(p2.test(21)); // true
		System.out.println(p2.test(17)); // false
	}

}