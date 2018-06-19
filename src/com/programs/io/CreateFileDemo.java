package com.programs.io;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo {
	public static void main(String[] args) {
		try {
			/*
			 * If file gets created then the createNewFile() method would return true or if
			 * the file is already present it would return false
			 */

			
			File file = new File("/root/Desktop/newfile.txt");
			//File file = new File("C:\\newfile.txt");
			boolean fvar = file.createNewFile();
			if (fvar) {
				System.out.println("File has been created successfully");
			} else {
				System.out.println("File already present at the specified location");
			}
		} catch (IOException e) {
			System.out.println("Exception Occurred:");
			e.printStackTrace();
		}
	}
}
