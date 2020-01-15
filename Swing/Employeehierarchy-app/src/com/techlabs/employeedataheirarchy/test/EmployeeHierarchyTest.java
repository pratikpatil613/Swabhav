package com.techlabs.employeedataheirarchy.test;

import com.techlabs.datanalyzer.DataAnalyzer;
import com.techlabs.employeedataheirarchy.FileLoader;
import com.techlabs.employeedataheirarchy.Parser;

public class EmployeeHierarchyTest {
	public static void main(String[] args) {
		FileLoader loader = new FileLoader();
		// loader.load();
		Parser parser = new Parser(loader);
		parser.Parse();

		DataAnalyzer analyzer = new DataAnalyzer(parser);
		analyzer.managerNOAndManagerName();
	}

}
