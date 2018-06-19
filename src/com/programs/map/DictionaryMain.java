package com.programs.map;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
//Java Program explaining util.Dictionary class Methods put(),elements(),get(),isEmpty(),keys(),remove(),size().

public class DictionaryMain {

	/*
		Dictionary is an abstract class, representing a key-value relation and works similiar to a map.
		Given a key you can store values and when needed can retrieve the value back using its key.
		Thus, it is a list of key-value pair.
	*/
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		// Initializing a Dictionary
		Dictionary geek = new Hashtable();
		// put() method
		geek.put("123", "Code");
		geek.put("456", "Program");
		// elements() method :
		for (Enumeration i = geek.elements(); i.hasMoreElements();) {
			System.out.println("Value in Dictionary : " + i.nextElement());
		}
		// get() method :
		System.out.println("\nValue at key = 6 : " + geek.get("6"));
		System.out.println("Value at key = 456 : " + geek.get("123"));
		// isEmpty() method :
		System.out.println("\nThere is no key-value pair : " + geek.isEmpty() + "\n");
		// keys() method :
		for (Enumeration k = geek.keys(); k.hasMoreElements();) {
			System.out.println("Keys in Dictionary : " + k.nextElement());
		}
		// remove() method :
		System.out.println("\nRemove : " + geek.remove("123"));
		System.out.println("Check the value of removed key : " + geek.get("123"));
		System.out.println("\nSize of Dictionary : " + geek.size());

	}

}
