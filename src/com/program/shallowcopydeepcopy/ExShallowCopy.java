package com.program.shallowcopydeepcopy;

import java.util.Arrays;

//code illustrating shallow copy 
public class ExShallowCopy { 

	private int[] data; 

	// makes a shallow copy of values 
	public ExShallowCopy(int[] values) { 
		data = values; 
	} 

	public void showData() { 
		System.out.println( Arrays.toString(data) ); 
	} 
} 
