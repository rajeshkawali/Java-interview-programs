package com.programs.core;

public class IncreamentDecreament {

	public static void main(String[] args) {
		
		int result = 0;
		System.out.println("1=" + (++result));
		System.out.println("2=" + (result++));
		System.out.println("3=" + (result));
		System.out.println("4=" + (++result + result++));
		System.out.println("5=" + (result));
		System.out.println("6=" + (++result + result-- + --result - result++));
		System.out.println("7=" + (result));
		System.out.println("8=" + (result-- * ++result + ++result * --result - ++result));
		System.out.println("9=" + (result));
	}

}
