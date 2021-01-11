package com.programs.map;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.Map.Entry;
// Just copied from HashMap, Need check all once WeakHashMap
public class WeakHashMapMain {

	public static void main(String[] args) {

		WeakHashMap<String, String> objMap = new WeakHashMap<String, String>();
		
	
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
