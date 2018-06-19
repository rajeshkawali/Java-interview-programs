package com.programs.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorMain {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// Vector - 10, ArrayList - 10, Hashtable - 11, HashMap - 16, HashSet - 16 
		
		// 1.It allows multiple null elements.
		// 2.Duplicates elements are allowed.
		// 3.Insertion order are preserved.
		// 4.Vector has default initial capacity 10 and Vector will be re-sized when the 11th element is inserted into Vector,it will Double its size(new capacity=(current capacity * 2)).
		// 5.It allows Heterogeneous Objects. 
		// 6.If we access index value which is not available in Vector then it return ArrayIndexOutOfBoundsException.
		// 7.It implements List, Cloneable, Serializable and RandomAccess (Marker interface).It extends AbstractList class.
		// 8.Vector is better for storing and accessing data.
		// 9.Vector is Synchronized.
		// 10.Underlying data structure is Resizable-array or Growable array (Dynamically grow-able and shrink-able collection of objects).
		// 11.Vector class is that it is thread safety. All methods of Vector class are synchronized so that only one thread can execute them at any given time.
		// 12.Vector class effects the performance of an application as it makes threads to wait for object lock.
		
		
		Vector v = new Vector();
		System.out.println("Size of Vector at creation: " + v.size());
		System.out.println("Capacity Before adding Objects is: "+v.capacity());
		
		v.addElement("Rajesh");
		v.addElement(null);
		v.addElement(4477);
		v.addElement("12345");
		v.add("Rajesh");
		v.addElement(null);
		v.addElement("Test");
		v.addElement(""); // It will accept as empty value.
		v.addElement(null);
		v.addElement("Koli");
		v.add("Hari");
		v.addElement(54321);
		
		//System.out.println("index of ArrayList at 22 --: " + v.get(22)); // ArrayIndexOutOfBoundsException
		System.out.println("Capacity Before adding Objects is: "+v.capacity());
		System.out.println("Size of Vector after Adding Objects :" + v.size());
		System.out.println(v);
		
		System.out.println("----------------------------------------------------");
        Enumeration en = v.elements();
        while (en.hasMoreElements())
        {
            System.out.println(en.nextElement());
        }
	}
}
