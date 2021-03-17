package com.programs.threads;
//JAVA program to demonstrate execution on Cyclic Barrier 

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
/*
 CyclicBarrier is used to make threads wait for each other. It is used when different 
 threads process a part of computation and when all threads have completed the execution, 
 the result needs to be combined in the parent thread. In other words, a CyclicBarrier is 
 used when multiple thread carry out different sub tasks and the output of these sub tasks need to be combined 
 to form the final output. After completing its execution, threads call await() method and wait for 
 other threads to reach the barrier. Once all the threads have reached, 
 the barriers then give the way for threads to proceed.
 */
class Computation1 implements Runnable {
	public static int product = 0;

	public void run() {
		product = 2 * 3;
		try {
			CyclicBarrierMain.newBarrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}

class Computation2 implements Runnable {
	public static int sum = 0;

	public void run() {
		// check if newBarrier is broken or not
		System.out.println("Is the barrier broken? - " + CyclicBarrierMain.newBarrier.isBroken());
		sum = 10 + 20;
		try {
			CyclicBarrierMain.newBarrier.await(3000, TimeUnit.MILLISECONDS);

			// number of parties waiting at the barrier
			System.out.println("Number of parties waiting at the barrier " + "at this point = "
					+ CyclicBarrierMain.newBarrier.getNumberWaiting());
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
}

public class CyclicBarrierMain implements Runnable {
	public static CyclicBarrier newBarrier = new CyclicBarrier(3);

	public static void main(String[] args) {
		// parent thread
		CyclicBarrierMain test = new CyclicBarrierMain();

		Thread t1 = new Thread(test);
		t1.start();
	}

	public void run() {
		System.out.println("Number of parties required to trip the barrier = " + newBarrier.getParties());
		System.out.println("Sum of product and sum = " + (Computation1.product + Computation2.sum));

		// objects on which the child thread has to run
		Computation1 comp1 = new Computation1();
		Computation2 comp2 = new Computation2();

		// creation of child thread
		Thread t1 = new Thread(comp1);
		Thread t2 = new Thread(comp2);

		// moving child thread to runnable state
		t1.start();
		t2.start();

		try {
			CyclicBarrierMain.newBarrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}

		// barrier breaks as the number of thread waiting for the barrier
		// at this point = 3
		System.out.println("Sum of product and sum = " + (Computation1.product + Computation2.sum));

		// Resetting the newBarrier
		newBarrier.reset();
		System.out.println("Barrier reset successful");
	}
}
