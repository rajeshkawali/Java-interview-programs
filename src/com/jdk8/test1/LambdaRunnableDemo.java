package com.jdk8.test1;

class ThreadDemo extends Thread {

	public void run() {
		try {
			Thread.sleep(2000);
			System.out.println("ThreadDemo is running...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class LambdaRunnableDemo {

	public static void main(String[] args) {

		// Thread Example without lambda
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("Thread1 is running...");
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		// Thread Example with lambda
		Runnable r2 = () -> {
			System.out.println("Thread2 is running...");
		};
		Thread t2 = new Thread(r2);
		t2.start();

		ThreadDemo t3 = new ThreadDemo();
		// t3.run();
		t3.start();
	}
}
