package com.programs.interviewprograms;

public class SortArrayOfString {

	public static void main(String[] args) {
		String[] inStr = {"abc","zxy","raj","esh","abc","cde","jay"};
		
		
		
		for (int i = 0; i < inStr.length; i++) {
			for (int j = i+1; j < inStr.length; j++) {
				if(inStr[i].equals(inStr[j])){
					
					System.out.println(inStr[j]);
					
				}
			}
		}
		System.out.println();
	}
}
