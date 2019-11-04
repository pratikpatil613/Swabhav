package com.techlabs.interfacefirst;

public class AllInterfaces implements SecondYear {

	public void firstYearDisplay() {
		System.out.println("First Year Students:" + firstYearStudents);
	}

	public void secondYearDisplay() {
		System.out.println("second Year Students:" + secondYearStudents);
	}

	public void displayAllStudents() {
	int	total = firstYearStudents + secondYearStudents;
		System.out.println("Total no of Students:" + total);

	}

}
