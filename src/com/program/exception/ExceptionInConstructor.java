package com.program.exception;
class ABCTest{
	ABCTest() throws ClassNotFoundException{
		
	}
}
class ABCTest2 extends ABCTest{
	ABCTest2() throws ClassNotFoundException{
		super();
	}
}
public class ExceptionInConstructor {

	public static void main(String[] args) {
		try {
			ABCTest2 g = new ABCTest2();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
