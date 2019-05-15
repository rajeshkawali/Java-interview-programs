package com.all;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Employee {
	int id;
	String name;
	int marks;

	Employee() {
	}

	public Employee(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", marks=" + marks + "]";
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

	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}

class CustomComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		 /*if(o1.id == o2.id){
	            return 0;
	        }else{
	            return o2.marks - o1.marks;
	        }*/
		//return o2.marks - o1.marks;
		return o1.getName().compareTo(o2.getName());
		//return o1.id - o2.id;
	}
}
public class ComparatorTest {
	public static void main(String[] args) {

		CustomComparator compare = new CustomComparator();
		TreeSet<Employee> ts = new TreeSet<Employee>(compare);
		ts.add(new Employee(3, "rajesh1", 88));
		ts.add(new Employee(5, "pankaj", 75));
		ts.add(new Employee(1, "rajesh3", 66));
		ts.add(new Employee(4, "anil", 42));
		ts.add(new Employee(2, "rajesh5", 11));
		
		Iterator<Employee> it = ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
            /*
            		Employee [id=1, name=rajesh, marks=66]
            		Employee [id=2, name=rajesh, marks=11]
            		Employee [id=3, name=rajesh, marks=88]
            		Employee [id=4, name=rajesh, marks=42]
            		Employee [id=5, name=rajesh, marks=75]
            */
        }
	}
}
