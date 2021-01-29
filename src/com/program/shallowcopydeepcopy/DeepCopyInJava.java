package com.program.shallowcopydeepcopy;
/*
 Deep copy of an object will have exact copy of all the fields of original object just like shallow copy. 
 But in additional, if original object has any references to other objects as fields, 
 then copy of those objects are also created by calling clone() method on them. 
 That means clone object and original object will be 100% disjoint. They will be 100% independent of each other. 
 Any changes made to clone object will not be reflected in original object or vice-versa.
 */
class Course implements Cloneable {
	String subject1;
	String subject2;
	String subject3;

	public Course(String sub1, String sub2, String sub3) {
		this.subject1 = sub1;
		this.subject2 = sub2;
		this.subject3 = sub3;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Student implements Cloneable {
	int id;
	String name;
	Course course;

	public Student(int id, String name, Course course) {
		this.id = id;
		this.name = name;
		this.course = course;
	}

	// Overriding clone() method to create a deep copy of an object.
	protected Object clone() throws CloneNotSupportedException {
		Student student = (Student) super.clone();
		student.course = (Course) course.clone();
		return student;
	}
}

public class DeepCopyInJava {
	public static void main(String[] args) {
		Course science = new Course("Physics", "Chemistry", "Biology");
		Student student1 = new Student(111, "John", science);
		Student student2 = null;
		try {
			// Creating a clone of student1 and assigning it to student2
			student2 = (Student) student1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		// Printing the subject3 of 'student1'
		System.out.println(student1.course.subject3); // Output : Biology

		// Changing the subject3 of 'student2'
		student2.course.subject3 = "Maths";

		// This change will not be reflected in original student 'student1'
		System.out.println(student1.course.subject3); // Output : Biology
	}
}
/*

Shallow Copy																			Deep Copy
Cloned Object and original object are not 100% disjoint.								Cloned Object and original object are 100% disjoint.
Any changes made to cloned object will be reflected in original object or vice versa.	Any changes made to cloned object will not be reflected in original object or vice versa.
Default version of clone method creates the shallow copy of an object.					To create the deep copy of an object, you have to override clone method.
Shallow copy is preferred if an object has only primitive fields.						Deep copy is preferred if an object has references to other objects as fields.
Shallow copy is fast and also less expensive.											Deep copy is slow and very expensive.


*/