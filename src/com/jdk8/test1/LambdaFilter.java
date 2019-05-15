package com.jdk8.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class ProductList {
	int id;
	String name;
	float price;

	public ProductList(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class LambdaFilter {
	public static void main(String[] args) {

		List<ProductList> list = new ArrayList<ProductList>();
		list.add(new ProductList(1, "Samsung A5", 17000f));
		list.add(new ProductList(3, "Iphone 6S", 65000f));
		list.add(new ProductList(2, "Sony Xperia", 25000f));
		list.add(new ProductList(4, "Nokia Lumia", 15000f));
		list.add(new ProductList(5, "Redmi4 ", 26000f));
		list.add(new ProductList(6, "Lenevo Vibe", 19000f));
		list.add(new ProductList(7, "Nokia 8", 55000f));

		// using lambda to filter data
		Stream<ProductList> filtered_data = list.stream().filter(p -> p.price > 20000);
		// using lambda to iterate through collection
		filtered_data.forEach(product -> System.out.println(product.name + ": " + product.price));
		System.out.println("---------------------");
		Stream<ProductList> f = list.stream().filter(p -> p.name.startsWith("N"));
		// using lambda to iterate through collection
		f.forEach(product -> System.out.println(product.name + ": " + product.price));
	}
}