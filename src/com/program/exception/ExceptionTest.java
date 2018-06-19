package com.program.exception;

import java.util.Scanner;

public class ExceptionTest {
	
	public static void main(String[] args) {
		System.out.println("start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value :");
		String val = sc.next();
		
		try{
			System.out.println("1");
			int i = Integer.parseInt(val);
			System.out.println("2");
			int j = i/(i-9);
			System.out.println("-------------");
		}catch(NumberFormatException nfe){
			System.out.println("3");
			System.out.println(nfe);
			System.out.println("4");
		}catch(ArithmeticException ae){
			System.out.println("5");
			System.out.println(ae);
			System.out.println("6");
		}
		System.out.println("end");
	}

}
