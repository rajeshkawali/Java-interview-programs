package com.program.factorymethodpattern;

public class CSVParser implements Parser{

	@Override
	public String parser(String msg) {
		System.out.println("CSVParser.parser()");
		String msgParser = "CSV-"+msg;
		return msgParser;
	}

}
