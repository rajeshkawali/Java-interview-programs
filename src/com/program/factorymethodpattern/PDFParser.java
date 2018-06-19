package com.program.factorymethodpattern;

public class PDFParser implements Parser {

	@Override
	public String parser(String msg) {
		System.out.println("PDFParser.parser()");
		String msgParser = "PDF-"+msg;
		return msgParser;
	}

}
