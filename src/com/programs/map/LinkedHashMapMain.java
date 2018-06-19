package com.programs.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapMain {

	public static void main(String[] args) {

		// 1.It allows only 1 key as a null and any no.of values as a null.
		// 2.duplicates are not allowed.
		// 3.Insertion order are preserved.
		// 4.The default initial capacity (16) and the default load factor (0.75).
		// 5.Only one difference is, The LinkedHashMap insertion Order are Preserved but not HashMap.
		// 6.when we adding value in LinkedHashMap,If that key already exist then old value replaced with new value.
		// 7.null key always going to location zero.
		// 8.If we access index value which is not available in LinkedHashMap then it return null.

		Map<String, String> map = new LinkedHashMap<String, String>();

		System.out.println("Before Put :Size of the Map:" + map.size()); // zero

		map.put("Name", "Suzuki");
		map.put("Power", "222"); 
		map.put("Power", "220"); // duplicates not allowed.(222 is replaced by 220)
		map.put("Type", "2-wheeler");
		map.put("Price", "85000");
		map.put("Name", "Suzuki");
		map.put("test", null);
		map.put(null, "Suzuki");
		map.put("test2", null);
		map.put("test3", null);
		map.put(null, null);

		System.out.println("After Put :Size of the Map:" + map.size()); // 8
		System.out.println("------------------------------------------------------");
		System.out.println(map); //{Name=Suzuki, Power=220, Type=2-wheeler, Price=85000, test=null, null=null, test2=null, test3=null}
		System.out.println("------------------------------------------------------");
		
		// more elegant way, this should be the standard way, recommend!
		System.out.println("\nExample 1...");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + "\t Value : " + entry.getValue());
		} 
		System.out.println("------------------------------------------------------");
		// Java 8 only, forEach and Lambda. recommend!
		System.out.println("\nExample 2...");
		map.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));
		System.out.println("------------------------------------------------------");
		// weired, but works anyway, not recommend!
		System.out.println("\nExample 3...");
		System.out.println("------------------------------------------------------");
		for (String key : map.keySet()) {
			System.out.println("key: " + key + " value: " + map.get(key));
		}
		System.out.println("------------------------------------------------------");
		System.out.println("\nExample 4...");
		@SuppressWarnings("rawtypes")
		Iterator itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry pair = (Map.Entry) itr.next();
			System.out.println(pair.getKey() + " : " + pair.getValue());
			// System.out.println(pair);
			itr.remove(); // avoids a ConcurrentModificationException
		}
		System.out.println("------------------------------------------------------");
		
		
		
		
	}

}
