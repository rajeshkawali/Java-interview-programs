package com.stream;

import java.util.*;
import java.util.stream.Stream;

public class InterfaceSpliteratorExample1 {
	public static void main(String args[]) {
		// Create an object of array list
		ArrayList<Integer> list = new ArrayList<>();
		// Add values to the array list.
		list.add(101);
		list.add(201);
		list.add(301);
		list.add(401);
		list.add(501);
		Stream<Integer> str = list.stream();
		// Get Spliterator object on list
		Spliterator<Integer> splitr = str.spliterator();
		// Get estimateSize method
		System.out.println("Estimate size: " + splitr.estimateSize());
		// Print getExactSizeIfKnown method
		System.out.println("Exact size: " + splitr.getExactSizeIfKnown());
		// Check for hasCharacteristics and characteristics method
		System.out.println("Boolean Result: " + splitr.hasCharacteristics(splitr.characteristics()));
		System.out.println("Elements of ArrayList :");
		// Obtain result forEachRemaining method
		splitr.forEachRemaining((n) -> System.out.println(n));
		// Obtaining another Stream to the array list.
		Stream<Integer> str1 = list.stream();
		splitr = str1.spliterator();
		// Obtain result from trySplit() method
		Spliterator<Integer> splitr2 = splitr.trySplit();
		// If splitr could be split, use splitr2 first.
		if (splitr2 != null) {
			System.out.println("Output from splitr2: ");
			splitr2.forEachRemaining((n) -> System.out.println(n));
		}
		// Now, use the splitr
		System.out.println("Output from splitr1: ");
		splitr.forEachRemaining((n) -> System.out.println(n));
	}
}