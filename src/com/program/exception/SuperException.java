package com.program.exception;
class SuperExceptionTest{
	void test() throws Exception{
		System.out.println("Super");
	}
}
class SuperExceptionTestSub extends SuperExceptionTest{
	void test() throws ClassNotFoundException{
		System.out.println("sub");
	}
}
public class SuperException {

	public static void main(String[] args)  throws Throwable{
		SuperExceptionTestSub s = new SuperExceptionTestSub();
		s.test();

	}

}
