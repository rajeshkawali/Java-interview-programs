package com.program.exception;

public class ThrowException {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("Start...");
		if (true) {
			throw new NullPointerException();
			//throw new ClassNotFoundException(); // Unhandled exception type ClassNotFoundException
		}
		System.out.println("End...");
	}

}
