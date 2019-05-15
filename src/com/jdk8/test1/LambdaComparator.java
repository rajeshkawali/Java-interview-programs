package com.jdk8.test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ProductDemo {
	int id;
	String name;
	float price;

	public ProductDemo(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

class ComparatorDemo implements Comparator<ProductList> {
	public int compare(ProductList p1, ProductList p2) {
		return p1.id - p2.id;
	}
}

public class LambdaComparator {

	public static void main(String[] args) {

		List<ProductList> list = new ArrayList<ProductList>();
		list.add(new ProductList(1, "HP Laptop", 25000f));
		list.add(new ProductList(2, "Keyboard", 300f));
		list.add(new ProductList(3, "Dell Mouse", 150f));
		list.add(new ProductList(4, "Touch Pad", 250f));
		list.add(new ProductList(5, "Pen Drive", 1250f));
		System.out.println("Sorting on the basis of name...");

		// regular comparator
		// ComparatorDemo comp = new ComparatorDemo();
		// Collections.sort(list, comp);

		// Lambda comparator
		Collections.sort(list, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});

		for (ProductList p : list) {
			System.out.println(p.id + ") " + p.name + " -> " + p.price);
		}

	}
}