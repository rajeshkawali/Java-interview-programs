package com.program.string;

public class StringArray
{
    public static void main(String[] args)
    {
        String s = "Java Concept Of The Day";
        //Defining destination char array
        char[] dst = new char[10];
        //Copying the set of characters from s into dst.
        s.getChars(5, 11, dst, 2);
        //System.out.println(s);
        for (char c : dst)
        {
            System.out.print(c);       //Output : --Concep--
        }
    }
}