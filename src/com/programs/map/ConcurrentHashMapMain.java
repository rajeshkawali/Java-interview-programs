package com.programs.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapMain {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		// 1.It is not allows key as a null and not allows null values.
		// 2.Duplicates are not allowed.
		// 3.Insertion order are not preserved.
		// 4.ConcurrentHashMap have default initial capacity (16) and Load factor (0.75) .
		// 5.when we adding value in ConcurrentHashMap,If that key already exist then old value replaced with new value.
		// 6.If we access key's value which is not available in ConcurrentHashMap then it return null.
		// 7.It implements ConcurrentMap and Serializable.It extends AbstractMap class.
		// 8.ConcurrentHashMap uses hashing for storing keys.
		// 9.ConcurrentHashMap is Synchronized.
		// 10.ConcurrentHashMap uses the Segment.ConcurrentHashMap added Array of HashMap's called Segment. 
		// 11.default Segments array size is 16, So maximum 16 threads can simultaneously put data in map.
		// 12.concurrencyLevel(default 16)- the estimated number of threads to allow concurrently to update the map. 
		// 13.ConcurrentHashMap allows Heterogeneous objects.
		
		
		ConcurrentHashMap map = new ConcurrentHashMap();
		System.out.println("Initial capacity of ConcurrentHashMap :"+map.size()); // zero
		System.out.println("get the index of ConcurrentHashMap :"+map.get("Name"));// It will return null because still Objects are not added in ConcurrentHashMap.
		map.put("B", "Raavan1");
		map.put("e", 123);
		map.put("Name","Rajesh");
		map.put("3", "Trimax");
		map.put("D", 123.12);
		map.put("B", "Raavan2"); // key (B) already exist then it replace with Raavan1 to Raavan2.
		map.put("A", "85000");
		map.put("C", 123);
		//map.put("F", null); // java.lang.NullPointerException
		//map.put(null, "testNull"); // java.lang.NullPointerException
		
		System.out.println("Initial capacity of ConcurrentHashMap :"+map.size()); // 7
		System.out.println("get the index ConcurrentHashMap :"+map.get("Name"));// It will return Rajesh.
		System.out.println(map); //{A=85000, B=Raavan2, 3=Trimax, C=123, D=123.12, e=123, Name=Rajesh}
		System.out.println("----------------------------------------------");
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry entry= (Entry) it.next();
			System.out.println("key :"+entry.getKey()+"\t\t value :"+entry.getValue());
			//map.put("F","TestError"); // There is no ConcurrentModificationException but Exception in HashMap.(fail-safe)
		}
		System.out.println("----------------------------------------------");

	}

}
