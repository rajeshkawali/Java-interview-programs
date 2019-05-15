package com.jdk8.test2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NowJava8Test2 {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person(1, "mkyong", 30), new Person(2, "jack", 20),
				new Person(3, "lawrence", 40), new Person(4, "koli", 50));

		Person result1 = persons.stream() // Convert to steam
				.filter(x -> "jack".equals(x.getName())) // we want "jack" only
				.findAny() // If 'findAny' then return found
				.orElse(null); // If not found, return null
		System.out.println(result1);
		System.out.println("--------------------------");
		Person result2 = persons.stream().filter(x -> "ahmook".equals(x.getName())).findAny().orElse(null);
		System.out.println(result2);
		
		String name = persons.stream()
                .filter(x -> "jack".equals(x.getName()))
                .map(Person::getName)                        //convert stream to String
                .findAny()
                .orElse("");
		System.out.println("--------------------------");
        System.out.println("name : " + name);
		System.out.println("--------------------------");
		Person result3 = getNameFilterd(persons, "koli", 50);
		System.out.println(result3);
		System.out.println("--------------------------");
		List<String> collect = persons.stream().map((data) ->data.getName()).collect(Collectors.toList());
        System.out.println(collect);
	}

	private static Person getNameFilterd(List<Person> persons, String name, int age) {
		return persons.stream().filter(data -> name.equals(data.getName()) && age == data.getAge()).findAny()
				.orElse(null);
	}
}