package com.program.exception;

public class CustomExceptionMain {

	public static void main(String[] args) throws CustomException {
		System.out.println("Begin");
		//int i = 10 / 0;
		if(true){
			throw new CustomException("testing exception");
		}
		System.out.println("end");
	}
}

@SuppressWarnings("serial")
class CustomException extends Throwable {
	public CustomException() {

		System.out.println("error1");
	}
	public CustomException(String error) {

		System.out.println("error2===>"+error);
	}
}
