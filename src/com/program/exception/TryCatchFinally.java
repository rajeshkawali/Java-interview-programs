package com.program.exception;

public class TryCatchFinally {

	public static void main(String[] args) {

		try {
			System.out.println("1");
			//Class.forName("");
			int i = 10 / 0;
			System.out.println("2");
		} catch (ArithmeticException e) {
			System.out.println("3");
			int j = 10 / 0;
			System.out.println("4");
		} finally {
			System.out.println("fanally");
		}
	}
}
