package com.programs.collection;

import java.util.Enumeration;
import java.util.Stack;

public class StackMain {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		// 1.It allows multiple null elements.
		// 2.Duplicates elements are allowed.
		// 3.Insertion order are preserved.
		// 4.Stack has default initial capacity 10 and Stack will be re-sized when the 11th element is inserted into Stack,it will Double its size(means 20).
		// 5.It allows Heterogeneous Objects. 
		// 6.If we access index value which is not available in Stack then it return ArrayIndexOutOfBoundsException.
		// 7.It extends Vector class.
		// 8.Stack is Synchronized.
		// 9.class represents a last-in-first-out (LIFO) stack of objects.
		// 10.Stack class is thread safe. All methods of Stack class are synchronized so that only one thread can execute them at any given time.
							
		
		Stack stack = new Stack();
		System.out.println("Size of stack at creation: " + stack.size());
		System.out.println("Capacity Before adding Objects is: "+stack.capacity());
		
		stack.push("Rajesh");
		stack.push(null);
		stack.push(4477);
		stack.push("12345");
		stack.push("Rajesh");
		stack.push(null);
		stack.push("Test");
		stack.push(""); // It will accept as empty value.
		stack.push("Rajesh");
		
		System.out.println(stack);
		Object peekObj = stack.peek();
		System.out.println("Peek Objects is: "+peekObj);
		System.out.println("Pushed Objects is: "+stack.push("Krishna"));
		System.out.println("Peek Objects is: "+stack.peek()); // It return top element of Stack.
		System.out.println("Pushed Objects is: "+stack.push("Mumbai")); // Adding the element into Stack.
		System.out.println("Poped Objects is: "+stack.pop()); //remove the object from top of stack.
		System.out.println("Searched Objects is: "+stack.search("Test"));//It return offset of stack.
		System.out.println("Poped Objects is: "+stack.pop()); //remove the object from top of stack.
		System.out.println("To check Stack is empty or not : "+stack.empty()); // if Stack is not empty then it return false.
		System.out.println("Size of stack after Adding Objects :" + stack.size());
		//System.out.println("index of ArrayList at 22 --: " + stack.get(22)); // ArrayIndexOutOfBoundsException
		System.out.println("Capacity Before adding Objects is: "+stack.capacity());
		
		System.out.println("----------------------------------------------------");
        Enumeration en = stack.elements();
        while (en.hasMoreElements())
        {
            System.out.println(en.nextElement());
        }
	}

}
