package com.program.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FileReaderTest {

	public static void main(String[] args) {
		// Checked Exception
		try {
			DriverManager.getConnection(null);
			Class.forName(null);
			FileReader fr = new FileReader("/root/Desktop/raj.txt");
		} catch (FileNotFoundException | ClassNotFoundException| SQLException e) {
			e.printStackTrace();
		}

		System.out.println();
	}

}
