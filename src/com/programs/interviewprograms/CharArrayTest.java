package com.programs.interviewprograms;

public class CharArrayTest {

	public static void main(String[] args) {
		String text = "Good morning Have a nice day";  
		StringBuffer sb = new StringBuffer();
		char []c = text.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++){
			if(c[i]!=' '){
				
				sb.append(c[i]);
				//count++;
				//System.out.println(i);
			}
		}
		System.out.println(sb);
		System.out.println(count);
		
		for(int i=c.length-1;i>=0;i--){
			System.out.print(c[i]);
		}
	}

}
