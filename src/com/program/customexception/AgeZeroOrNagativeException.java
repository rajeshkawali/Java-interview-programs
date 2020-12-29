package com.program.customexception;

public class AgeZeroOrNagativeException extends ArithmeticException {
	private static final long serialVersionUID = 1L;

	public AgeZeroOrNagativeException() {

	}
	public AgeZeroOrNagativeException(String message) {
		super(message);
	}
}
