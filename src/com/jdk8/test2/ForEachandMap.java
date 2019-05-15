package com.jdk8.test2;

import java.util.HashMap;
import java.util.Map;

public class ForEachandMap {

	public static void main(String[] args) {
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		System.out.println("-------------- Before Java 8-----------");
		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}
		System.out.println("--------------In Java 8-----------");
		
		items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
		System.out.println("--------------In Java 8-----------");
		items.forEach((k,v)->{
			System.out.println("Item : " + k + " Count : " + v);
			if("E".equals(k)){
				System.out.println("Hello E");
			}
		});
		
	}

}
