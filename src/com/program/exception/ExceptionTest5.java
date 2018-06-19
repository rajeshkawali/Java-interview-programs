package com.program.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

class TestReturn5 {
	int test() {
		// Class.forName(null); // Checked Exceptions
		try{
			
		}catch(Exception e){
			
		}finally{
			
		}
		 return 44; // CTE
	}
}
public class ExceptionTest5 {
	
	public static void main(String[] args) {
		TestReturn5 a = new TestReturn5();
		System.out.println(a.test());
		

	}

}
