package com.techlabs.datanalyzer;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.techlabs.employeedataheirarchy.Employee;
import com.techlabs.employeedataheirarchy.Parser;

public class DataAnalyzer {
	private Parser parser;
	Map<String, String> empManagerMap = new TreeMap<String, String>();
	// TreeSet<Employee> empset;

	public DataAnalyzer(Parser parser) {
		this.parser = parser;
	}

	public void managerNOAndManagerName() {
		Set<Employee> empset = parser.Parse();
		for (Employee e : empset) {
			for (Employee d : empset) {
				String empNO = Integer.toString(d.getEmpNo());
				if (e.getManagerId().equals(empNO)) {
					empManagerMap.put(e.getManagerId(), d.getEmpName());
				}
			}
		}

		for (

		Map.Entry<String, String> entry : empManagerMap.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	}

	public void managerAndEmp() {
		Set<Employee> empset2 = parser.Parse();
		for (Employee e : empset2) {
			for (Employee d : empset2) {

			}
		}

	}

}
