package com.program.exception;
class TestReturn3 {
	int test() {
		
		try{
			return 22;
		}catch(Exception e){
			return 33;
		}finally{
			return 44; 
		}
		// return 44; // CTE
	}
}
public class ExceptionTest3 {

	public static void main(String[] args) {
		TestReturn3 a = new TestReturn3();
		System.out.println(a.test());

	}

}
