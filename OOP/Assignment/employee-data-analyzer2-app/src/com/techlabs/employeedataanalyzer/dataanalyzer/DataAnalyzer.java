package com.techlabs.employeedataanalyzer.dataanalyzer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.techlabs.employeedataanalyzer.Employee;
import com.techlabs.employeedataanalyzer.Parser.Parser;

import java.util.TreeMap;
import java.util.TreeSet;

public class DataAnalyzer {

	Parser parser;

	Set<Employee> empSet;
	Set<Employee> empSet2;

	Map<Integer, Integer> employeesDepMap = new TreeMap<Integer, Integer>();
	Map<Integer, Integer> employeesDesMap = new TreeMap<Integer, Integer>();

	private Map<Integer, ArrayList<Employee>> employeesMap = new TreeMap<Integer, ArrayList<Employee>>();

	public DataAnalyzer(Parser parser) {
		this.parser = parser;
		empSet = new TreeSet<Employee>();

	}

	public void departmentWise() {
		empSet = parser.Parse();
		int count = 0;
		for (Employee e : empSet) {
			if (!(employeesDepMap.containsKey(e.getDepartment()))) {
				count = 1;
				employeesDepMap.put(e.getDepartment(), count);
			} else if (employeesDepMap.containsKey(e.getDepartment())) {
				count++;
				employeesDepMap.put(e.getDepartment(), count);

			}

		}

		for (Entry<Integer, Integer> empmap : employeesDepMap.entrySet()) {
			System.out.println("department no:=" + empmap.getKey() + "value=" + empmap.getValue());
		}
	}

	/*
	 * public void designationWise() { empSet2=parser.Parse(); int count=1;
	 * for(Employee e:empSet2) {
	 * 
	 * if(!employeesDesMap.containsKey(e.getEmployeeDesignation())) {
	 * employeesDesMap.put } } }
	 */

}
