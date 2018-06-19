package com.programs.interviewprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCharLineCount {

	public static void main(String[] args) throws IOException {
		
		int wordCount=0;
		int charCount=0;
		int lineCount=0;
		int rajeshCount=0;
		
		BufferedReader bf = new BufferedReader(new FileReader("/root/Desktop/raj.txt"));
		String str = bf.readLine();
		while(str!=null){
			lineCount++;
			String []wc = str.split(" ");
			for(String cCount : wc){
				if(cCount.equalsIgnoreCase("rajesh")){
					rajeshCount ++;
				}
			}
			wordCount = wordCount + wc.length;
			for(String cCount : wc){
				charCount = charCount + cCount.length();
			}
			str = bf.readLine();
		}
		System.out.println("wordCount=>"+wordCount);
		System.out.println("lineCount=>"+lineCount);
		System.out.println("charCount=>"+charCount);
		System.out.println("rajeshCount=>"+rajeshCount);
	}

}
