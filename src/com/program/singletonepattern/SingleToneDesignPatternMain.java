package com.program.singletonepattern;

public class SingleToneDesignPatternMain {

	public static void main(String[] args) {
		//illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleToneDesignPattern object = new SingleToneDesignPattern();

	      //Get the only object available
		SingleToneDesignPattern object = SingleToneDesignPattern.getInstanceOfSingleToneClass();

	      //show the message
	      object.showMessage();

	}

}
