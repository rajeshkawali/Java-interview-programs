package com.all;

public class StringToAscii {

	public static void main(String[] args) {
		String a = "Rajesh";

		char[] z = a.toCharArray();
		for (int i = 0; i < z.length; i++) {
			System.out.print(z[i]+"-->"+(int) z[i] + " ,");
			// ASCII output: R-->82 ,a-->97 ,j-->106 ,e-->101 ,s-->115 ,h-->104
		}
		
		for(char i='A';i<='Z';i++){
			System.out.print((char)i); // ABCDEFGHIJKLMNOPQRSTUVWXYZ
		}
	}

}
