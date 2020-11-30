package com.functionalinterface.supplier;

import java.util.function.Supplier;
//Supplier is a predefined functional interface like Consumer, present in java.util.function package. It has one abstract method called get();
//Supplier can be used to supply some value based on some operation, Supplier won't take any input and it will always supply objects.
//https://ekumeedhelp.blogspot.com/2020/01/java-8-supplier.html
public class SupplierExample1 {

	public static void main(String[] args) {
		Supplier<Double> sup = () -> Math.random();
		System.out.println(sup.get());
	}

}