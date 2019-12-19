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
	Map<Integer, Integer> employeesDepMap = new TreeMap<Integer, Integer>();
	Map<String, Integer> employeesDesMap = new TreeMap<String, Integer>();

	public DataAnalyzer(Parser parser) {
		this.parser = parser;
	}

	public Map<Integer, Integer> getDepartmentWise() {
		System.out.println("department wise");
		Set<Employee> empSet = parser.Parse();
		int count = 1;
		for (Employee e : empSet) {
			if (employeesDepMap.containsKey(e.getDepartment())) {
				employeesDepMap.put(e.getDepartment(), employeesDepMap.get(e.getDepartment()) + 1);
			} else {
				employeesDepMap.put(e.getDepartment(), count);
			}
		}
		return employeesDepMap;
	}

	public Map<String, Integer> designationWise() {
		System.out.println("designation wise");
		Set<Employee> empSet2 = parser.Parse();
		int count = 1;
		for (Employee e : empSet2) {
			if (employeesDesMap.containsKey(e.getEmployeeDesignation())) {
				employeesDesMap.put(e.getEmployeeDesignation(), employeesDesMap.get(e.getEmployeeDesignation()) + 1);
			} else {
				employeesDesMap.put(e.getEmployeeDesignation(), count);
			}
		}
		return employeesDesMap;
	}

	public Map<Integer, Employee> maxSalEmp() {

		System.out.println("maxSalEmp");
		Set<Employee> empSet3 = parser.Parse();
		Map<Integer, Employee> MaxSalEmployee = new TreeMap<Integer, Employee>();

		Employee maxSalemp = null;
		for (Employee e : empSet3) {
			if (maxSalemp == null || maxSalemp.getSalary() < e.getSalary()) {
				maxSalemp = e;
			}
		}
		MaxSalEmployee.put(maxSalemp.getDepartment(), maxSalemp);
		return MaxSalEmployee;
	}

	public Map<String, Integer> noOfEmployeeDesignationWise(String designarion) {
		System.out.println("Single DesignationWise Emp");
		int count = 1;
		Map<String, Integer> desWise = new TreeMap<String, Integer>();
		Set<Employee> empSet4 = parser.Parse();
		boolean b = false;
		for (Employee e : empSet4) {
			if ((e.getEmployeeDesignation().equalsIgnoreCase(designarion))) {
				desWise.put(e.getEmployeeDesignation(), count++);
			}
		}
		return desWise;
	}
}
