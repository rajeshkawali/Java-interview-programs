package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalStream {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		List<String> strings = Arrays.asList("A32","A44","C12","A12","B32","A24","C42","A15","E62","a132","B2","a12","b41");
		System.out.println(strings);
		//find first occurrence of stream value : Optional[A32]
		System.out.println(strings.stream().filter(x->x.startsWith("A")).findFirst());
		System.out.println("-----------------------------");
		//if value present then only it will execute
		Optional<String> optionalVal = strings.stream().filter(x->x.startsWith("A")).findFirst();
		optionalVal.ifPresent(System.out::println);
		if(optionalVal.isPresent()) {
			System.out.println("Value present: "+optionalVal.get());
		}else {
			System.out.println("Value not present then print this 90 value :"+optionalVal.orElse("90"));
		}
		System.out.println(optionalVal.orElseGet(()->"I am Default"));
		System.out.println("-----------------------------");
		Optional<String> optionalVal2 =  Optional.of("Rajesh");
		System.out.println(optionalVal2);
		Optional optionalVal3 =  Optional.ofNullable(null);
		System.out.println(optionalVal3);
		System.out.println("-----------------------------");
		
		
		
	}

}
/*
 [A32, A44, C12, A12, B32, A24, C42, A15, E62, a132, B2, a12, b41]
Optional[A32]
-----------------------------
Value not present then print this 90 value :90
I am Default
-----------------------------
Optional[Rajesh]
Optional.empty
---------------------------------------------------------------------------output2
[A32, A44, C12, A12, B32, A24, C42, A15, E62, a132, B2, a12, b41]
Optional[A32]
-----------------------------
A32
Value present: A32
A32
-----------------------------
Optional[Rajesh]
Optional.empty
-----------------------------
 */
