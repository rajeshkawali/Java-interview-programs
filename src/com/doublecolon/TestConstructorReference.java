package com.doublecolon;

interface C {
	public Employee getEmployee();
}

interface D {
	public Employee getEmployee(String name, int age);
}

class Employee {
	String eName;
	int eAge;

	public Employee() {
	}

	public Employee(String eName, int eAge) {
		this.eName = eName;
		this.eAge = eAge;
	}

	public void getInfo() {
		System.out.println("I am a method of class Employee");
	}
}

public class TestConstructorReference {

	public static void main(String[] args) {

		// *** Using Lambda Expression ***//
		C c1 = () -> new Employee();
		c1.getEmployee().getInfo();
		D d1 = (name, age) -> new Employee(name, age);
		d1.getEmployee("Tony", 34).getInfo();

		// *** Using Method Reference ***//
		C c2 = Employee::new;
		c2.getEmployee().getInfo();
		D d2 = Employee::new;
		d2.getEmployee("Tony", 34).getInfo();
	}
}