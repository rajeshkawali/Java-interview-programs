package com.program.string;

public class StringPooling {
	public static void main(String[] args) {
		// Creating string objects using literals
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2); // Output : true
		//This statement appends “J2EE” to the object to which s1 is pointing and re-assigns reference of that object back to s1.
		s1 =s1 + "J2EE";
		System.out.println(s1 == s2); // Output : false
		// Creating string objects using new operator
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		System.out.println(s3 == s4); // Output : false
	}
}