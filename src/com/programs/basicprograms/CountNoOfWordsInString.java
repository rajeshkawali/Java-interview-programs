package com.programs.basicprograms;

public class CountNoOfWordsInString {

	public static void main(String[] args) {

		String str = "java is object oriented programming language. java is platform independent";
		String[] words = str.split(" ");
		System.out.println(words.length);
		System.out.println("------------------------------");
		char ch ='j';
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(ch==c) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
