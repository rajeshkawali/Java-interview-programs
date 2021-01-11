package com.program.singletonepattern;

/*
 Thread Safe Singleton in Java using Double checked locking.
 */
public class SingletonDoubleCheck {
	private static volatile SingletonDoubleCheck _instance; // here volatile should be use.

	/* Double checked locking code on Singleton @return Singelton instance */
	public static SingletonDoubleCheck getInstance() {
		if (_instance == null) {
			synchronized (SingletonDoubleCheck.class) {
				if (_instance == null) {
					_instance = new SingletonDoubleCheck();
				}
			}
		}
		return _instance;
	}
}
