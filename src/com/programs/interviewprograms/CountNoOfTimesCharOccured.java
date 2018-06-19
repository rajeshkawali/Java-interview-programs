package com.programs.interviewPrograms;

import java.util.Scanner;

public class CountNoOfTimesCharOccured {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		System.out.println("Enter the char :");
		char ch = sc.next().charAt(0);
		char[] characters = str.toCharArray(); 
		int count=0;
		for(int i = 0;i < characters.length;i++){
			if(characters[i] == ch){
				count++;
			}
		}
		System.out.println("Count of entered character ="+count);
	}

}
