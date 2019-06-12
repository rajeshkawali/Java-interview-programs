package com.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemo {
	private static ExecutorService executorServiceObj = null;
	private static volatile Future taskOneResults = null;
	private static volatile Future taskTwoResults = null;
	private static ExecutorService executor = null;

	public static void main(String[] args) {
		executor = Executors.newFixedThreadPool(1);
		while (true) {
			try {
				ExecuteTasks();
				Thread.sleep(5000);
			} catch (Exception e) {
				System.err.println("Exception: " + e.getMessage());
			}
		}
	}

	private static void ExecuteTasks() throws Exception {
		if (taskOneResults == null) {
			taskOneResults = executorServiceObj.submit(new MyTask());
		}
		if (taskTwoResults == null) {
			taskTwoResults = executorServiceObj.submit(new MyTask());
		}
	}
}

class MyTask implements Runnable {
	public void run() {
		while (true) {
			System.out.println("Executing task…");
			try {
				Thread.sleep(5000);
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
	}
}