package com.program.string;

public class StringExamples2
{
    public static void main(String[] args)
    {
        //Concatenating a string object with int type
 
        int i = 1000;
 
        String s = "Java"+i;
 
        System.out.println(s);        //Output : Java1000
 
        //Concatenating a string object with double type
 
        double d = 523.69;
 
        String s1 = "Java"+d;
        String s11 = "44"+d;
        
        System.out.println(s11);     //Output :44523.69
        System.out.println(s1);      //Output : Java523.69
 
        //Concatenating a string object with char type
 
        char c = 'A';
 
        String s2 = "Java"+c;
 
        System.out.println(s2);       //Output : JavaA
 
        //Concatenating a string object with boolean type
 
        boolean b = true;
 
        String s3 = "Java"+b;
 
        System.out.println(s3);      //Output : Javatrue
    }
}
