package com.programs.io;

import java.io.File;
import java.text.SimpleDateFormat;

public class LastModifiedDateExample {
	public static void main(String[] args) {
		// Specify the file path and name
		//File file = new File("C:\\Myfile.txt");
		File file = new File("/root/Desktop/newfile.txt");
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		System.out.println("Last Modified Date: " + sdf.format(file.lastModified()));
	}
}