package com.all;
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
final class ImmutableClass{
	final private int id;
	final private String name;
	/*
	private ImmutableClass() { // The blank final field name may not have been initialized
	}
	*/
	public ImmutableClass(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	
	public String toString(){
		return "id-->"+id+" name-->"+name;
	}
}
public class ImmutableClassCreation {

	public static void main(String[] args) {
		ImmutableClass ic = new ImmutableClass(12, "Rajesh");
	
		System.out.println(ic);//id-->12 name-->Rajesh

		System.out.println(ic.getName());//Rajesh
		System.out.println(ic.getId());//12
	}
}
