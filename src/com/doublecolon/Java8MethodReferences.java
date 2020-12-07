package com.doublecolon;
import java.util.function.Function;
 
public class Java8MethodReferences
{
    public static void main(String[] args) 
    {
        //Calling parseInt() method using lambda
         
        Function<String, Integer> lambdaFunction = (String s) -> Integer.parseInt(s);
        System.out.println(lambdaFunction.apply("12"));
         
        //Calling parseInt() method using method reference
         
        Function<String, Integer> referenceFunction = Integer::parseInt;
        System.out.println(referenceFunction.apply("12"));
    }
}