package com.jdk8.test2;

public class DataNotFoundError extends Exception {
	private static final long serialVersionUID = 7948991832780599413L;
	DataNotFoundError() {
	}
	DataNotFoundError(String msg) {
		super(msg);
	}
}
