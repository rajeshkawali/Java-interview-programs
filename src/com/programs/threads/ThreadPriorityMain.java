package com.programs.threads;

public class ThreadPriorityMain {

	// 1.Daemon thread in java is a service provider thread that provides services to the user thread.
	// 2.when all the user threads dies, JVM terminates this thread automatically.(It is a low priority thread.)
	// 3.If you want to make a user thread as Daemon, it must not be started otherwise it will throw IllegalThreadStateException.
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		t1.setDaemon(true);// now t1 is daemon thread.
		t1.start();
		//t1.setDaemon(true);// it will throw IllegalThreadStateException.
		t2.start();
		t3.start();
		t3.setPriority(MyThread.MIN_PRIORITY);// Set Thread to Max Priority (1).
		t2.setPriority(MyThread.MAX_PRIORITY);// Set Thread to Max Priority (10).
		System.out.println("Name of t1 : " + t1.getName());
		System.out.println("Name of t2 : " + t2.getName());
		System.out.println("Name of t3 : " + t3.getName());
		System.out.println("Priority of t1 : " + t1.getPriority()); // NORM_PRIORITY (5).
		System.out.println("Priority of t2 : " + t2.getPriority());
		System.out.println("Priority of t3 : " + t3.getPriority());
	}
}

class Test extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) { // checking for daemon thread
			System.out.println("Daemon thread work :"+Thread.currentThread().getName());
		} else {
			System.out.println("User thread work :"+Thread.currentThread().getName());
		}
	}
}
