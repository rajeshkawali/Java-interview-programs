package com.programs.map;

import java.util.HashMap;
import java.util.Map;

public class EqualsAndHashCodeContract {

	public static void main(String[] args) {
		
		EmployeeClas e1 = new EmployeeClas(1, "Rajesh", "software");//Suppose we are not overriding hashCode and equals methods then we will get 2 object, if we override then we will get size is one object.
		EmployeeClas e2 = new EmployeeClas(1, "Rajesh", "software");

		Map<EmployeeClas, String> m = new HashMap<EmployeeClas, String>();
		m.put(e1, "e1");
		m.put(e2, "e1");

		e1.setName("Mahesh");
		System.out.println(e1.getName());
		System.out.println(m.size());
		for (Map.Entry<EmployeeClas, String> entry : m.entrySet()) {
			System.out.println("Key : " + entry.getKey().name + "\nValue : " + entry.getValue());
		}
		System.out.println("------------------------------------------------------------------");
		String str1 = "abc";
		String str2 = new String("abc");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put(str1, 1111);
		map.put(str2, 2222);
		map.put("abc",3333);

		String str3 = new String("abc");
		String str4 = "abc";
		System.out.println(map.get(str3));
		System.out.println(map.get(str4));
		System.out.println(map.keySet().size());
	}
}

class EmployeeClas {
	int id;
	String name;
	String department;
	
	public EmployeeClas(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	// Check once after removing equals and hashCode methods
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeClas other = (EmployeeClas) obj;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
