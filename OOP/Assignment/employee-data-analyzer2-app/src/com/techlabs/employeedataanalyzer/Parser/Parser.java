package com.techlabs.employeedataanalyzer.Parser;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.techlabs.employeedataanalyzer.Employee;
import com.techlabs.employeedataanalyzer.ILoader;
import com.techlabs.employeedataanalyzer.SortbyIdAndDepartmentId;

public class Parser {
	public ILoader loader;
	private Set<Employee> empSet;

	public Parser(ILoader loader) {
		this.loader = loader;
		empSet = new TreeSet<Employee>(new SortbyIdAndDepartmentId());

	}

	public Set<Employee> Parse() {
		List<Employee> emp = loader.load();
		for (Employee e : emp) {
			empSet.add(e);
		}
		return empSet;
	}

}
