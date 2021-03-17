package com.program.observerdesignpattern;

public class MainClassObserver {

	public static void main(String[] args) {
		// One Score board - Subject
		BoardImplement board = new BoardImplement();
		
		// Many observers to get the score - Observers
		Observer obj1 = new ObserverImplement("Observer1");
		Observer obj2 = new ObserverImplement("Observer2");
		Observer obj3 = new ObserverImplement("Observer3");
		
		//Register with board
		board.register(obj1);
		board.register(obj2);
		board.register(obj3);
		
		//After registered, Subscribe the score board for updates
		obj1.subscribe(board);
		obj2.subscribe(board);
		obj3.subscribe(board);
		
		//To check any updated message are available or not.
		obj1.update();
		
		//push the new message in Board
		board.postMessage("Rajesh is Observing Score");
		
	}

}
