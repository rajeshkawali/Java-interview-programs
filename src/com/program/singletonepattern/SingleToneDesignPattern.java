package com.program.singletonepattern;

public class SingleToneDesignPattern {

	//create an object of SingleToneDesignPattern
	   private static SingleToneDesignPattern instance = new SingleToneDesignPattern();

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private SingleToneDesignPattern(){}

	   //Get the only object available
	   public static SingleToneDesignPattern getInstanceOfSingleToneClass(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("Single tone Design Pattern");
	   }
	
}
