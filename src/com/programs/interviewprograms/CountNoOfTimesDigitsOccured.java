package com.programs.interviewPrograms;

import java.util.HashMap;

public class CountNoOfTimesDigitsOccured {

	public static void main(String[] args) {
		
		int number = 1233347344;
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		while(number!=0){
			int singleNumber = number%10;
			if(hm.containsKey(singleNumber)){
				hm.put(singleNumber,hm.get(singleNumber)+1);
			}else{
				hm.put(singleNumber,1);
			}
			number = number/10;		
		}
		System.out.println(hm);	
	}
}
