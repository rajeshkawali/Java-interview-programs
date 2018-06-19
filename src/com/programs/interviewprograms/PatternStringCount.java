package com.programs.interviewprograms;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternStringCount {

	public static void main(String[] args) throws IOException {
		String sequence = "aasd rajesh kjjkgrajeshsameerjhsdfsameeroiytj rajesh ncchsameerjhfgrajeshkj";
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner bf = new Scanner(System.in);
		System.out.println("Enter the string to match :");
		String str = bf.nextLine();
		
		Pattern p = Pattern.compile(str);
		Matcher match = p.matcher(sequence);
		int count=0;
		while(match.find()){
			count++;
		}
		System.out.println("count of entered String :"+count);
		

	}

}
