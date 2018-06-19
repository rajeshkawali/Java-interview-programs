package com.programs.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapMain {

	public static void main(String[] args) {

		// 1.It allows only 1 key as a null and any no of null values.
		// 2.duplicates are not allowed.
		// 3.Insertion order are not preserved.
		// 4.The default initial capacity (16) and the default load factor (0.75).
		// 5.when we adding value in HashMap,If that key already exist then old value replaced with new value.
		// 6.null key always going to location zero.(because null's hashcode is 0 )
		// 7.If we access index value which is not available in HashMap then it return null.
		// 8.With the help of hashcode, it distributes objects in such a way, that both putting the object in hashmap and look up for any object within hashmap can be done very quickly, almost with O(1) time complexity.
		
		//Below Line will create HashMap with initial size 10 and 0.5 load factor  
        //Map<String, String> objMap = new HashMap<String, String>(10, 0.5f); 
		
		
		Map<String, String> objMap = new HashMap<String, String>();

		System.out.println("------------------------------------------------------");
		System.out.println("Array Index[0] :"+objMap.get(0));// null
		System.out.println("Array Index[35] :"+objMap.get(35));// null
		System.out.println("------------------------------------------------------\n");
		System.out.println("Before Size of the Map:" + objMap.size());// 0
		
		objMap.put("Name", "Suzuki");
		objMap.put("Power", "220");
		objMap.put("Type", "2-wheeler");
		objMap.put("Price", "85000");
		objMap.put("Name", "Suzuki");
		System.out.println("return value=>"+objMap.put("Name", "Honda"));//return value=>Suzuki
		System.out.println("return value=>"+objMap.get("Name"));//return value=>Honda
		objMap.put("test", null);
		objMap.put(null, null);
		objMap.put(null, "Suzuki");
		objMap.put("test2", null);
		objMap.put("test3", null);
		

		System.out.println("------------------------------------------------------");
		System.out.println("Array Index[Name] :"+objMap.get("test")); // null
		System.out.println("Array Index[35] :"+objMap.get(35)); // null
		System.out.println("Array Index[null] :"+objMap.get(null)); // Suzuki
		System.out.println("------------------------------------------------------\n");
		System.out.println("After Size of the Map:" + objMap.size()); //8
		System.out.println("------------------------------------------------------");
		System.out.println("Elements of the Map:");
		System.out.println(objMap);
		// {null=Suzuki, Type=2-wheeler, test2=null, test3=null, test=null, Price=85000, Power=220, Name=Honda}
		System.out.println("------------------------------------------------------");
		// more elegant way, this should be the standard way, recommend!
		System.out.println("\nExample 1...");
		for (Map.Entry<String, String> entry : objMap.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
			//objMap.put("F","TestError");// java.util.ConcurrentModificationException.
		}
		System.out.println("------------------------------------------------------");
		// Map -> Set -> Iterator -> Map.Entry -> troublesome, not recommend!
		System.out.println("\nExample 2...");
		Iterator<Entry<String, String>> iterator = objMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
			System.out.println("Key : " + entry.getKey() + " Value :" + entry.getValue());
		}
		System.out.println("------------------------------------------------------");
		// Java 8 only, forEach and Lambda. recommend!
		System.out.println("\nExample 3...");
		objMap.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));
		System.out.println("------------------------------------------------------");
		// weired, but works anyway, not recommend!
		System.out.println("\nExample 4...");
		for (String key : objMap.keySet()) {
			System.out.println("key: " + key + " value: " + objMap.get(key));
		}
	}
}
