package com.programs.interviewPrograms;

import java.util.HashSet;

public class FindDuplicateElementsInArrayUsingHashSet {

	public static void main(String[] args) {
		
		String[] inStr = {"abc","abc","raj","esh","jay","esh","jay"};
		HashSet<String> hs = new HashSet<String>();
		
		for(String str : inStr){
			if(!hs.add(str)){
				System.out.println(str);
			}
		}

	}

}
