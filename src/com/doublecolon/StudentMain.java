package com.doublecolon;

//Constructor reference example
public class StudentMain {

	public static void main(String[] args) {

		//Lambda Expression
		StudentInterface obj = () -> {
			Student std = new Student(); 
			return std;
		};
		//Student constructor
		obj.getStudent();
		
		//Lambda Expression with minimal 
		StudentInterface obj2 = () -> new Student();
		//Student constructor
		obj2.getStudent();
		
		//constructor reference
		StudentInterface obj3 = Student::new;
		obj3.getStudent();
		
	}

}
