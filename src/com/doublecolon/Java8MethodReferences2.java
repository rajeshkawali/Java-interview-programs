package com.doublecolon;
import java.util.function.Function;
 
public class Java8MethodReferences2
{
    public static void main(String[] args) 
    {
        //Calling toLowerCase() method using lambda
         
        Function<String, String> lambdaFunction = (String s) -> s.toLowerCase();
        System.out.println(lambdaFunction.apply("JAVA"));
         
        //Calling toLowerCase() method using method reference
         
        Function<String, String> referenceFunction = String::toLowerCase;
        System.out.println(referenceFunction.apply("JAVA"));
    }
}