package com.program.string;

class StringTestA {
	public static void test() {
		System.out.println("StringTestA");
	}
}

class StringTestB extends StringTestA {
	public static void test() {
		System.out.println("StringTestB");
	}
}

public class StringTest {

	public static void main(String[] args) {
		StringTestB b = new StringTestB();
		StringTestA a = new StringTestA();
		StringTestA a1 = b;
		//StringTestB b1 = (StringTestA)a;
		a.test();
		b.test();
		
		a1.test();
		//b1.test();
	}

}
