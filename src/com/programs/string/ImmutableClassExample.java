package com.programs.string;
import java.util.HashMap;
import java.util.Map;

/*
How to Create an immutable class in Java?

1.Declare the class as final so it can’t be extended.
2.Make all fields private so that direct access is not allowed.
3.Don’t provide setter methods for variables.
4.Make all mutable fields final so that its value can be assigned only once.
5.Initialize all the fields via a constructor performing deep copy.
6.Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
---------------------------------------------------------
1.The class must be declared as final (So that child classes can’t be created)
2.Data members in the class must be declared as private (So that direct access is not allowed)
3.Data members in the class must be declared as final (So that we can’t change the value of it after object creation)
4.A parametrized constructor should initialize all the fields performing a deep copy (So that data members can’t be modified with object reference)
5.Deep Copy of objects should be performed in the getter methods (To return a copy rather than returning the actual object reference)
6.No setters (To not have the option to change the value of the instance variable)


 */
public final class ImmutableClassExample {
	private final String name;
	private final int regNo;
	private final Map<String, String> metadata;

	public ImmutableClassExample(String name, int regNo,
				Map<String, String> metadata)
	{
		this.name = name;
		this.regNo = regNo;
		Map<String, String> tempMap = new HashMap<>();
		for (Map.Entry<String, String> entry :
			metadata.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		this.metadata = tempMap;
	}

	public String getName() { return name; }

	public int getRegNo() { return regNo; }

	public Map<String, String> getMetadata()
	{
		Map<String, String> tempMap = new HashMap<>();
		for (Map.Entry<String, String> entry :
			this.metadata.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		return tempMap;
	}
}

// Driver class
class Test {
	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<>();
		map.put("1", "first");
		map.put("2", "second");
		ImmutableClassExample s = new ImmutableClassExample("ABC", 101, map);
		System.out.println(s.getName());
		System.out.println(s.getRegNo());
		System.out.println(s.getMetadata());

		// Uncommenting below line causes error
		// s.regNo = 102;

		map.put("3", "third");
		System.out.println(s.getMetadata()); // Remains unchanged due to deep copy in constructor

		s.getMetadata().put("4", "fourth");
		System.out.println(s.getMetadata()); // Remains unchanged due to deep copy in getter
	}
}
