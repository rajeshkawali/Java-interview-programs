package com.program.exception;
class TestReturn4 {
	int test() {
		
		try{
			return 22;
		}catch(Exception e){
			return 33;
		}finally{
			
		}
		// return 44; // CTE
	}
}
public class ExceptionTest4 {

	public static void main(String[] args) {
		TestReturn4 a = new TestReturn4();
		System.out.println(a.test());

	}

}
