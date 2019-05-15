package com.jdk8.test1;

@FunctionalInterface
interface Lam {
	public int summation(int n);
}

@FunctionalInterface
interface Lambda {
	public Integer testing();
}

public class Lambda2 {

	public static void main(String[] args) {
		Lam l = (int num) -> {
			return 10 + num;
		};
		int val = l.summation(15);
		System.out.println("Return Sum = "+val);
		
		Lambda lb = () -> {
			int a = 10;
			int b = 30;
			return a+b;
		};
		System.out.println("Sum = "+lb.testing());
	}

}
