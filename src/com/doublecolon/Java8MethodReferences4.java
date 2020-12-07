package com.doublecolon;

import java.util.function.Supplier;

class CompanyName {

}

public class Java8MethodReferences4 {
	public static void main(String[] args) {
		// Creating objects using lambda

		Supplier<CompanyName> lambdaSupplier = () -> new CompanyName();
		lambdaSupplier.get();

		// Creating objects using constructor references
		Supplier<CompanyName> referenceSupplier = CompanyName::new;
		referenceSupplier.get();
	}
}