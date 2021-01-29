package com.programs.threads;

public class ThreadClassMethodsMain {

	/*
	 1. we know well that at a time only one thread is executed. If you sleep a thread for the specified time,
	 the thread shedular picks up another thread.
	 2. we can not start a thread twice (we ll get IllegalThreadStateException ).
	*/
	public static void main(String[] args) throws InterruptedException {
		MyThread1 mt1 = new MyThread1();
		MyThread2 mt2 = new MyThread2();
		MyThread2 mt3 = new MyThread2();
		MyThread3 mt4 = new MyThread3();
		System.out.println("main Thread1");
		mt1.start();
		//mt1.start(); //java.lang.IllegalThreadStateException .
		mt2.start();
		mt3.start();
		mt4.run();//fine, but does not start a separate call stack instated it will execute in same stack.
		
		System.out.println("main Thread2");

	}
}

class MyThread1 extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(1000); // Thread will sleep for 1 second for every loop.
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("Child Thread1=" + i);
		}
	}
}

class MyThread2 extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Child Thread2=" + i);
		}
	}
}

class MyThread3 extends Thread {
	public void run() {
		System.out.println("Child Thread3");
	}
}