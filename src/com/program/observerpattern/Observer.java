package com.program.observerpattern;

public interface Observer {

	void update();
	void subscribeChannel(Channel ch);

}