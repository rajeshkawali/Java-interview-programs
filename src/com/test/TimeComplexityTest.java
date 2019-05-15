package com.test;

public class TimeComplexityTest {

	public static void main(String[] args) {

		int n = 5;
		for (int i = 0; i < n; i++) {
			// int i=0; This will be executed only once.The time is actually calculated to i=0 and not the declaration.
			// i < N; This will be executed N+1 times.
			// i++ ; This will be executed N times.
			// So the number of operations required by this loop are 
			// {1+(N+1)+N} = 2N+2
			
				System.out.println("Im here with i = "+i);
		}
	}
}
