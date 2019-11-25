package com.techlabs.abstractclass;

import java.util.Comparator;

public class SortForSal implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {

		 if (o1.getDepartment() == o2.getDepartment() && 
				 o1.getEmployeeDesignation()== o2.getEmployeeDesignation()&&
		           o1.getSalary() > o2.getSalary()) {
			return 1;
		}
		return -1;
	}

}
