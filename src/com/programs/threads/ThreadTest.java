package com.programs.threads;

public class ThreadTest {

	public static void main(String[] args) {

		/*
		1.The join() method waits for a thread to die. In other words, it causes the currently running 
		threads to stop executing until the thread it joins with completes its task.
		*/
		
		// Creating first thread
		Thread1 t1 = new Thread1();
		t1.start();

		for (int i = 0; i <= 10; i++) {
			if(i%2==0){
				System.out.println("Main Thread="+i);
			}
		}

		// Creating second thread
		Thread2 t2 = new Thread2();
		t2.start();
		
		try {
			System.out.println("---join1---");
			t1.join();
			System.out.println("---join2---");
			t2.join(2000); // join for 2 second.
			System.out.println("---join3---");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}

class Thread1 extends Thread {
	@Override
	public void run() {
		for (int i = 11; i <= 20; i++) {
			if(i%2==0){
				System.out.println("Child Thread1 even="+i);
			}
		}
	}
}

// Defining second thread with task
// The task of this thread is to print the numbers from 1001 to 2000
class Thread2 extends Thread {
	@Override
	public void run() {
		for (int i = 21; i <= 30; i++) {
			if(i%2!=0){
				System.out.println("Child Thread2 odd="+i);
			}
		}
	}
}
