package com.test;

public class CharToString {

	public static void main(String[] args) {
		
		//String s = "Diebold";
		char c = 'c';
		String s1 = String.valueOf(c); 
		String s2 = Character.toString(c);
		String s3 = new String(new char[]{c});
		String s4 = String.valueOf(new char[]{c});
		String s5 = new Character(c).toString();
		String s6 = "" + c;   
		
		//System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		
		
		
		
		
	}

}
