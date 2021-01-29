package com.stream.employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class TestEmployee {

	public static void main(String[] args) {

		List<Employee> employeeList = Arrays.asList(
				new Employee(1,"Rajesh", 32, "rajesh@gmail.com", Arrays.asList("8169447937", "839409467")),
				new Employee(2,"Mahesh", 29, "mahesh@gmail.com", Arrays.asList("91445935", "7948559447")),
				new Employee(3,"Vidya", 27, "vidya@gmail.com", Arrays.asList("869493", "89454")),
				new Employee(4,"Rajesh", 18, "rajesh@gmail.com", Arrays.asList("94937", "8946069767")),
				new Employee(5,"Vikram", 6, "vikram@gmail.com", Arrays.asList("81937", "94068")),
				new Employee(6,"Keshav", 22, "keshav@gmail.com", Arrays.asList("9164937447", "9478683067")),
				new Employee(7,"Kiran", 22, "kiran@gmail.com", Arrays.asList("91937447", "947683067")));

		// Given a list of employees, you need to filter all the employee whose age is
		// greater than 25 and print the employee names
		List<String> employeeFilteredList = employeeList.stream().filter(e -> e.getAge() > 25).map(Employee::getName)
				.collect(Collectors.toList());
		System.out.println(employeeFilteredList);
		System.out.println("--------------------------------------------------------------------------------");
		// Given the list of employees, count number of employees with age 25
		long count = employeeList.stream().filter(e -> e.getAge() > 25).count();
		System.out.println("Number of employees with age 25 are : " + count);
		System.out.println("--------------------------------------------------------------------------------");
		// Given the list of employees, find the employee with name “Rajesh”
		Optional<Employee> e1 = employeeList.stream().filter(e -> e.getName().equalsIgnoreCase("Mahesh")).findAny();
		if (e1.isPresent()) {
			System.out.println(e1.get());
		}
		System.out.println("--------------------------------------------------------------------------------");
		// Given a list of employee, find maximum age of employee?
		OptionalInt max = employeeList.stream().mapToInt(Employee::getAge).max();
		if (max.isPresent()) {
			System.out.println("Maximum age of Employee: " + max.getAsInt());
		}
		System.out.println("--------------------------------------------------------------------------------");
		// Given a list of employees, sort all the employee on the basis of age?
		employeeList.sort((e11, e22) -> e11.getAge() - e22.getAge());
		employeeList.forEach(System.out::println);
		System.out.println("--------------------------------------------------------------------------------");
		// Join the all employee names with “,” using java 8?
		List<String> employeeNames = employeeList.stream().map(Employee::getName).collect(Collectors.toList());
		String employeeNamesStr = String.join(",", employeeNames);
		System.out.println("Employees are: " + employeeNamesStr);
		System.out.println("--------------------------------------------------------------------------------");
		// Given the list of employee, group them by employee name?
		Map<String, List<Employee>> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getName));
		map.forEach((name, employeeListTemp) -> System.out.println("Name: " + name + " ==>" + employeeListTemp));
		System.out.println("--------------------------------------------------------------------------------");
		// Print all the phone numbers(Which is in List of List)
		List<List<String>> employeePhone = employeeList.stream().map(Employee::getPhone).collect(Collectors.toList());
		System.out.println(employeePhone);
		System.out.println("--------------------------------------------------------------------------------");
		// Print all the phone numbers in one List(flattening)
		List<String> flatteredPhone = employeeList.stream().flatMap(employee ->employee.getPhone().stream()).collect(Collectors.toList());
		System.out.println(flatteredPhone);
		System.out.println("--------------------------------------------------------------------------------");
		// Print all the phone numbers which is greater than equal to 10
		List<String> exact10DigitPhoneNo = employeeList.stream().flatMap(employee ->employee.getPhone().stream().filter(phone->phone.length() >=10)).collect(Collectors.toList());
		System.out.println(exact10DigitPhoneNo);
		System.out.println("--------------------------------------------------------------------------------");
		// Print all the email present in employee list.
		List<String> employeeEmail = employeeList.stream().map(Employee::getEmail).collect(Collectors.toList());
		System.out.println(employeeEmail);
		System.out.println("--------------------------------------------------------------------------------");

		System.out.println("--------------------------------------------------------------------------------");
		
		
		System.out.println("--------------------------------------------------------------------------------");
		
		
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println("--------------------------------------------------------------------------------");
		
		
		System.out.println("--------------------------------------------------------------------------------");
		
		
		System.out.println("--------------------------------------------------------------------------------");
		
		
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println("--------------------------------------------------------------------------------");
		
		
		
	}

}
