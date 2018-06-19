package com.programs.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListeMain {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		// Vector - 10, ArrayList - 10, Hashtable - 11, HashMap - 16, HashSet - 16 
		
		// 1.It allows multiple null elements.
		// 2.Duplicates elements are allowed.
		// 3.Insertion order are preserved.
		// 4.ArrayList has default initial capacity 10 and load factor (new capacity=(current capacity * 3/2)+1).
		// 5.It allows Heterogeneous Objects. 
		// 6.If we access index value which is not available in ArrayList then it return IndexOutOfBoundsException.
		// 7.It implements List, Cloneable, Serializable and RandomAccess (Marker interface).It extends AbstractList class.
		// 8.ArrayList is better for storing and accessing data(retrival operation).
		// 9.ArrayList is not Synchronized.
		// 10.Underlying data structure is Resizable-array or Growable array (Dynamically grow-able and shrink-able collection of objects).
		// 11.Increasing its size by 50% when it fill with 11th element.
		
		ArrayList arlTest = new ArrayList();
		System.out.println("Size of ArrayList at creation: " + arlTest.size()); // zero
		arlTest.add("D");
		arlTest.add("U");
		System.out.println(arlTest.add("K"));
		System.out.println(arlTest.add("E"));
		arlTest.add(null);
		arlTest.add(2);
		System.out.println(arlTest.add("E"));
		arlTest.add(""); // It will accept as empty value.
		arlTest.add(null);
		//System.out.println("index of ArrayList at 22 --: " + arlTest.get(22)); //IndexOutOfBoundsException
		System.out.println("Size of ArrayList after adding elements: " + arlTest.size()); // 9
		System.out.println("List of all elements: " + arlTest); // [D, U, K, E, null, 2, E, , null]
		// Remove some elements from the list
		arlTest.remove("D");
		System.out.println("See contents after removing one element: " + arlTest); //[U, K, E, null, 2, E, , null]
		arlTest.remove(2);// Remove element by index
		System.out.println("See contents after removing element by index: " + arlTest);//[U, K, null, 2, E, , null]
		// Check size after removing elements
		System.out.println("Size of arrayList after removing elements: " + arlTest.size());// 7
		System.out.println("List of all elements after removing elements: " + arlTest);//[U, K, null, 2, E, , null]
		System.out.println(arlTest.contains("K")); // Check if the list contains "K"
		System.out.println("----------------------for loop--------------------------------");
		System.out.println("#1 normal for loop");
		for (int i = 0; i < arlTest.size(); i++) {
			System.out.print(arlTest.get(i)+", ");
		}
		System.out.println("\n---------------------for(Object temp:arlTest)---------------------------------");
		System.out.println("#2 advance for loop");
		for (Object temp : arlTest) {
			System.out.print(temp+", "); // U, K, null, 2, E, , null, 
		}
		System.out.println("\n--------------------arlTest.get(j)----------------------------------");
		System.out.println("#3 while loop");
		int j = 0;
		while (arlTest.size() > j) {
			System.out.print(arlTest.get(j)+", ");// U, K, null, 2, E, , null,
			j++;
		}
		System.out.println("\n---------------------iterator()---------------------------------");
		System.out.println("#4 iterator");
		Iterator iterator = arlTest.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+", "); // U, K, null, 2, E, , null, 
		}
		System.out.println("\n----------------------forEach((temp)--------------------------------");
		System.out.println("#5 iterator");
		arlTest.forEach((temp) -> {
			System.out.print(temp+",");
		});
		System.out.println("\n-----------------------toArray()-------------------------------");
		System.out.println("#6 iterator");
		Object[] objects = arlTest.toArray();
		for (Object obj : objects) {
			System.out.print(obj + ", "); // U, K, null, 2, E, , null, 
		}
	}
}
