package com.programs.casting;

class A {
	int i = 10;
}

class B extends A {
	int j = 20;
}

class C extends B {
	int k = 30;
}

class D extends C {
	int m = 40;
}

public class UpCasting {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		D d = new D();
		C c = d; // D type object is Auto-Up Casted to C type
		B b = d; // D type object is Auto-Up Casted to B type
		C c1 = new C();
		A a = c1; // C type object is Auto-Up Casted to A type
		A a1 = new B(); // B type object is Auto-Up Casted to A type
		System.out.println("Done");
	}
}