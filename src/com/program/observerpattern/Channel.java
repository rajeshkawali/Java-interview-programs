package com.program.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

	private List<Subscriber> subscribers;
	// removed private from String title just to access the values in main class
	String title;

	public Channel() {
		subscribers = new ArrayList<Subscriber>();
	}

	@Override
	public void subscribe(Subscriber sub) {
		subscribers.add(sub);
	}

	@Override
	public void unSubscribe(Observer sub) {
		subscribers.remove(sub);
	}

	@Override
	public void notifySubscriber() {
		for (Observer subscriber : subscribers) {
			subscriber.update();
		}
	}
	
	@Override
	public void upload(String title) {
		this.title = title;
		notifySubscriber();
	}

}
