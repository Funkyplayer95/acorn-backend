package com.acorn.pattern;

public class TemplatePatternDemo {
	
	public static void main(String[] args) {
		DatabaseTemplate dt = new OracleDatasource();

		dt.useDatabase();
}
}