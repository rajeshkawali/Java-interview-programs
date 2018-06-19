package com.program.factorymethodpattern;

public class FactoryMethodMain {

	public static void main(String[] args) {
		ParserFactoryClass pfc = new ParserFactoryClass();
		System.out.println("Start Execution");
		//String value = pfc.getParserObject("csv");
		String value = pfc.getParserObject("pdf");
		//String value = pfc.getParserObject("txt");
		//String value = pfc.getParserObject(null);
		System.out.println("Done Execution of "+value);
		

	}

}
