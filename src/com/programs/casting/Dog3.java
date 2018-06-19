package com.programs.casting;


class Animal { } 
class Anima2 extends Animal{
}

public class Dog3 {
	   
	  @SuppressWarnings("unused")
	public static void main (String [] args) {  
	    Animal a=new Animal();
	    Anima2 bb = new Anima2();
	    Animal aaa = bb;
	    Anima2  aa = (Anima2)aaa;
	    if(a instanceof Anima2){  
	       
	        System.out.println("ok downcasting performed");  
	     }  
	    System.out.println("Done");
	  }  
	    
	 }  