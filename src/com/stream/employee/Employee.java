package com.stream.employee;

import java.util.List;

public class Employee {
	private int id;
	private String name;
	private int age;
	private String email;
	private int salary;
	private String department;
	private List<String> phone;

	public Employee() {
		
	}
	
	public Employee(int id, String name, int age, String email, int salary, String department, List<String> phone) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", phone=" + phone + "]";
	}

}