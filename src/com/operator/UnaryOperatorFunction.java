package com.operator;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorFunction {

	public static void main(String[] args) {

		int number = 5;
		Function<Integer,Integer> sum = j -> j+j;
		System.out.println(sum.apply(number));
		
		UnaryOperator<Integer> uo = (i) ->  i + i;
		System.out.println(uo.apply(number));
		//UnaryOperator's primitive types are ...
		/*
		1.IntUnaryOperator
		2.DoubleUnaryOperator
		3.LongUnaryOperator
		*/
	}

}
