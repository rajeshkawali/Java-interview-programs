package com.stream.employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Intermediate operations of Stream API  --> filter(),map(),flatmap(),distinct(),sorted(),peek(),limit(),skip()
public class StreamIntermediateOperations {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(6, 1, 2, 3, 5, 4, 2);

		// filter(Predicate<? super Integer> predicate) --> Returns a stream consisting of the elements of this stream that matchthe given predicate.
		System.out.println(list.stream().filter(x -> x%2==0).collect(Collectors.toList()));
		System.out.println("--------------------------------------------------------------------1");
		// map(Function<? super Integer, ? extends Integer> mapper) --> Returns a stream consisting of the results of applying the given function to the elements of this stream.
		list.stream().filter(x -> x<=3).map(x -> x+2).forEach(System.out::println);
		System.out.println("--------------------------------------------------------------------2");
		// flatMap(Function<? super String, ? extends Stream<? extends Character>> mapper) --> To retrieve nested list.
		List<String> listOfStrings = Arrays.asList("fff", "bbb", "ccc","aaa", "eee", "dddd");
		System.out.println(listOfStrings.stream().flatMap(x -> Stream.of(x.charAt(1))).sorted().collect(Collectors.toList()));// Retrieve 2nd character from string and sort them.
		listOfStrings.stream().flatMap(x -> Stream.of(x.charAt(2)).filter(v->v.equals('e'))).forEach(System.out::println); // Retrieve 3rd character from string and aalow only 'e' character.
		System.out.println("--------------------------------------------------------------------3");
		// distinct() --> Returns a stream consisting of the distinct elements (according to Object.equals(Object)) of this stream.
		System.out.println(list.stream().distinct().sorted().collect(Collectors.toList())); // Print only unique values
		System.out.println("--------------------------------------------------------------------4");
		// sorted() --> sort according to natural order.
		System.out.println(listOfStrings.stream().sorted().collect(Collectors.toList()));
		System.out.println("--------------------------------------------------------------------5");
		// peek(Consumer<? super Integer> action) --> Returns a stream consisting of the elements of this stream, print each element.
		list.stream().peek(System.out::println).collect(Collectors.toList());
		System.out.println("--------------------------------------------------------------------6");
		// limit(long maxSize) --> Returns a stream consisting of the elements of this stream, truncated to be no longer than maxSize in length..
		System.out.println(list.stream().limit(2).collect(Collectors.toList()));// print first 2 elements(limit) in the list with provided limit
		System.out.println("--------------------------------------------------------------------7");
		// skip --> skip the first element and print remaining elements.
		System.out.println(list.stream().skip(1).collect(Collectors.toList())); // Skip the first element in the list
		System.out.println("--------------------------------------------------------------------8");
	}
}
/*

[6, 2, 4, 2]
--------------------------------------------------------------------1
3
4
5
4
--------------------------------------------------------------------2
[a, b, c, d, e, f]
e
--------------------------------------------------------------------3
[1, 2, 3, 4, 5, 6]
--------------------------------------------------------------------4
[aaa, bbb, ccc, dddd, eee, fff]
--------------------------------------------------------------------5
6
1
2
3
5
4
2
--------------------------------------------------------------------6
[6, 1]
--------------------------------------------------------------------7
[1, 2, 3, 5, 4, 2]
--------------------------------------------------------------------8
 */
