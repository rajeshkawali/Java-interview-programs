package com.programs.map;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;


//1. CopyOnWriteArrayList is synchronized(means at a time only one thread can access the object).
//2. CopyOnWriteArrayList uses fail-safe iterator.
//3. CopyOnWriteArrayList can not throw ConcurrentModificationException.
//4. CopyOnWriteArrayList class was added in java version 1.5
//5. CopyOnWriteArrayList class is present in java.util.concurrent package.
//6. CopyOnWriteArrayList allows null.
//7. clone method return the shallow copy of the original object.
//8. CopyOnWriteArrayList is a thread-safe.(Performance is Slow).
//9. add, remove operator is not supported by CopyOnWriteArrayList iterator
//10. 

public class CopyOnWriteArrayListMain {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		CopyOnWriteArrayList cowa = new CopyOnWriteArrayList();
		cowa.add("raj1");
		cowa.add('c');
		cowa.add(null);
		cowa.add("raj4");
		cowa.add(11.55f);
		cowa.add(11.55);
		cowa.add(null);
		cowa.add(24);
		cowa.add(24);
		cowa.add("raj1");
		System.out.println(cowa); // [raj1, c, null, raj4, 11.55, 11.55, null, 24, 24, raj1]
		
		
		
		//add, remove operator is not supported by CopyOnWriteArrayList iterator
        Iterator<String> failSafeIterator = cowa.iterator();
        while(failSafeIterator.hasNext()){
        	
        	cowa.add("iterator"); //not adding in CopyOnWriteArrayList in Java.
            System.out.printf("Read from CopyOnWriteArrayList : %s %n ", failSafeIterator.next());
            //failSafeIterator.remove(); //not supported in CopyOnWriteArrayList in Java.(UnsupportedOperationException)
            //System.out.println(cowa); 
        }
    }
}
