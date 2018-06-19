package com.programs.map;

import java.util.Hashtable;
import java.util.Map;

public class HashtableMain {

	// 1.It is not allowed null ( Both Key and Value ).
	// 2.duplicates key are not allowed.
	// 3.Insertion order are not preserved.
	// 4.Hashtable has default initial capacity 11 (11 is prime number it is easy to generate hash value) and load factor (0.75).
	// 5.when we adding value in Hashtable,If that key already exist then old value replaced with new value.
	// 6.If we access index value which is not available in Hashtable then it return null.
	// 7.It implements Map, Cloneable and Serializable.It extends Dictionary Abstract class.

	//Hashtable  is quite similar to HashMap except few differences.
    //1.Hashtable methods are synchronized while HashMap methods are not synchronized.
    //2.Hashtable is slower whereas HashMap is faster because it does not have to deal with synchronization.
    //3.Hashtable is a fail-safe collection while HashMap is fail-fast.
    //4.Hashtable does not allow any null key or null value whereas HashMap allows one null key and many null values.

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		System.out.println("Initial capacity of Hashtable :"+ht.size()); // return zero.
		System.out.println("Get the index of Hashtable :"+ht.get("Name"));// It will return null because still Objects are not added in Hashtable.

		ht.put("124", "Rajesh");
		ht.put("Name", "Rajesh");
		//System.out.println("--ht.get(Name)--------->"+ht.get("Name"));
		ht.put("243", "12345");
		ht.put("Name", "RajeshKoli");
		//ht.put(null, null); // null not allowed. we will get NullPointerException.
		//ht.put("456", null); // null not allowed. we will get NullPointerException.
		//ht.put(null, "test"); // null not allowed. we will get NullPointerException.
		ht.put("n15", "Keshav");
		ht.put("498", "Mahesh");
		//System.out.println("\n value=====>"+ht.put("498", "Mahesh333")); // value=====>Mahesh
		System.out.println("Get the index of Hashtable :"+ht.get("notkey")); // It returns null because "notkey" key is not available.
		System.out.println("----------------------------------------------");
		System.out.println("\nExample 1...");
		for(Map.Entry<String, String> entry: ht.entrySet()){
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key :"+ key + "\t Value :"+value);
		}
		System.out.println("------------------------------------------------------");
		System.out.println("\nExample 2...");
		for (String key : ht.keySet()) {
			System.out.println("key :" + key + "\t value :" +ht.get(key));
		}
	}

}
