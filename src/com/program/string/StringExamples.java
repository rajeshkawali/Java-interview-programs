package com.program.string;

public class StringExamples
{
    public static void main(String[] args)
    {
        String s = new String();                    //Creating an empty string object
        System.out.println(s.length());            //Output : 0
 
        char[] chars = {'J', 'A', 'V', 'A'};
        String s1 = new String(chars);            //Creating string object of 4 characters
        System.out.println(s1.length());         //Output : 4
 
        String s2 = new String(s1+"J2EE");       //Creating string object of 8 characters
        System.out.println(s2.length());        //Output : 8
        System.out.println(s2);  				//JAVAJ2EE
 
        //Using String.length() method on string literals
 
        System.out.println("abc".length());        //Output : 3
        System.out.println("abc"+s2);				//abcJAVAJ2EE
        System.out.println("123456".length());     //Output : 6
 
        System.out.println("A".length());          //Output : 1
    }
}