package com.functionalinterface.function;

import java.util.function.Function;
//This is a predefined functional interface like Predicate, present in java.util.function package. 
//It has one abstract method called apply();
public class FunctionExample1 {

	public static void main(String[] args) {
		Function<String, Integer> fun = s -> s.length();
		System.out.println(fun.apply("Rajesh"));
	}

}