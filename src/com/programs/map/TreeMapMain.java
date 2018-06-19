package com.programs.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapMain {
	public static void main(String[] args) {
		
		// 1.key should not be null and allows any no of null values.
		// 2.duplicates are not allowed.
		// 3.Insertion order are not preserved.
		// 4.TreeMap don't have default initial capacity .
		// 5.when we adding value in TreeMap,If that key already exist then old value replaced with new value.
		// 6.If we access key's value which is not available in TreeMap then it return null.
		// 7.It implements NavigableMap, Cloneable and Serializable.It extends AbstractMap class.
		// 8.TreeMap does not use hashing for storing keys. It uses a data structure called "Red-Black tree".
		
		TreeMap<String, String> map = new TreeMap<String, String>();
		System.out.println("Before -Initial capacity of TreeMap :"+map.size());
		System.out.println("get the index TreeMap :"+map.get("Name"));// It will return null because still Objects are not added in TreeMap.
		System.out.println("------------------------------------------------------\n");
		map.put("Name", "old value");
		//System.out.println("--map.get(Name)--------->"+map.get("Name"));
		map.put("Power", "220");
		map.put("Type", "2-wheeler");
		map.put("Price", "85000");
		map.put("Name", "New value");//this key already exist then old value replaced with new value.
		map.put("test", null);
		map.put("null", null); // It treated as a String Object not a null.
		//map.put(null, "Suzuki"); // key not allows null.
		//map.put(null, null); // key not allows null.
		map.put("test2", null);
		//map.replace("test2", null, "rajesh"); // To replace "null" value with "Rajesh" of a given key.
		map.put("test4", null);
		map.put("123", "Testing");
		System.out.println("get the index TreeMap :"+map.get("Name")); // New value
		System.out.println("get the index TreeMap :"+map.get("xyz")); // It returns null because "xyz" key is not available.
		System.out.println("After -Initial capacity of TreeMap :"+map.size());// 9
		System.out.println(map);// {123=Testing, Name=New value, Power=220, Price=85000, Type=2-wheeler, null=null, test=null, test2=null, test4=null}
		System.out.println("------------------------------------------------------\n");
		map.remove("test4");  // Removing "test4" from TreeMap.
		System.out.println("After -Initial capacity of TreeMap :"+map.size()); // 8
		System.out.println(map);// {123=Testing, Name=New value, Power=220, Price=85000, Type=2-wheeler, null=null, test=null, test2=null}
		System.out.println("------------------------------------------------------\n");
		
		// more elegant way, this should be the standard way, recommend!
		System.out.println("\nExample 1...");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + "\t Value : " + entry.getValue());
		}
	}
}
