package com.functionalinterface.consumer;

import java.util.function.Consumer;

public class ConsumerExample1 {

	public static void main(String[] args) {
		Consumer<String> con = s -> System.out.println(s);
		con.accept("Rajesh");
		
		
		
		Consumer<String> con2 = s -> System.out.println(s.toUpperCase());

		  Consumer<String> con1 = s -> System.out.println("(" + s + ")");

		  con2.andThen(con1).accept("rajesh");
	}

}