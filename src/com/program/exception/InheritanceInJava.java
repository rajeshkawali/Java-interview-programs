package com.program.exception;

class A {
	int i;
	void methodOne() {
		System.out.println("From Class A");
	}
}

class B extends A {

	void methodOne() {
		System.out.println("From Class B");
	}
}
class C extends B {

	void methodOne() {
		System.out.println("From Class B");
	}
}

public class InheritanceInJava {
	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		A ab = new B();
		
		b.methodOne();
		a.methodOne();
		ab.methodOne();
	}
}