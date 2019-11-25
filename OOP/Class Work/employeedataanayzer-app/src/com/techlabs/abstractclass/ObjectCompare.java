package com.techlabs.abstractclass;

import java.util.Comparator;

public class ObjectCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		if (e1.getEmployeeId() == e2.getEmployeeId()) {
			return 0;
		}
		if (e1.getEmployeeId() < e2.getDepartment()) {
			return 1;
		} else {
			return -1;
		}
	}

}
