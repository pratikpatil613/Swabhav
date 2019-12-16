package com.techlabs.employeedataanalyzer.main;

import com.techlabs.employeedataanalyzer.FileLoader;
import com.techlabs.employeedataanalyzer.UrlLoader;
import com.techlabs.employeedataanalyzer.Parser.Parser;
import com.techlabs.employeedataanalyzer.dataanalyzer.DataAnalyzer;

public class MainTest {
	public static void main(String[] args) {
		DataAnalyzer dan = new DataAnalyzer(new Parser(new FileLoader()));

		printEmpoyeeInfo(dan);
	}

	private static void printEmpoyeeInfo(DataAnalyzer dan) {
		dan.departmentWise();

	}

}
