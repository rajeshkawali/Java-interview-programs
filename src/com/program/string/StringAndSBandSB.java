package com.program.string;

public class StringAndSBandSB {
	public static void main(String[] args) {
		String s = "JAVA";
		long startTime = System.currentTimeMillis();
		for (int i = 0; i <= 10000; i++) {
			s = s + "J2EE";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken by String class : " + (endTime - startTime) + " ms");
		StringBuffer sb = new StringBuffer("JAVA");
		startTime = System.currentTimeMillis();
		for (int i = 0; i <= 10000; i++) {
			sb.append("J2EE");
		}
		endTime = System.currentTimeMillis();
		System.out.println("Time taken by StringBuffer class : " + (endTime - startTime) + " ms");
		StringBuilder sb1 = new StringBuilder("JAVA");
		startTime = System.currentTimeMillis();
		for (int i = 0; i <= 10000; i++) {
			sb1.append("J2EE");
		}
		endTime = System.currentTimeMillis();
		System.out.println("Time taken by StringBuilder class : " + (endTime - startTime) + " ms");
	}
}