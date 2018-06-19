package com.program.string;


class A
{
    int i;
 
    public A(int i)
    {
        this.i = i;
    }
 
    //toString() method is not overrided.
    //So, it will return physical address of the object
}
 
class B
{
    int i;
 
    public B(int i)
    {
        this.i = i;
    }
 
    //Overriding toString() method
 
    @Override
    public String toString()
    {
        return "--i = "+i;
    }
}
 
public class StringExamples3
{
    public static void main(String[] args)
    {
        A a = new A(50);
 
        String s = "Java";
 
        //Concatenating a string object with A-type
 
        System.out.println(s+a);      //Output : Javastrings.A@42719c
 
        B b = new B(100);
 
        //Concatenating string object with B-type
 
        System.out.println(s+b);     //Output : Javai = 100
    }
}