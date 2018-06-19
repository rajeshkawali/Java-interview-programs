package com.programs.threads;

public class MultithreadRunnableInterfaceMain {

	public static void main(String[] args) {
		int n = 8; // Number of threads
		for (int i = 0; i < n; i++) {
			Thread object = new Thread(new MultithreadRunnableInterface());
			object.start();
		}
	}
}
