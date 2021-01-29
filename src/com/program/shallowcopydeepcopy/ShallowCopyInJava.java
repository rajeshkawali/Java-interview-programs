package com.program.shallowcopydeepcopy;
/*
 The default version of clone() method creates the shallow copy of an object. 
 The shallow copy of an object will have exact copy of all the fields of original object. 
 If original object has any references to other objects as fields, 
 then only references of those objects are copied into clone object, 
 copy of those objects are not created. That means any changes made to those objects through 
 clone object will be reflected in original object or vice-versa. 
 Shallow copy is not 100% disjoint from original object. 
 Shallow copy is not 100% independent of original object.
 */
class Course2 {
	String subject1;
	String subject2;
	String subject3;

	public Course2(String sub1, String sub2, String sub3) {
		this.subject1 = sub1;
		this.subject2 = sub2;
		this.subject3 = sub3;
	}
}

class Student2 implements Cloneable {
	int id;
	String name;
	Course2 course;

	public Student2(int id, String name, Course2 course) {
		this.id = id;
		this.name = name;
		this.course = course;
	}

	// Default version of clone() method. It creates shallow copy of an object.
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ShallowCopyInJava {
	public static void main(String[] args) {
		Course2 science = new Course2("Physics", "Chemistry", "Biology");
		Student2 student1 = new Student2(111, "John", science);
		Student2 student2 = null;
		try {
			// Creating a clone of student1 and assigning it to student2
			student2 = (Student2) student1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		// Printing the subject3 of 'student1'
		System.out.println(student1.course.subject3); // Output : Biology

		// Changing the subject3 of 'student2'
		student2.course.subject3 = "Maths";

		// This change will be reflected in original student 'student1'
		System.out.println(student1.course.subject3); // Output : Maths
	}
}
/*

Shallow Copy																Deep Copy
Cloned Object and original object are not 100% disjoint.								Cloned Object and original object are 100% disjoint.
Any changes made to cloned object will be reflected in original object or vice versa.	Any changes made to cloned object will not be reflected in original object or vice versa.
Default version of clone method creates the shallow copy of an object.					To create the deep copy of an object, you have to override clone method.
Shallow copy is preferred if an object has only primitive fields.						Deep copy is preferred if an object has references to other objects as fields.
Shallow copy is fast and also less expensive.											Deep copy is slow and very expensive.


*/