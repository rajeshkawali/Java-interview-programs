package com.program.observerdesignpattern;

public interface Board {
	public void register(Observer obj);
	public void unRegister(Observer obj);
	public void notifyObserver();
	public Object getUpdate(Observer obj);
}
