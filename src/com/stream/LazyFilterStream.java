package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LazyFilterStream {

	public static void main(String[] args) {

		List<String> l = Arrays.asList("A32","A44","C12","A12","B32","a132","B2","a12","b41");
		
		// Convert to Upper case, filter out only start with A and end with 2
		List<String> result = l.stream().map(str -> str.toUpperCase()).filter(x -> x.startsWith("A") && x.endsWith("2")).collect(Collectors.toList());
		System.out.println(result);
		
		//Using Method referencing
		List<String> result2 = l.stream().map(String::toUpperCase).filter(x -> x.startsWith("A") && x.endsWith("2")).collect(Collectors.toList());
		System.out.println(result2);
		
		//Lazy filter
		System.out.println("----------------------------");
		 l.stream().filter(x ->{
			System.out.println(x);
			return x.startsWith("A") && x.endsWith("2");
		});
		 System.out.println("----------------------------");
		//count
		Long result3 = l.stream().filter(x ->{
			System.out.println(x);
			return x.startsWith("A") && x.endsWith("2");
		}).count();
		System.out.println(result3);
		System.out.println("----------------------------");
		//
		//l.stream().map(String::toUpperCase).filter(x -> x.startsWith("A")).forEach(s -> System.out.println(s));
	}
	
}

/*
	Stream operations and pipelines:-->
	Stream operations are divided into intermediate and terminal operations, and are combined to form streampipelines. A stream pipeline consists of a source (such as a Collection, an array, a generator function, or an I/O channel);followed by zero or more intermediate operations such as Stream.filter or Stream.map; and a terminal operation suchas Stream.forEach or Stream.reduce. 
	Intermediate operations return a new stream. They are always lazy; executing an intermediate operation such as filter() does not actually perform any filtering, but insteadcreates a new stream that, when traversed, contains the elements ofthe initial stream that match the given predicate. Traversalof the pipeline source does not begin until the terminal operation of thepipeline is executed. 
	Terminal operations, such as Stream.forEach or IntStream.sum, may traverse the stream to produce a result or aside-effect. After the terminal operation is performed, the stream pipelineis considered consumed, and can no longer be used; if you need to traversethe same data source again, you must return to the data source to get a newstream. In almost all cases, terminal operations are eager,completing their traversal of the data source and processing of the pipelinebefore returning. Only the terminal operations iterator() and spliterator() are not; these are provided as an "escape hatch" to enablearbitrary client-controlled pipeline traversals in the event that theexisting operations are not sufficient to the task. 
	Processing streams lazily allows for significant efficiencies; in apipeline such as the filter-map-sum example above, filtering, mapping, andsumming can be fused into a single pass on the data, with minimalintermediate state. Laziness also allows avoiding examining all the datawhen it is not necessary; for operations such as "find the first stringlonger than 1000 characters", it is only necessary to examine just enoughstrings to find one that has the desired characteristics without examiningall of the strings available from the source. (This behavior becomes evenmore important when the input stream is infinite and not merely large.) 
	Intermediate operations are further divided into statelessand stateful operations. Stateless operations, such as filterand map, retain no state from previously seen element when processinga new element -- each element can be processedindependently of operations on other elements. Stateful operations, such as distinct and sorted, may incorporate state from previouslyseen elements when processing new elements. 
	Stateful operations may need to process the entire inputbefore producing a result. For example, one cannot produce any results fromsorting a stream until one has seen all elements of the stream. As a result,under parallel computation, some pipelines containing stateful intermediateoperations may require multiple passes on the data or may need to buffersignificant data. Pipelines containing exclusively stateless intermediateoperations can be processed in a single pass, whether sequential or parallel,with minimal data buffering. 
	Further, some operations are deemed short-circuiting operations.An intermediate operation is short-circuiting if, when presented withinfinite input, it may produce a finite stream as a result. A terminaloperation is short-circuiting if, when presented with infinite input, it mayterminate in finite time. Having a short-circuiting operation in the pipelineis a necessary, but not sufficient, condition for the processing of an infinitestream to terminate normally in finite time. 
*/
