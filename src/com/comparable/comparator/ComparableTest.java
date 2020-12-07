package com.comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;

//A class 'Movie2' that implements Comparable
class Movie2 implements Comparable<Movie2> {
	private double rating;
	private String name;
	private int year;

	// Used to sort movies by year
	public int compareTo(Movie2 m) {
		return this.year - m.year;
	}

	// Constructor
	public Movie2(String nm, double rt, int yr) {
		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}

	// Getter methods for accessing private data
	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

}
public class ComparableTest {

	public static void main(String[] args) {
		ArrayList<Movie2> list = new ArrayList<Movie2>();
		list.add(new Movie2("Force Awakens", 8.3, 2015));
		list.add(new Movie2("Star Wars", 8.7, 1977));
		list.add(new Movie2("Empire Strikes Back", 8.8, 1980));
		list.add(new Movie2("Return of the Jedi", 8.4, 1983));

		Collections.sort(list);

		System.out.println("Movies after sorting : ");
		for (Movie2 movie : list) {
			System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
		}
	}

}
