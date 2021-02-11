package com.stream.employee;
// https://youtu.be/eA307vFsENA
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//Terminal operations of Stream API  --> toArray(),collect(),count(),reduce(),forEach(),forEachOrdered(),
//min(),max(),anyMatch(),allMatch(),noneMatch(),findAny(),findFirst()  
public class StreamTerminalOperations {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(6, 1, 2, 3, 5, 4, 2);
		
		//toArray() --> Convert List to Array
		Object[] array = list.stream().toArray();
		System.out.println(array[0]);// print first element of array
		System.out.println("--------------------------------------------------------------------1");
		//collect(Collector<? super T, A, R> collector) --> Collects all the elements in the list/set
		Set<Integer> set = list.stream().collect(Collectors.toSet());// Convert List to Set
		System.out.println(set);;// Print only unique values
		System.out.println("--------------------------------------------------------------------2");
		// count() --> count the no of elements present in the list
		System.out.println(list.stream().count());
		System.out.println("--------------------------------------------------------------------3");
		// reduce(T identity, BinaryOperator<T> accumulator) --> reduce used to reduce the elements to single unit
		System.out.println(list.stream().reduce(0,(x,y)->(x+y))); // Sum of digits
		System.out.println("--------------------------------------------------------------------4");
		//forEach(Consumer<? super T> action) --> print all elements in the list
		list.stream().forEach(System.out::println);
		System.out.println("--------------------------------------------------------------------5");
		//forEachOrdered(Consumer<? super T> action) --> print all elements in the list with ordered
		list.stream().forEachOrdered(System.out::println);
		System.out.println("--------------------------------------------------------------------6");
		//min(Comparator<? super T> comparator) --> return minimum value in the list
		System.out.println(list.stream().min((x,y)->x-y).get());
		System.out.println("--------------------------------------------------------------------7");
		//max(Comparator<? super T> comparator) --> return max value in the list
		System.out.println(list.stream().max((x,y)->x-y).get());
		System.out.println("--------------------------------------------------------------------8");
		//anyMatch(Predicate<? super T> predicate) --> return true if any one element will match the condition
		System.out.println(list.stream().anyMatch(x->x==6));
		System.out.println("--------------------------------------------------------------------9");
		//allMatch(Predicate<? super T> predicate) --> return true if all thr element will match the condition
		System.out.println(list.stream().allMatch(x->x/1==x));
		System.out.println("--------------------------------------------------------------------10");
		//noneMatch(Predicate<? super T> predicate) --> return true if none of the elements matches with the condition
		System.out.println(list.stream().noneMatch(x->x==7)); 
		System.out.println("--------------------------------------------------------------------11");
		//findAny() --> find any element in the list
		System.out.println(list.stream().findAny()); 
		System.out.println("--------------------------------------------------------------------12");
		//findFirst() --> Find first elementof the list
		System.out.println(list.stream().findFirst().get()); 
		System.out.println("--------------------------------------------------------------------13");
	}
}
/*

6
--------------------------------------------------------------------1
[1, 2, 3, 4, 5, 6]
--------------------------------------------------------------------2
7
--------------------------------------------------------------------3
23
--------------------------------------------------------------------4
6
1
2
3
5
4
2
--------------------------------------------------------------------5
6
1
2
3
5
4
2
--------------------------------------------------------------------6
1
--------------------------------------------------------------------7
6
--------------------------------------------------------------------8
true
--------------------------------------------------------------------9
true
--------------------------------------------------------------------10
true
--------------------------------------------------------------------11
Optional[6]
--------------------------------------------------------------------12
6
--------------------------------------------------------------------13
 */
