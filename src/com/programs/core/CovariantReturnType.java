package com.programs.core;
//Covariant return type means if subclass overrides any method, 
//return type of this overriding method can be subclass of return type of base class method.
public class CovariantReturnType {

	public A m1() {
		System.out.println("In BaseClass method");
		return new A();
	}

	public static void main(String args[]) {
		CovariantReturnType b = new SubClass();
		b.m1();
	}
}

class SubClass extends CovariantReturnType {
	public B m1() {
		System.out.println("In SubClass method");
		return new B();
	}
}

class A {
}

class B extends A {

}