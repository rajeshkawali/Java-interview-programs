package com.program.factorymethodpattern;

public class ParserFactoryClass {

	public String getParserObject(String ParserType) {
		if (ParserType == null) {
			System.out.println("ParserFactoryClass.getParserObject().null");
			return null;
		}
		if (ParserType.equalsIgnoreCase("txt")) {
			System.out.println("ParserFactoryClass.getParserObject().txt");
			Parser parse = new TextParser();
			String value = parse.parser("File for Parse");
			System.out.println("Done Parsing "+value);
			return value;
		} else if (ParserType.equalsIgnoreCase("csv")) {
			System.out.println("ParserFactoryClass.getParserObject().csv");
			Parser parse = new CSVParser();
			String value = parse.parser("File for Parse");
			System.out.println("Done Parsing "+value);
			return value;
		} else if (ParserType.equalsIgnoreCase("pdf")) {
			System.out.println("ParserFactoryClass.getParserObject().pdf");
			Parser parse = new PDFParser();
			String value = parse.parser("File for Parse");
			System.out.println("Done Parsing "+value);
			return value;
		}
		return null;
	}
}
