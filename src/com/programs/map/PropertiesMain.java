package com.programs.map;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesMain {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("/root/Desktop/raj.txt");
		Properties p = new Properties();
		
		p.load(fis);
		
		/*
		key1=Rajesh
		key2=Ramesh
		key3=Pankaj
		*/
		System.out.println(p.getProperty("key1"));//Rajesh
		System.out.println(p.getProperty("key2"));//Ramesh
		System.out.println(p.getProperty("key3"));//Pankaj
		
	}

}
