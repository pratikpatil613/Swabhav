package com.techlabs.employeedataheirarchy;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Parser {
	private ILoader loader;
	private Set<Employee> empSet;

	public Parser(ILoader loader) {
		this.loader = loader;
		empSet = new TreeSet<Employee>(new SortById());
	}

	public Set<Employee> Parse() {
		List<Employee> emp = loader.load();
		for (Employee e : emp) {
			empSet.add(e);
		}
		// for (Employee e : empSet) {
		// System.out.println(e);
		// }

		return empSet;
	}

}
