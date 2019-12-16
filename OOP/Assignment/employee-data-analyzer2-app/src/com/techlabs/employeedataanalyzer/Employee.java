package com.techlabs.employeedataanalyzer;

import java.util.Set;

public class Employee implements Comparable<Employee> {
	private int employeeId;
	private String employeeName;
	private String employeeDesignation;
	private String managerId;
	private String dateOFJoining;
	private double salary;
	private String commision;
	private int department;

	public Employee(int employeeId, String employeeName, String employeeDesignation, String managerId,
			String dateOfJoinings, double salary, String commision, int department) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.managerId = managerId;
		this.dateOFJoining = dateOfJoinings;
		this.salary = salary;
		this.commision = commision;
		this.department = department;

	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public String getManagerId() {
		return managerId;
	}

	public String getDateOFJoining() {
		return dateOFJoining;
	}

	public double getSalary() {
		return salary;
	}

	public String getCommision() {
		return commision;
	}

	public int getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDesignation="
				+ employeeDesignation + ", managerId=" + managerId + ", dateOFJoining=" + dateOFJoining + ", salary="
				+ salary + ", commision=" + commision + ", department=" + department + "]\n";
	}

	@Override
	public int compareTo(Employee o) {
		if (o.employeeId == this.employeeId && o.department == this.department) {
			return 0;
		} else if (o.employeeId < this.employeeId && (o.department < this.department)) {

			return -1;
		}
		return 1;
	}

}
