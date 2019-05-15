package com.jdk8.test1;

interface Lam1 {
	public void test();
}

interface Lam2 {
	public String test();
}

interface Lam3 {
	public String test(String str);
}

public class Lambda1 {

	public static void main(String[] args) {
		String str = "Diebold";
		// lambda implementation
		Lam1 lam = () -> {
			System.out.println("Lambda Says ->Hello " + str);
		};
		lam.test();
		
		// regular implementation
		Lam1 lam1 = new Lam1() {
			@Override
			public void test() {
				System.out.println("Hello " + str);
			}
		};
		lam1.test();
		
		Lam2 lm2 = () -> {
			return "Testing return statment in Lambda";
		};
		System.out.println(lm2.test());
		
		Lam3 lm3 = (str1) -> {
			return str1;
		};
		System.out.println(lm3.test("Hi Diebold Nixdorf"));
	}
}
