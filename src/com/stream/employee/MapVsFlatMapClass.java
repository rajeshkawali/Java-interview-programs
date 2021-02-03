package com.stream.employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMapClass {

    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> listOfIntegers = listOfStrings.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(listOfIntegers);
        System.out.println("------------------------------------------------------");
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);

        List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);
        System.out.println("Before flattening : " + listOfLists);
        List<Integer> listOfAllIntegers = listOfLists.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());
        System.out.println("After flattening : " +listOfAllIntegers);
        System.out.println("------------------------------------------------------");

    }
}
/*

[1, 2, 3, 4, 5]
------------------------------------------------------
Before flattening : [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
After flattening : [1, 2, 3, 4, 5, 6, 7, 8, 9]
------------------------------------------------------
*/