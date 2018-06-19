package com.programs.collection;

import java.util.HashSet;

public class HashSetMain {

	@SuppressWarnings({ "rawtypes", "unchecked",  })
	public static void main(String[] args) {
		
		// 1.It allows only one null elements.
		// 2.Duplicates elements are not allowed.
		// 3.Insertion order are not preserved.
		// 4.HashSet has default initial capacity (16) and the default load factor (0.75).
		// 5.It allows Heterogeneous Objects (Only TreeSet and TreeMap are not allowed). 
		// 6.null element always going to location zero.
		// 7.It implements Set, Cloneable, Serializable .It extends AbstractSet class.
		// 8.HashSet offers constant time performance for insertion, removal and retrieval operations.
		// 9.Underlying data structure- it internally uses HashMap.
		// 10.when we adding elements in HashSet,If that element already exist then old element replaced with new element.
		// 11.Set interface is that add() method will return false if you try to insert an element which is already present in the set.
		// 12.HashSet internally uses HashMap to store the objects. The elements you insert in HashSet will be stored as keys of that HashMap object and their values will be a constant called PRESENT.
		// 13.HashSet class is not synchronized. If you want synchronized HashSet, use Collections.synchronizedSet() method.
			
		
		HashSet hs = new HashSet();
		System.out.println("Size of HashSet Before adding Objects :"+hs.size()); // zero
		
		hs.add("D");
		hs.add("U");
		hs.add("K");
		hs.add("E");
		hs.add("L");
		//System.out.println("Inserting duplicate element in HashSet  :"+hs.add("L")); // false
		hs.add(null);
		hs.add(2);
		hs.add("E"); // return false.
		hs.add(null); // return false.
		hs.add(""); // It will accept as empty value.
		hs.add(null);
		System.out.println("To check the Letter(R) is contains or Not :" + hs.contains("R")); //false
		System.out.println("HashSet Contains following Objects :"+hs); // [null, , 2, D, U, E, K, L]
		System.out.println("Size of HashSet After adding Objects :"+hs.size()); // 8
		System.out.println("------------------------------------------------------");

		for (Object temp : hs) {
			System.out.print(temp+", ");// null, , 2, D, U, E, K, L, 
		}
		

	}

}
