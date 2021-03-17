package com.programs.collection;
// Java program to demonstrate 

// ArrayBlockingQueue 

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueDemo {

	public static void main(String[] args) {
		// define capacity of ArrayBlockingQueue
		int capacity = 15;

		// create object of ArrayBlockingQueue
		// using ArrayBlockingQueue(int initialCapacity)
		// constructor
		ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<Integer>(capacity);
		//BlockingQueue<Integer> abq = new ArrayBlockingQueue<Integer>(capacity);

		// add numbers
		abq.add(1);
		abq.add(2);
		abq.add(3);

		// print queue
		System.out.println("ArrayBlockingQueue:" + abq);
	}
}
/*
ArrayBlockingQueue: ArrayBlockingQueue is a class in Java that implements the BlockingQueue interface. 
ArrayBlockingQueue class and its iterator implement all the optional methods of the Collection and Iterator interfaces. 
ArrayBlockingQueue is a bounded BlockingQueue backed by an array. Here, bounded means the size of the 
Queue is finite and fixed. Once created, we cannot grow or shrink the size of the Queue. If we try to 
insert an element into a full Queue then it will result in the operation blocking. Similarly, 
if we try to take an element from an empty Queue, then also the operation will be blocked. 
ArrayBlockingQueue stores the elements in the Queue internally in the FIFO (first-in-first-out) order. 
The element at the head or front of the Queue is the oldest element of all the elements present in this queue. 
The element at the tail of this queue is the newest element of all the elements of this queue. 
The new elements are always inserted at the end or tail of the queue and the retrieval operations obtain elements 
at the head of the queue.

LinkedBlockingQueue: LinkedBlockingQueue is a class in Java that implements the BlockingQueue interface. 
LinkedBlockingQueue is an optionally-bounded BlockingQueue backed by linked nodes. Here, 
optionally-bounded means the capacity given to LinkedBlockingQueue is bounded, otherwise, 
it will be unbounded. The capacity can be given as a parameter to the constructor of LinkedBlockingQueue. 
The capacity, if unspecified, is equal to Integer.MAX_VALUE. LinkedBlockingQueue class and its iterator implement 
all the optional methods of the Collection and Iterator interfaces. LinkedBlockingQueue stores the elements in the 
Queue internally in the FIFO (first-in-first-out) order. The element at the head or front of the Queue is the oldest 
element of all the elements present in this queue. The element at the tail of this queue is the newest 
element of all the elements of this queue. The new elements are always inserted at the end or tail of the queue 
and the retrieval operations obtain elements at the head of the queue. Linked queues typically have higher 
throughput than array-based queues but less predictable performance in most concurrent applications.
 */
