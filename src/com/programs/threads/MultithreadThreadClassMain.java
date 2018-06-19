package com.programs.threads;

public class MultithreadThreadClassMain {

	public static void main(String[] args) {
		int n = 8; // Number of threads
		for (int i = 0; i < n; i++) {
			MultithreadThreadClass object = new MultithreadThreadClass();
			object.start();
		}
	}
}
