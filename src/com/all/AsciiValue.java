package com.all;

public class AsciiValue {

	public static void main(String[] args) {
		char ch = 'a';
        int ascii = ch;
        int ascii2 = 'a';
        // You can also cast char to int
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
        System.out.println("The ASCII value of " + ch + " is: " + ascii2);
		

	}

}
