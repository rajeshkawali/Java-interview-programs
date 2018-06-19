package com.program.exception;
class TestReturn2 {
	int test() {
		
		try{
			return 22;
		}catch(ArithmeticException e){
			
		}catch(Exception e){
			return 33;
		}
		return 44; // remove this one
	}
}
public class ExceptionTest2 {

	public static void main(String[] args) {
		TestReturn2 a = new TestReturn2();
		System.out.println(a.test());
	}

}
