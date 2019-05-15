package com.test;

// Java code for serialization and deserialization 
// of a Java object
import java.io.*;

class SerializeDeserialize implements java.io.Serializable {
	
	private static final long serialVersionUID = 407486907872906101L;
	public int a;
	public String b;

	// Default constructor
	public SerializeDeserialize(int a, String b) {
		this.a = a;
		this.b = b;
	}
}

public class SerializationDeserialization {
	public static void main(String[] args) {
		SerializeDeserialize object = new SerializeDeserialize(1, "Diebold");
		String filename = "file.ser";

		// Serialization
		try {
			// Saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			// Method for serialization of object
			out.writeObject(object);

			out.close();
			file.close();

			System.out.println("Object has been serialized");
		}
		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		SerializeDeserialize object1 = null;
		// Deserialization
		try {
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			// Method for deserialization of object
			object1 = (SerializeDeserialize) in.readObject();

			in.close();
			file.close();

			System.out.println("Object has been deserialized ");
			System.out.println("a = " + object1.a);
			System.out.println("b = " + object1.b);
		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}
	}
}