package com.programs.core;

import java.util.HashSet;

class Employee {
	private int id;
	private String name;

	Employee() {
		System.out.println("Default cons...");
	}

	Employee(int id, String name) {
		this.id=id;
		this.name=name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void set(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public String toString(){
		return "id="+id+"\t name="+name;
	}
	public int hashCode(){
		return this.id;
	}
	public boolean equals(Object obj){
		Employee emp = (Employee)obj;
		return this.id==emp.id && this.getName().equals(emp.getName());
	}
}

public class HashMap2ObjectsCheck {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		HashSet emp = new HashSet();
		
		emp.add(new Employee(1,"Rajesh"));
		emp.add(new Employee(2,"Pankaj"));
		emp.add(new Employee(3,"Jay"));
		emp.add(new Employee(1,"Rajesh"));
		
		for(Object e :emp){
			
			System.out.println(e.hashCode());
		}
		
		
		
	}

}
