package com.programs.casting;

class SuperA {
	SuperA() {
		System.out.println("SuperA-Constructor");
	}

	{
		System.out.println("SuperA-IIB");
	}
	static {
		System.out.println("SuperA-SIB");
	}
}

class ChaildB extends SuperA {
	ChaildB() {
		System.out.println("ChaildB-Constructor");
	}

	{
		System.out.println("ChaildB-IIB");
	}
	static {
		System.out.println("ChaildB-SIB");
	}
}

public class SIBandIIB {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		SuperA spr = new SuperA();
		// ChaildB chld1 = new ChaildB();
		System.out.println("------Main------");
		ChaildB chld1 = new ChaildB();
		//SuperA chld2 = new ChaildB();
	}

	static {
		System.out.println("Main-static");
	}
}