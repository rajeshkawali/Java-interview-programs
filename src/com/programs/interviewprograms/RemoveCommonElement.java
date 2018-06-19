package com.programs.interviewprograms;

import java.util.HashSet;

public class RemoveCommonElement {

	public static void main(String[] args) {

		String[] s1 = { "raj", "m2", "see", "tiwari", "pankaj", "tiwari" };
		String[] s2 = { "raj", "m1", "see2", "tiwari", "pankaj1", "tiwari" };

		HashSet sh = new HashSet();
		for (int i = 0; i < s2.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) {
					sh.add(s1[i]);
				}

			}	
		}
		System.out.println(sh);
	}

}
