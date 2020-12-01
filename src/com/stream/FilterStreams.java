package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStreams {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		System.out.println(al);
		
		//Java 1.7 Collections
		List<Integer> evenNum = new ArrayList<Integer>(); 
		for (Integer num : al) {
			if(num % 2 == 0) {
				evenNum.add(num);
			}
		}
		System.out.println("List of even Numbers :"+evenNum);
		
		//Java 1.8 Streams
		evenNum = al.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println("List of even Numbers using Streams :"+evenNum);
		
		evenNum = al.stream().filter(x -> x >  2).collect(Collectors.toList());
		System.out.println("List the Numbers greater than 2 using Streams :"+evenNum);
	}

}
