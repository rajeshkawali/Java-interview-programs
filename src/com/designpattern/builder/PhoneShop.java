package com.designpattern.builder;

public class PhoneShop {

	public static void main(String[] args) {

		//Phone p = new Phone("Android", 4, "Snapdrogan730g", 6.3, 4100);
		//System.out.println(p);
		
		Phone p = new PhoneBuilder().setOs("Android").setProcessor("Snapdrogan730g").setBattery(4100).getPhone();
		System.out.println(p);
		System.out.println(p.getOs());
		System.out.println(p.getProcessor());
		System.out.println(p.getRam());
		System.out.println(p.getBattery());
		System.out.println(p.getScreenSize());
		
	}

}
