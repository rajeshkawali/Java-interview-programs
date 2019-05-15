package com.programs.matrix;

import java.util.HashMap;
// Count the no of times word repeated in given string.
public class CountOccurrencesOfEachWords {

	public static void main(String[] args) {
		
		String str[] = {"Java","Raj","Java","Raj","J2EE","Java","Raj","Java","Raj","Java","JSP","J2EE"};
		HashMap<String,Integer> wordCount = new HashMap<String,Integer>();
		
		for(String s : str) {
			//System.out.println(s);
			if(wordCount.containsKey(s)) {
				wordCount.put(s, wordCount.get(s)+1);
			}else {
				wordCount.put(s,1);
			}
		}
		System.out.println(wordCount);
	}
}
