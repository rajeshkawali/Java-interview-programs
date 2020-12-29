package com.program.exception;

public class ExceptionChainingExp2 {

	public static void main(String[] args) {
		System.out.println("Start");
		test1();
		System.out.println("main -end");
	}

	static void test1() {

		System.out.println("test1()");
		test2();
		System.out.println("1 end");
	}

	static void test2() {
		System.out.println("test2()");
		test3();
		System.out.println("2 end");
	}

	static void test3() {
		System.out.println("test3()");

		try {
			test4();
		} catch (ArithmeticException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("3 end");
	}

	static void test4() throws ClassNotFoundException {
		System.out.println("test4()");
		Class.forName("");
		int i = 10 / 0;

		System.out.println("4 end");
	}
}
