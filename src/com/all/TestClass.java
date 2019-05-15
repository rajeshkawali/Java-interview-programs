package com.all;
class A {
	public void MethodA() {
		System.out.println("Method--A");
	}

	public void Method(String s1) {
		System.out.println("Method--A--s1==>" + s1);
	}
}

class B extends A {
	public void MethodB() {
		System.out.println("Method--B");
	}

	public void Method(String s1) {
		System.out.println("Method--B--s1==>" + s1);
	}
	public int Method(String s1,String s2) {
		System.out.println("Method--B--s1==>" + s1);
		return 0;
	}
}

public class TestClass {

	public static void main(String[] args) {

		// B b = new B();
		A b = new B();
		// b.MethodA();
		// b.MethodB();
		// b.Method();
		b.Method("Rajesh");

		System.out.println("Main Method...");

	}
}
