package com.techlabs.abstractclass;

public class EmployeeInfo {
	private int employeeId;
	private String employeeName;
	private String employeeDesignation;
	private int managerId;
	private String dateOFJoining;
	private double salary;
	private int department;

	public EmployeeInfo(int employeeId, String employeeName, String employeeDesignation, int managerId,
			String dateOfJoinings, double salary, int department) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.managerId = managerId;
		this.dateOFJoining = dateOfJoinings;
		this.salary = salary;
		this.department = department;

	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getDateOFJoining() {
		return dateOFJoining;
	}

	public void setDateOFJoining(String dateOFJoining) {
		this.dateOFJoining = dateOFJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

}
