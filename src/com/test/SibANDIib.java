package com.test;

class SIBandIIB1 {
	
	SIBandIIB1() {
		System.out.println("SIBandIIB1-constructor..");
	}

	{
		System.out.println("SIBandIIB1-IIB..");
	}

	static {
		System.out.println("SIBandIIB1-SIB..");
	}
}

class SIBandIIB2 extends SIBandIIB1 {
	
	SIBandIIB2() {
		System.out.println("SIBandIIB2-constructor..");
	}

	{
		System.out.println("SIBandIIB2-IIB..");
	}

	static {
		System.out.println("SIBandIIB2-SIB..");
	}
}

public class SibANDIib {

	public static void main(String[] args) {

		//SIBandIIB1 a = new SIBandIIB1();
		SIBandIIB2 s = new SIBandIIB2();

	}
}
/*
 SIBandIIB2 s = new SIBandIIB2(); 
 
SIBandIIB1-SIB..
SIBandIIB2-SIB..
SIBandIIB1-IIB..
SIBandIIB1-constructor..
SIBandIIB2-IIB..
SIBandIIB2-constructor..

*/
