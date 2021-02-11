package com.stream.employee;
import java.util.Arrays;
import java.util.List;

public class StringCount {

    public static void main(String[] args) {
    	//count the no of 'e' character 
        String someString = "rajesh";
        long charCount = someString.chars().filter(ch -> ch == 'e').count();
        System.out.println(charCount);
        System.out.println("---------------");
        //count the empty string
        List<String> strings= Arrays.asList("abc","def","lkg","ukg","","");
        long count=strings.stream().filter(String->String.isEmpty()).count();
        System.out.println(count);
        System.out.println("---------------");
        // count the no of "abc" string
        List<String> strings1= Arrays.asList("abc","def","abc","abcd","dabc","abc");
        long charCount1= strings1.stream().filter(String-> String.equals("abc")).count();
        System.out.println(charCount1);
    }
}
/*
1
---------------
2
---------------
3
*/