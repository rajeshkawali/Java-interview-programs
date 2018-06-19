package com.program.factorymethodpattern;

public class TextParser implements Parser {

	@Override
	public String parser(String msg) {
		System.out.println("TextParser.parser()");
		String msgParser = "TXT-"+msg;
		return msgParser;
	}
}
