package com.program.exception;

public class ExceptionReturn {

	@SuppressWarnings("finally")
	static int test(String s) {
		try {
			System.exit(0);
			System.out.println("try....");
			int i = Integer.parseInt(s);
			return i;
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return 0;
		} finally {
			return 99;
		}
	}
	public static void main(String[] args) {
		System.out.println("Start");
		int value = 0;
		//int value = ExceptionReturn.test("11");
		//System.out.println("value1==>"+value);
		value = ExceptionReturn.test("abc");
		System.out.println("value2==>"+value);
	}
}