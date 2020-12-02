package com.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilesStream {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		
		Stream<String> rows = Files.lines(Paths.get("src/data.txt"));
		//Count the number of lines in file : 0 1 2 3 4 5
		int lines = (int) rows.map(x->x.split(",")).filter(x->x.length >2).count();
		System.out.println(lines);
		
		Stream<String> rows2 = Files.lines(Paths.get("src/data.txt"));
		//File to Map conversion with first index is key and second is value
		Map<String, Integer> map = rows2.map(x->x.split(",")).filter(x->x.length >2).collect(Collectors.toMap(x->x[0], y->Integer.parseInt(y[1])));
		System.out.println(map);
		
		Stream<String> rows3 = Files.lines(Paths.get("src/data.txt"));
		//File to Map conversion with second index addition using reduce 
		Optional op = rows3.map(x->x.split(",")).filter(x->x.length >2).map(y->Integer.parseInt(y[1])).reduce((x,y)->x+y);
		System.out.println(op);
	}

}
