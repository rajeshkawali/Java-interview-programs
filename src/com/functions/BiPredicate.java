package com.functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

//Well you know predicate, function and consumer can only accept one input argument but 
//sometimes we need a two-argument type functional interface in that situation we can use these predefined functional interfaces.
//BiPredicate
//BiFunction
//BiConsumer
public class BiPredicate {

	public static void main(String[] args) {

		//BiPredicate: It is the same as a predicate interface but the only difference is 
		//it takes two input arguments to perform a conditional check.
		/*
		 BiPredicate<String, Integer> filter = (x, y) -> {
            return x.length() == y;
        };

        boolean result = filter.test("rajesh", 6);
        System.out.println(result);  // true

        boolean result2 = filter.test("java", 10);
        System.out.println(result2); // false
		*/
		//BiFunction: It is the same as a function predefine functional interface but the only difference is 
		//it takes two input arguments to perform some operation.
        BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;
        Integer result = func.apply(2, 3);
        System.out.println(result); // 5
        // take two Integers and return an Double
        BiFunction<Integer, Integer, Double> func2 = (x1, x2) -> Math.pow(x1, x2);
        Double result2 = func2.apply(2, 4);
        System.out.println(result2);    // 16.0
        // take two Integers and return a List<Integer>
        BiFunction<Integer, Integer, List<Integer>> func3 = (x1, x2) -> Arrays.asList(x1 + x2);
        List<Integer> result3 = func3.apply(2, 3);
        System.out.println(result3);
		
		//BiConsumer: BiConsumer is exactly the same as Consumer except that it will take 2 input arguments
        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
        addTwo.accept(1, 2); 
		
	}

}
