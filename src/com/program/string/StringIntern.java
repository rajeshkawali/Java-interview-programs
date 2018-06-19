package com.program.string;

//String Interning is a method of storing only one copy of each distinct String Value, which must be immutable. 
//It can be used to return string from pool memory, if it is created by new keyword.
//-----------------------
//Basically doing String.intern() on a series of strings will ensure that all strings having same contents 
//share same memory. So if you have list of names where 'john' appears 1000 times, by interning you ensure 
//only one 'john' is actually allocated memory.
public class StringIntern{
	  public static void main(String args[]){
	  String s1 = "Hello World";
	  String s2 = "Hello World";
	  String s3 = new String("Hello world");
	  final String s4 = s3.intern();
	  //The intern() method returns string from pool, now s4  will be same as s1,s2 
	    System.out.println(s1 == s2);// The == operator compares references not values
	    System.out.println(s2 == s3);
	    System.out.println(s3 == s4);
	    System.out.println(s1 == s3);
	    System.out.println(s1 == s4);
	    System.out.println(s1.equals(s2));
	   //The equals() method compares the original content of the string. 
	   //It compares values of string for equality
	    System.out.println(s2.equals(s3));
	    System.out.println(s3.equals(s4));
	    System.out.println(s1.equals(s4));
	    System.out.println(s1.equals(s3));
	}
	}