package com.jdk8.test2;
import java.util.Arrays;
import java.util.List;

public class BeforeJava8Test2 {

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person(1,"mkyong", 30),
                new Person(2,"jack", 20),
                new Person(3,"lawrence", 40),
                new Person(4,"koli", 50)
        );

        Person result = getStudentByName(persons, "jack");
        System.out.println(result);

    }

    private static Person getStudentByName(List<Person> persons, String name) {

        Person result = null;
        for (Person temp : persons) {
            if (name.equals(temp.getName())) {
                result = temp;
            }
        }
        return result;
    }
}