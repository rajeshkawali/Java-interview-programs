package com.program.string;

public class StringIntern2
{
    public static void main(String[] args)
    {
        String s1 = "JAVA";
        String s2 = new String("JAVA");
        String s3 = s2.intern();       //Creating String Intern
        System.out.println(s1 == s3);       //Output : true
        System.out.println(s1.equals(s2));  //Output : true
        
        //-------------------------------------------------------------------
        
        String s11 = new String("JAVA");
        String s22 = s11.intern();       //Creating String Intern
        System.out.println(s11 == s22);       //Output : false
        System.out.println(s11.equals(s22));    //Output : true
    }
}