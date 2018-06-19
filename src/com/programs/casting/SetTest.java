package com.programs.casting;

import java.util.HashSet;
import java.util.Set;

class EmpTest{
	int id;
	String name;
	public EmpTest(int id,String name) {
		System.out.println("cons"+id+"----name"+name);
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int hashCode(){
		 System.out.println("hashcode=="+id);
		 return id;
	 }
	 public boolean equals(Object anObject) {
		 EmpTest emp =(EmpTest)anObject;
	        if (this.id == emp.id && this.name == emp.name) {
	        	System.out.println("equals pass"+id+"----name"+name);
	            return true;
	        }
	        System.out.println("equals fails"+id+"----name"+name);
	        return false;
	    }
}
public class SetTest {

	public static void main(String[] args) {
		Set<EmpTest> s = new HashSet<EmpTest>();
		
		s.add(new EmpTest(1, "Tiwari"));
		System.out.println("main hash code1="+s.getClass().hashCode());
		s.add(new EmpTest(1, "Tiwari"));
		System.out.println("main hash code2="+s.getClass().hashCode());
		System.out.println(s.size());
		
		
		Set<String> s1 = new HashSet<String>();
		s1.add("Tiwari");
		s1.add("Tiwari");
		System.out.println(s1.size());
		
	}

}
