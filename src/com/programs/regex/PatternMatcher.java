package com.programs.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String str = "HelloRajeshHowAreYouAndRajeshIsAJavaDeveloperAndRajeshDoneBeInBangaloreRajeshIsRajeshIsRajesh";
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter the String :");
		String find = s.nextLine();
		Pattern p = Pattern.compile(find);
		//Pattern p = Pattern.compile("Rajesh");
		Matcher matcher = p.matcher(str);
		int count=0;
		while(matcher.find()){
			count++;
		}
		System.out.println("Count of Rajesh  :"+count);
	}

}
