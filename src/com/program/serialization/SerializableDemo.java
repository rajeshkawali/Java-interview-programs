package com.program.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/*

1.Transient variable will be ignored during serialization.
2.Static variable won’t even participate in Serialization.
3.Static variable will be serialized if the value is initialized during declaration itself.
4.If a variable contains both transient and static keyword, also if the value is initialized during declaration, then it will be serialized. Because here transient modifier will be ignored and static modifier will take over the actions.
5.Final variable will be serialized.
6.If a variable contains both final and transient keyword, then it will be serialized. Because here transient modifier will be ignored and final modifier will take over the actions.

 */
class SerializationClass implements Serializable {

	private static final long serialVersionUID = 1L;
	String name;
	int rid;
	static String contact;
	transient String password;

	SerializationClass(String n, int r, String c, String password) {
		this.name = n;
		this.rid = r;
		this.contact = c;
		this.password = password;
	}
}

public class SerializableDemo {
	public static void main(String[] args) {
		SerializationClass si = null;
		try {
			File file = new File("C:\\MyBackup\\WorkSpace\\JavaInterviewPrograms\\src\\com\\program\\serialization\\file.ser");
			si = new SerializationClass("Rajesh", 27, "55447","xyz");
			System.out.println("Serialization using file :"+file.getName());
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(si);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("-----------------------------------------------------------");
		si = null;
		try {
			File file = new File("C:\\MyBackup\\WorkSpace\\JavaInterviewPrograms\\src\\com\\program\\serialization\\file.ser");
			System.out.println("Deserialization using file :"+file.getName());
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			si = (SerializationClass) ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(si.name);
		System.out.println(si.rid);
		System.out.println(si.contact);
		// if you don't want to serialize the field then use transient keyword
		System.out.println("Transient field value : "+ si.password); 
	}
}

/*
Difference between Serialization and Externalization

1.In Serialization, entire object will be serialized. In Externalization, based on the requirement either full object or part of the object will be serialized.
2.In Serialization, JVM will have complete control in serializing the object. In Externalization, programmer will have complete control in serializing the object.
3.Serializable is a marker interface so it doesn’t contain any methods. Externalizable contain two methods i.e writeExternal and readExternal.
4.If we implement Serializable interface, then during deserialization new object will not be created by executing any constructor. But if we implement Externalizable interface, then during deserialization new object will be created by executing No-arg Constructor.
5.In Serializable interface, Serialization won’t happen if we declare a variable with transient keyword. So transient keyword play a major role in Serializable interface. But in Externalizable interface developers will have the complete control, so even if he declared variable with transient keyword and write that variable value in writeExternal method, then that variable state also will be serialized. So transient keyword doesn’t play any role in Externalizable interface.

*/