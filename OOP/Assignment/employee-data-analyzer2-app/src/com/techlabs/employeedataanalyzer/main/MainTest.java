package com.techlabs.employeedataanalyzer.main;

import java.util.Map;
import java.util.Map.Entry;

import com.techlabs.employeedataanalyzer.FileLoader;
import com.techlabs.employeedataanalyzer.UrlLoader;
import com.techlabs.employeedataanalyzer.Parser.Parser;
import com.techlabs.employeedataanalyzer.dataanalyzer.DataAnalyzer;

public class MainTest {
	public static void main(String[] args) {
		DataAnalyzer dan = new DataAnalyzer(new Parser(new FileLoader()));

		printEmpoyeeInfo(dan.getDepartmentWise());
		printEmpoyeeInfo(dan.designationWise());
		printEmpoyeeInfo(dan.maxSalEmp());
		printEmpoyeeInfo(dan.noOfEmployeeDesignationWise("salesman"));


	}

	private static <K, V> void printEmpoyeeInfo(Map<K, V> map) {
		for (Entry<K, V> empmap : map.entrySet()) {
			System.out.println(empmap.getKey() + "=:" + empmap.getValue());
		}
		System.out.println(" ");

	}

}
