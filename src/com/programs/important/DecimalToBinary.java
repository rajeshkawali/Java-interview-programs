package com.programs.important;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalToBinary {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number :");
		int DecimalNumber = Integer.parseInt(rd.readLine());
		StringBuffer buf = new StringBuffer();
		while(DecimalNumber!=0){
			int digit=DecimalNumber%2; //int digit=DecimalNumber%8;
			buf.append(digit);  //buf.append(digit);
			DecimalNumber=DecimalNumber/2;  //DecimalNumber=DecimalNumber/8;
		}
		buf.reverse();
		System.out.println("The binary Number is :"+buf);
		//System.out.println("The Octal Number is :"+buf);
		
		
		//System.out.println("DecimalToBinary="+Integer.toBinaryString(DecimalNumber));
		//System.out.println("DecimalToOctal="+Integer.toOctalString(DecimalNumber));
		//System.out.println("DecimalToHexa="+Integer.toHexString(DecimalNumber));
		//System.out.println("DecimalToString="+Integer.toString(DecimalNumber));
	}

}
