package com.programs.threads;

import java.util.concurrent.CountDownLatch;
/*

CountDownLatch is synchronisation aid that allow one or more threads to wait 
until set of operations being performed in other threads completes.
So in other words, CountDownLatch waits for other threads to complete set of operations.
CountDownLatch is initialized with count. Any thread generally main threads calls latch.awaits() method, 
so it will wait for either count becomes zero or it’s interrupted by another thread and all 
other thread need to call latch.countDown() once they complete some operation.
So count is reduced by 1 whenever latch.countDown() method get called, 
so if count is n that means count can be used as n threads have to complete 
some action or some action have to be completed n times.

One of disadvantage of CountDownLatch is you can not reuse it once count is zero. For that ,you need to use CyclicBarrier.

 */
public class CountDownLatchMain {

	public static void main(String[] args) {
		try {
			CountDownLatch latch = new CountDownLatch(3);

			// Initializing three dependent thread i.e. UI, database and logging
			UIInitialization uiInitialization = new UIInitialization(latch);
			Thread uiThread = new Thread(uiInitialization);

			DatabaseInitialization dataBaseInitialization = new DatabaseInitialization(latch);
			Thread databaseThread = new Thread(dataBaseInitialization);

			LoggingInitialization loggingInitialization = new LoggingInitialization(latch);
			Thread loggingThread = new Thread(loggingInitialization);

			uiThread.start();
			databaseThread.start();
			loggingThread.start();
			// Main thread will wait until above threads get completed
			latch.await();

			System.out.println("Initialization has been completed, main thread can proceed now");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class DatabaseInitialization implements Runnable {

	CountDownLatch latch;
	DatabaseInitialization(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("Initializing Database");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done with database Initialization");
		latch.countDown();
	}
}

class LoggingInitialization implements Runnable {

	CountDownLatch latch;
	LoggingInitialization(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("Initializing Logging");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done with Logging Initialization");
		latch.countDown();
	}
}

class UIInitialization implements Runnable {

	CountDownLatch latch;
	UIInitialization(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("Initializing UI");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done with UI Initialization");
		latch.countDown();
	}
}
