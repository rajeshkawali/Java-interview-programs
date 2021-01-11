package com.programs.map;

import java.util.HashMap;
import java.util.Map;

class EmployeeTest {
	private int id;
	private String name;

	public EmployeeTest() {
	}

	public EmployeeTest(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object o) {
		EmployeeTest e = (EmployeeTest) o;
		return this.name.contains(e.name);
	}
}

public class EmployeeHashingTest {

	public static void main(String[] args) {

		EmployeeTest e = new EmployeeTest();
		HashMap m = new HashMap();

		m.put(new EmployeeTest(10, "Rajesh"), "Rajesh");
		m.put(new EmployeeTest(20, "Mahesh"), "Mahesh");
		m.put(new EmployeeTest(10, "Rajesh"), "Rajesh");

		System.out.println(m);
		m.forEach((k, v) -> System.out.println("Key : " + k.hashCode() + " Value : " + v));
	}

}
