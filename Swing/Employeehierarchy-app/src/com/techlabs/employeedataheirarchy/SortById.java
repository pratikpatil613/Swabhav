package com.techlabs.employeedataheirarchy;

import java.util.Comparator;

public class SortById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getEmpNo() == o2.getEmpNo() && o1.getDeptNo() == o2.getDeptNo()) {
			return 0;
		} else if (o1.getEmpNo() > o2.getEmpNo()) {

			return 1;
		}
		return -1;

	}

}
