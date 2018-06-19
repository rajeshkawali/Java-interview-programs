package com.programs.interviewprograms;

import java.util.Arrays;

public class EqualityOfTwoArrays {
	public static void main(String[] args) {
		System.out.println("---------------for loop----------------");
		int[] arrayOne = { 2, 5, 1, 7, 4 };
		int[] arrayTwo = { 2, 5, 1, 7, 4 };
		boolean equalOrNot = true;
		if (arrayOne.length == arrayTwo.length) {
			for (int i = 0; i < arrayOne.length; i++) {
				if (arrayOne[i] != arrayTwo[i]) {
					equalOrNot = false;
				}
			}
		} else {
			equalOrNot = false;
		}
		if (equalOrNot) {
			System.out.println("Two Arrays Are Equal");
		} else {
			System.out.println("Two Arrays Are Not equal");
		}
		System.out.println("---------------Arrays.equals----------------");
		String[] s1 = {"java", "j2ee", "struts", "hibernate"};
	    String[] s2 = {"jsp", "spring", "jdbc", "hibernate"};
	    String[] s3 = {"java", "j2ee", "struts", "hibernate"};
	    System.out.println(Arrays.equals(s1, s2));  //Output : false
	    System.out.println(Arrays.equals(s1, s3));  //Output : true
	    System.out.println("---------------Arrays.sort and equals----------------");
	    String[] ss1 = {"java", "swings", "j2ee", "struts", "jsp", "hibernate"};
        String[] ss2 = {"java", "struts", "j2ee", "hibernate", "swings", "jsp"};
        Arrays.sort(ss1);
        Arrays.sort(ss2);
        System.out.println(Arrays.equals(s1, s2));       //Output : true
	}
}