package com.test;

class ThreadClass extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Running...");
		}
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		ThreadClass t = new ThreadClass();
		for (int i = 0; i < 100; i++) {
			System.out.println("Main...");
		}
		t.start();
	}
}
