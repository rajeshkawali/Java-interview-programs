package com.all;

public class StringandMaths {

	public static void main(String[] args) {
		double i = 0.0/0.0; // NaN
		//double i = -1.0/0.0; // -Infinity
		//double i = 1.0/0.0; //Infinity
		int j = 2+2/2;
		System.out.println(i);
		System.out.println(j);
		
		String s1 = "raj";
		String s2 = new String("raj");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println("--------------");
		String s3 = s2.intern();
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));

	}

}
