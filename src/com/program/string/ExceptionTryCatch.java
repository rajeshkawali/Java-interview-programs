package com.program.string;

public class ExceptionTryCatch {

	public static void main(String[] args) {
		System.out.println(test());
	}
	@SuppressWarnings("finally")
	public static String test(){
		try {
			System.out.println("try...");
			return "1";
		} catch (Exception e) {
			System.out.println("catch...");
			return "2";
		}finally {
			System.out.println("finally...");
			return "3";
		}
	}

}
