package com.stream.employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEmployeeMain {
	
	public static List<Employee> getAllEmployee() {
		List<Employee> employeeList = Arrays.asList(
				new Employee(1, "Rajesh", 32, "rajesh@gmail.com", Arrays.asList("8169447937", "90955447")),
				new Employee(2, "Mahesh", 29, "mahesh@gmail.com", Arrays.asList("91445935", "7948559467")),
				new Employee(3, "Vidya", 27, "vidya@gmail.com", Arrays.asList("869493", "89454")),
				new Employee(4, "Rajesh", 18, "rajesh@gmail.com", Arrays.asList("47474747", "8946069767")),
				new Employee(5, "Vikram", 6, "vikram@gmail.com", Arrays.asList("81937", "94068")),
				new Employee(6, "Keshav", 22, "keshav@gmail.com", Arrays.asList("9164937447", "9478683067")),
				new Employee(7, "Kiran", 22, "kiran@gmail.com", Arrays.asList("91937447", "947683067")));
		return employeeList;
	}

	public static void main(String[] args) {
		
		System.out.println("--------------------------------------------------------------------------------");
		Employee employee = new Employee(1,"Rajesh", 32, "rajesh@gmail.com", Arrays.asList("8169447937", "839409467"));
				
		System.out.println(employee);
	    //Optional -->A container object which may or may not contain a non-null value. If a value is present, isPresent() will return true and get() will return the value.
		//There are 3 static methods --> 1)empty  2)of  3)ofNullable
		//-----------------------------------------------------------------------------------------------------
		//Optional.empty() --> Which Returns an empty Optional instance. No value is present for this Optional.
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);
        //-----------------------------------------------------------------------------------------------------
        //Optional.of() --> It must be non-null. Which will throw exception if provided values contain null(java.lang.NullPointerException).
        //Optional<String> emailOptional = Optional.of(employee.getEmail());
        //System.out.println(emailOptional);
        //System.out.println("Throwing exception if present null value");
        System.out.println("--------------------------------------------------------------------------------");
        //Optional.ofNullable() -->It can be null(Not throwing any exception). Returns an Optional describing the specified value, if non-null, otherwise returns an empty Optional.
        Optional<String> emailOptional2 = Optional.ofNullable(employee.getEmail());
        System.out.println(emailOptional2); // Optional[rajesh@gmail.com]
		System.out.println("--------------------------------------------------------------------------------");
		Employee employee3 = new Employee(1,"Rajesh", 32, null, Arrays.asList("8169447937", "839409467"));
		Optional<String> emailOptional3 = Optional.ofNullable(employee3.getEmail());
		System.out.println("Not throwing any exception even if present null value: "+emailOptional3);
		System.out.println("--------------------------------------------------------------------------------");
		Optional<String> emailOptional = Optional.ofNullable(employee.getEmail());
		System.out.println(emailOptional.get()); // get() --> If a value is present in this Optional, returns the value, otherwise throws NoSuchElementException.
		if(emailOptional.isPresent()){  // isPresent() --> Return true if there is a value present, otherwise false.
			System.out.println("Value present :"+emailOptional);// Value present :Optional[rajesh@gmail.com]
		}
		System.out.println("--------------------------------------------------------------------------------");
		Employee employee4 = new Employee(1,"Rajesh", 32, null, Arrays.asList("8169447937", "839409467"));
		Optional<String> emailOptional4 = Optional.ofNullable(employee4.getEmail());
		System.out.println(emailOptional4.orElse("If value of email is null then Print default value"));//orElse()--> takes string 
		System.out.println("--------------------------------------------------------------------------------");
		//Optional<String> emailOptional5 = Optional.ofNullable(employee4.getEmail());
		//System.out.println(emailOptional5.orElseThrow(() -> new IllegalArgumentException("If value of email is null then We can throw exception")));
		//System.out.println(orElseThrow() --> Return the contained value, if present, otherwise throw an exceptionto be created by the provided supplier.
		System.out.println("--------------------------------------------------------------------------------");
		Optional<String> emailOptional6 = Optional.ofNullable(employee4.getEmail());
		System.out.println(emailOptional6.map(String::toUpperCase).orElseGet(()->"If value of email is null then Print default value using orElseGet(supplier)")); ////orElseGet()--> takes Supplier 
		System.out.println("--------------------------------------------------------------------------------");
		//Find the employee using the name and get all the details of that employee.
		Employee empName = getEmployeeByName("Rajesh");
		System.out.println(empName.getPhone().get(1));
		System.out.println(empName);
		System.out.println("--------------------------------------------------------------------------------");
		// Find the email in the list and get it with upper case.
		String emailId = getEmployeeByEmailWithUpperCase("rajesh@gmail.com");
		System.out.println(emailId);
		System.out.println("--------------------------------------------------------------------------------");
		// Find the phone number in Employee nested List.
		String phone = getEmployeeByPhoneNumber("47474747");
		System.out.println(phone);
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println("--------------------------------------------------------------------------------");
	}
	
	public static Employee getEmployeeByName(String name) {
		List<Employee> employeeList = getAllEmployee();
		return employeeList.stream()
				.filter(employee -> employee.getName().equals(name)) // find the name in the employee list
				.findAny() // Returns an Optional describing some element of the stream, or an empty Optional if the stream is empty. 
				.orElse(new Employee()); // or default values
	}
	
	public static String getEmployeeByEmailWithUpperCase(String email) {
		List<Employee> employeeList = getAllEmployee();
		return employeeList.stream()
				.filter(employee -> employee.getEmail().equals(email))
				.map(employee ->employee.getEmail().toUpperCase())
				.findAny()// find the name in the employee list
				.orElseGet(()->"Not Found");
	}
	
	public static String getEmployeeByPhoneNumber(String phone) {
		List<Employee> employeeList = getAllEmployee();
		return employeeList.stream()
				.flatMap(employee ->employee.getPhone().stream().filter(p->p.equals(phone)))
				.findAny()// find the phone in the employee list
				.orElseGet(()->"Not Found");
	}

}
