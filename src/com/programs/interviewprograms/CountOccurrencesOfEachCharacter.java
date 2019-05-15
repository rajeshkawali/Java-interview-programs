package com.programs.interviewprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class CountOccurrencesOfEachCharacter {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String :");
		String inString = bf.readLine();
		System.out.println("Occurrences Of Each Character count ");
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		char[] ch = inString.toCharArray();

		for (char character : ch) {

			if (m.containsKey(character)) {
				m.put(character, m.get(character) + 1);
			}else{
				m.put(character, 1);
			}
		}
		System.out.println(m);
		
		Set<Entry<Character, Integer>> s = m.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}

/*

Enter the String :
rajesh ramesh ramesh rajesh
Occurrences Of Each Character count 
{ =3, a=4, r=4, s=4, e=4, h=4, j=2, m=2}
 =3
a=4
r=4
s=4
e=4
h=4
j=2
m=2
*/