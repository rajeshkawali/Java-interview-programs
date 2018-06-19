package com.programs.threads;

public class ThreadMethodsMain {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.start();
		System.out.println("Name of t1 : "+t1.getName());  // Thread-0
		System.out.println("Name of t2 : "+t2.getName());  // Thread-1
		System.out.println("Id of t1 : "+t1.getId()); // 7
		t1.setName("Rajesh"); // To set the Name of Thread.
		System.out.println("Name of t1 : "+t1.getName());  // Rajesh
	}
}

class MyThread extends Thread {
	public void run(){
		System.out.println("Name Of Child Thread : "+Thread.currentThread().getName()); 
	}
}