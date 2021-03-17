package com.program.observerdesignpattern;

public class ObserverImplement implements Observer {
	private String name;
	private Board board;

	public ObserverImplement(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		String msg = (String) board.getUpdate(this);
		if (msg == null) {
			System.out.println("No Message");
		} else {
			System.out.println("Consumming Message :" + msg);
		}
	}

	@Override
	public void subscribe(Board board) {
		this.board = board;
	}

}
