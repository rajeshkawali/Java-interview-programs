package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapStreamProgram {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);

		List<Integer> values = al.stream().flatMap(x -> {
			return Stream.iterate(1, y->x).limit(x).sequential();
		}).sorted().collect(Collectors.toList());

		System.out.println(values);
	}

}
