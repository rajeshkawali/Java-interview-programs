package com.programs.collection;

import java.util.Iterator;
import java.util.LinkedList;

@SuppressWarnings("rawtypes")
public class LinkedListMain {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		// 1.It allows multiple null elements.
		// 2.Duplicates elements are allowed.
		// 3.Insertion order are preserved.
		// 4.In LinkedList there is no default capacity at all, Instead it creates a Node dynamically.
		// 5.It allows Heterogeneous Objects.
		// 6.If we access index value which is not available in LinkedList then it return IndexOutOfBoundsException.
		// 7.It implements List, Cloneable, Serializable and Deque.It extends AbstractSequentialList class.
		// 8.The LinkedList can also be used as ArrayList, Queue, Single linked list and doubly linked list.
		// 9.Insertion and removal operations in LinkedList are faster than the ArrayList.Because in LinkedList, there is no need to shift the elements after each insertion and removal
		// 10.Retrieval of the elements is very slow in LinkedList as compared to ArrayList.Becaues in LinkedList, you have to traverse from beginning or end to reach the element.
		// 11.LinkedList is better for manipulating data.
		// 12.Underlying data structure is Doubly Linked list.
		
		LinkedList list = new LinkedList();
		System.out.println("Initial capacity :" + list.size());

		// System.out.println("Array Index[0] :"+list.get(0)); //IndexOutOfBoundsException

		list.add("rajesh");
		list.add(1234);
		list.add(null);
		list.add("NiviTech");
		list.add(null);
		list.add("rajesh");
		list.add("1234");
		list.add(1234);
		list.add(null);
		list.add("rajesh");

		// System.out.println("Array Index[17] :"+list.get(17)); //IndexOutOfBoundsException
		System.out.println(list);
		System.out.println("After adding Objects- Capacity :" + list.size());
		
		System.out.println("------------------------------------------------------");
		System.out.println("#1 iterator");
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + ", ");
		}
		System.out.println("------------------------------------------------------");
		System.out.println("#2 advance for loop");
		for (Object temp : list) {
			System.out.print(temp+", "); // rajesh, 1234, null, NiviTech, null, rajesh, 1234, 1234, null, rajesh,
		}
	}

}
