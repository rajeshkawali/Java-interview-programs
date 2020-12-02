package com.stream;

import java.util.stream.Stream;

public class IterateStream {

	public static void main(String[] args) {

		//It goes infinite loop
		//Stream.iterate(1, x->x+1).forEach(System.out::println);
		
		//it will loop till 10 result:12345678910
		Stream.iterate(1, x->x+1).limit(10).forEach(System.out::print);
		
	}
}
