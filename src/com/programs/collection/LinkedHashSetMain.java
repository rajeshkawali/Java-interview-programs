package com.programs.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetMain {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		// 1.It allows only one Element as a null.
		// 2.Duplicates are not allowed.
		// 3.Insertion order are preserved.
		// 4.The default initial capacity (16) and the default load factor (0.75).
		// 5.Only one difference is, The LinkedHashSet insertion Order are Preserved but not HashSet.
		// 6.when we adding value in LinkedHashSet,If that element already exist then old element replaced with new element.
		// 7.HashSet uses HashMap object internally to store it’s elements where as LinkedHashSet uses LinkedHashMap object internally to store and process it’s elements.
		// 8.If we access index value which is not available in LinkedHashSet then it return null.
		// 9.LinkedHashSet underlying data structure is the Hashtable and linked list.
		LinkedHashSet lhs = new LinkedHashSet();
		System.out.println("Size of LinkedHashSet Before adding elements: " + lhs.size()); // zero
		
		lhs.add("B");
		lhs.add("C");
		lhs.add("E");
		lhs.add("K");
		lhs.add(null);
		lhs.add("B");  // Duplicate element. return false
		lhs.add(null); // Duplicate element (allows only one null). return false
		System.out.println(lhs.add("B")); // return false because B already exist in LinkedHashSet.
		lhs.add(123);
		lhs.add("");
		lhs.add("M");
		
		System.out.println("Elements of LinkedHashSet  : " + lhs); // [B, C, E, K, null, 123, , M]
		System.out.println("Size of LinkedHashSet After adding elements: " + lhs.size()); // 8
		System.out.println("------------------------------------------------------");

		Iterator iterator = lhs.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+", "); // B, C, E, K, null, 123, , M,
		}
	}

}
