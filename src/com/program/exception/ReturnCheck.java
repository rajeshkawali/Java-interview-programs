package com.program.exception;

class TestReturn {
	int test() {
		if (true) {
			return 11;
		} else {
			
		}
		return 22;
	}
}

public class ReturnCheck {

	public static void main(String[] args) {
		TestReturn a = new TestReturn();
		System.out.println(a.test());

	}

}
