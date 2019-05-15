package com.socket.clientserver;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	private static final String host = "localhost";
	private static final int portNumber = 4444;

	private String userName;
	private String serverHost;
	private int serverPort;
	private Scanner userInputScanner;

	public static void main(String[] args) {
		String readName = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input username:");
		while (readName == null || readName.trim().equals("")) {
			// null, empty, whitespace(s) not allowed.
			readName = scan.nextLine();
			if (readName.trim().equals("")) {
				System.out.println("Invalid. Please enter again:");
			}
		}

		Client client = new Client(readName, host, portNumber);
		client.startClient(scan);
	}

	private Client(String userName, String host, int portNumber) {
		this.userName = userName;
		this.serverHost = host;
		this.serverPort = portNumber;
	}

	private void startClient(Scanner scan) {
		try {
			Socket socket = new Socket(serverHost, serverPort);
			Thread.sleep(1000); // waiting for network communicating.

			ServerThread serverThread = new ServerThread(socket, userName);
			Thread serverAccessThread = new Thread(serverThread);
			serverAccessThread.start();
			while (serverAccessThread.isAlive()) {
				if (scan.hasNextLine()) {
					serverThread.addNextMessage(scan.nextLine());
				}
				// NOTE: scan.hasNextLine waits input (in the other words block this thread's
				// process).
				// NOTE: If you use buffered reader or something else not waiting way,
				// NOTE: I recommends write waiting short time like following.
				// else {
				// Thread.sleep(200);
				// }
			}
		} catch (IOException ex) {
			System.err.println("Fatal Connection error!");
			ex.printStackTrace();
		} catch (InterruptedException ex) {
			System.out.println("Interrupted");
		}
	}
}