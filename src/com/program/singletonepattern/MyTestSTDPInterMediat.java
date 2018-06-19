package com.program.singletonepattern;

public class MyTestSTDPInterMediat {

	// MyTestSTDP object = new MyTestSTDP(); // The constructor MyTestSTDP() is not visible.
	public MyTestSTDP getMyTestSTDPInterMediat() {
		MyTestSTDP object = MyTestSTDP.getSTObject();
		return object;

	}
}
