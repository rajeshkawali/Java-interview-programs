package com.test;

class InhA{
	public void printMsg() {
		System.out.println("I am A");
	}
}
class InhB extends InhA{
	public void printMsg() {
		System.out.println("I am B");
	}
}
class InhC extends InhB{
	public void printMsg() {
		System.out.println("I am C");
	}
}

public class InheritanceTest {
	public static void main(String[] args) {
		
		InhA c = new InhB();
		c.printMsg();
	}
}
