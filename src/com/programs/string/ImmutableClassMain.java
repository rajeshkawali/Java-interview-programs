package com.programs.string;

final class Employee {
	private final String empName;
	private final int age;
	private final Address address;

	public Employee(String name, int age, Address address) {
		super();
		this.empName = name;
		this.age = age;
		this.address = address;
	}

	public String getEmpName() {
		return empName;
	}

	public int getAge() {
		return age;
	}

	/*
	 * public Address getAddress() { return address; }
	 */
	public Address getAddress() throws CloneNotSupportedException {
		return (Address) address.clone();
	}
}

// Address.java
class Address implements Cloneable {
	public String addressType;
	public String address;
	public String city;

	public Address(String addressType, String address, String city) {
		super();
		this.addressType = addressType;
		this.address = address;
		this.city = city;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Address Type - " + addressType + ", address - " + address + ", city - " + city;
	}
}

// MainClass.java
public class ImmutableClassMain {
	public static void main(String[] args) throws Exception {
		Employee emp = new Employee("Adithya", 34, new Address("Home", "Madhapur", "Hyderabad"));
		Address address = emp.getAddress();
		System.out.println(address);
		address.setAddress("Silicon City");
		address.setAddressType("Office");
		address.setCity("Bangalore");
		System.out.println(emp.getAddress());
	}
}