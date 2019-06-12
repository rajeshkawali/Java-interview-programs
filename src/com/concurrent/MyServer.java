package com.concurrent;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

class MyServer {
	static Executor threadPool = Executors.newFixedThreadPool(10);

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocketObj = new ServerSocket(9000);
		while (true) {
			final Socket socketObj = serverSocketObj.accept();
			Runnable runnable = new Runnable() {
				public void run() {
					SomeTask(socketObj);
				}
			};
			threadPool.execute(runnable);
		}
	}

	static void SomeTask(Socket socket) {
//Some code
		System.out.println("number=>");
	}
}