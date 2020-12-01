package com.operator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorFunction {

	public static void main(String[] args) {

		BiFunction<String,String,String> bf = (s1,s2) -> s1+s2;
		System.out.println(bf.apply("Rajesh", "Kawali"));
		BinaryOperator<String> bo = (s1,s2) -> s1+s2;
		System.out.println(bo.apply("Rajesh", "Kawali"));
		//BinaryOperator primitive types are ...
				/*
				1.IntBinaryOperator
				2.DoubleBinaryOperator
				3.LongBinaryOperator
				*/
	}

}
