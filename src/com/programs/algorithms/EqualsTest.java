package com.programs.algorithms;
class Aa
{
    int i;
 
    public Aa(int i)
    {
        this.i = i;
    }
    public boolean equals(Object obj){
    	Aa a = (Aa)obj;
    	if(a instanceof Aa){
    		return this.i==a.i;
    	}else{
    		return this.i==a.i;
    	}
    }
    @Override
    public String toString()
    {
        return "--i = "+i;
    }
}
 
public class EqualsTest
{
    public static void main(String[] args)
    { 
        Aa aa = new Aa(101);
        Aa aaa = new Aa(101);
        System.out.println("equality test==>"+aa.equals(aaa));
        System.out.println(aa);
        String s1 = new String("abc");
        String s2 = new String("abc");
        
        System.out.println("equality test==>"+s1.equals(s2));
        System.out.println(s1.hashCode()+"---------"+s2.hashCode());
        System.out.println(s1+"---------"+s2);
        System.out.println("equality test==>"+(s1==s2));
    }
}