package com.jdk8.test1;
import java.util.Arrays;
import java.util.List;

public class Java8Now {

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person(1,"rajesh", 30),
                new Person(2,"koli", 20),
                new Person(3,"kawali", 40),
                new Person(4,"nivtech", 50)
        );

        Person result1 = persons.stream()                        // Convert to steam
                .filter(x -> "jack".equals(x.getName()))        // we want "jack" only
                .findAny()                                      // If 'findAny' then return found
                .orElse(null);                                  // If not found, return null

        System.out.println(result1);

        Person result2 = persons.stream()
                .filter(x -> "koli".equals(x.getName()))
                .findAny()
                .orElse(null);

        System.out.println(result2);

    }

}