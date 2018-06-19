package com.programs.threads;

public class SynchThreadTest {

	public static void main(String[] args) {
		Thread123 t = new Thread123();
		t.start();
	}
}

class Thread123 extends Thread{
	public void run(){
		System.out.println("Thread1...");
	}
}