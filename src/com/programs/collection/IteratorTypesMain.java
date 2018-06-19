package com.programs.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class IteratorTypesMain {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		//ArrayList arlTest = new ArrayList();
		Vector arlTest = new Vector();
		
		arlTest.add("D");
		arlTest.add("U");
		arlTest.add("K");
		arlTest.add("E");
		arlTest.add(null);
		arlTest.add(2);
		arlTest.add("E");
		
		System.out.println("------------------------------------------------------");
		System.out.println("#1 normal for loop");
		for (int i = 0; i < arlTest.size(); i++) {
			System.out.println(arlTest.get(i)+", ");
		}
		System.out.println("------------------------------------------------------");
		System.out.println("#2 advance for loop");
		for (Object temp : arlTest) {
			System.out.println(temp+", ");
		}
		System.out.println("------------------------------------------------------");
		System.out.println("#3 while loop");
		int j = 0;
		while (arlTest.size() > j) {
			System.out.println(arlTest.get(j)+", ");
			j++;
		}
		System.out.println("------------------------------------------------------");
		System.out.println("#4 iterator using while loop");
		Iterator iterator = arlTest.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next()+", ");
		}
		
		System.out.println("------------------------------------------------------");
		System.out.println("#5 iterator using Lambda Expression");
		arlTest.forEach((temp) -> {
			System.out.println(temp);
		});
		
		System.out.println("------------------------------------------------------");
		System.out.println("#6 Iterating over collection using terator");
	    for (Iterator i = arlTest.iterator(); i.hasNext();) 
	    System.out.println(i.next());
	    
		System.out.println("------------------------------------------------------");
		System.out.println("#7 Retrieving elements of enumeration");
		Enumeration em = arlTest.elements();
	    while (em.hasMoreElements())
	    System.out.println(em.nextElement());
	    
	    System.out.println("------------------------------------------------------");
		System.out.println("#8 ListIterator using while Loop");
		ListIterator lit = arlTest.listIterator();
	    System.out.println("In Forward direction:");
	    while (lit.hasNext())
	    System.out.print(lit.next()+" ") ;
	    System.out.print("\n\nIn backward direction:\n") ;
	    while (lit.hasPrevious())
	    System.out.print(lit.previous()+" ");
	    
	}
}
