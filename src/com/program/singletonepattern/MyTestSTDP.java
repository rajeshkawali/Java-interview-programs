package com.program.singletonepattern;

public class MyTestSTDP {

	static MyTestSTDP obj = new MyTestSTDP();
	private MyTestSTDP(){
	}
		
	public static MyTestSTDP getSTObject(){
		return obj;
	}
	public void testMessage(){
		System.out.println("Testing Single tone Design patter");
	}
}
