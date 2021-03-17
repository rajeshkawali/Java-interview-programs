package com.programs.threads;
//you can not directly call run method to start a thread. You need to call start method to create a new thread.
//If you call run method directly , it won’t create a new thread and it will be in same stack as main.
class CustomThread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println("Thread is running :" + i);
		}
	}
}

public class StartThreadUsingStartAndRunMethod {
	public static void main(String[] args) {
		CustomThread ct1 = new CustomThread();
		CustomThread ct2 = new CustomThread();
		ct1.run();
		ct2.run();
		System.out.println("------------------------------------");
		ct1.start();
		ct2.start();
	}
}

/*
Thread is running :0
Thread is running :1
Thread is running :2
Thread is running :3
Thread is running :4
Thread is running :0
Thread is running :1
Thread is running :2
Thread is running :3
Thread is running :4
------------------------------------
Thread is running :0
Thread is running :0
Thread is running :1
Thread is running :1
Thread is running :2
Thread is running :2
Thread is running :3
Thread is running :3
Thread is running :4
Thread is running :4
*/