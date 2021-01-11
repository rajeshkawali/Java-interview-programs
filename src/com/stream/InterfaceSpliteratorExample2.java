package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class InterfaceSpliteratorExample2 {    
     public static void main(String args[]){  
         List<String> fruitList = Arrays.asList("Mango", "Banana", "Apple");  
         Spliterator<String> splitr = fruitList.spliterator();  
         System.out.println("List of Fruit name-");  
         while(splitr.tryAdvance((num) -> System.out.println("" +num)));  
       }  
}  