package com.techlabs.employeedataanalyzer.Parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.techlabs.employeedataanalyzer.Employee;
import com.techlabs.employeedataanalyzer.ILoader;

public class Parser {
	public ILoader loader;
	private Set<Employee> empSet;

	public Parser(ILoader loader) {
		this.loader = loader;
		empSet = new TreeSet<Employee>();
		List<Employee> emp = loader.load();
		empSet.addAll(emp);

	}

	public Set<Employee> Parse() {
		return empSet;
	}

	/*
	 * public void loader() {
	 * 
	 * List<Employee> emp = loader.load(); // empSet = new TreeSet<Employee>(emp);
	 * empSet.addAll(emp);
	 * 
	 * }
	 */

	// public List<Employee> getList() { return emplist; }

/*	public void print() {
		for (Employee e : empSet) {
			System.out.println(e);

		}
	}*/

}
