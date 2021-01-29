package com.program.shallowcopydeepcopy;

import java.util.Arrays;

// Code explaining deep copy 
public class ExDeepCopy { 
	
	private int[] data; 

	// altered to make a deep copy of values 
	public ExDeepCopy(int[] values) { 
		data = new int[values.length]; 
		for (int i = 0; i < data.length; i++) { 
			data[i] = values[i]; 
		} 
	} 

	public void showData() { 
		System.out.println(Arrays.toString(data)); 
	} 
} 
