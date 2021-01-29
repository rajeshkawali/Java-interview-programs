package com.programs.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMain {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		// 1.It is not allow null as element.
		// 2.Duplicates elements are not allowed.
		// 3.Insertion order are not preserved Instead it stores Objects using some Default Natural sorting order.
		// 4.Iterator returned by TreeSet is of fail-fast nature. That means, If TreeSet is modified after the creation of Iterator object, you will get ConcurrentModificationException.
		// 5.It allows only Homogeneous Objects (Only TreeSet and TreeMap are allowed Homogeneous objects except this all are allows Heterogeneous Objects). 
		// 6.TreeSet internally uses TreeMap to store it's elements.
		// 7.It implements NavigableSet, Cloneable, Serializable .It extends AbstractSet class.
		// 8.TreeSet gives performance of order log(n) for insertion, removal and retrieval operations.
		// 9.Underlying data structure- it internally uses TreeMap.
		// 10.TreeSet is not synchronized. To get a synchronized TreeSet, use Collections.synchronizedSortedSet() method.
		// 11.TreeSet does not use hashing for storing Element. It internally uses TreeMap(data structure called "Red-Black tree").	
		
		
		TreeSet ts = new TreeSet();
		System.out.println("Size of TreeSet Before adding Objects :"+ts.size()); // zero
		
		ts.add("D");
		ts.add("U");
		ts.add("null"); // It is treated as a string. 
		ts.add("E");
		ts.add("3");
		ts.add("rajesh");
		ts.add("a");
		//ts.add(null); // return java.lang.NullPointerException
		//ts.add(2); //  return java.lang.ClassCastException : java.lang.String cannot be cast to java.lang.Integer
		ts.add("E"); // return false. Duplicate element are not allowed.
		ts.add(""); // It will accept as empty value.
		ts.add("A");
		//ts.add(20.65);  //inserting Double type element- return java.lang.ClassCastException
		
		System.out.println("To check the Letter(R) is contains or Not :" + ts.contains("R")); //false
		System.out.println("TreeSet Contains following Objects :"+ts); // [, 3, A, D, E, U, a, null, rajesh]
		System.out.println("Size of TreeSet After adding Objects :"+ts.size()); // 9
		System.out.println("------------------------------------------------------");
		Iterator itr = ts.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ,"); // ,3 ,A ,D ,E ,U ,a ,null ,rajesh ,
		}
		System.out.println("\n------------------------------------------------------");
		Object[] obj = ts.toArray();
		for (Object object : obj) {
			System.out.print(object); // 3ADEUanullrajesh
		}
		System.out.println("\n------------------------------------------------------");
		for (Object temp : ts) {
			System.out.print(temp+", "); // , 3, A, D, E, U, a, null, rajesh, 
		}
	}
}
