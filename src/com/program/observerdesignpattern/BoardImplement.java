package com.program.observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class BoardImplement implements Board {

	private List<Observer> observer;
	private String message;
	private boolean changed;

	public BoardImplement() {
		this.observer = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer obj) {
		if (obj == null) {
			throw new NullPointerException("Null Observer register");
		}
		if (!observer.contains(obj)) {
			observer.add(obj);
		}
	}

	@Override
	public void unRegister(Observer obj) {
		observer.remove(obj);

	}

	@Override
	public void notifyObserver() {
		if(!changed) {
			return;
		}else {
			this.changed = false;
			for (Observer obj : observer) {
				obj.update();
			}
		}
	}

	@Override
	public Object getUpdate(Observer obj) {
		return this.message;
	}

	public void postMessage(String msg) {
		System.out.println("Message posted is: " + msg);
		this.message = msg;
		this.changed = true;
		notifyObserver();
	}

}
