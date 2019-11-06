package com.techlabs.employee;

public abstract class Employee {

	private String eno;
	private String name;
	protected double balance;

	public Employee(String eno, String name, double balance) {
		this.eno = eno;
		this.name = name;
		this.balance = balance;

	}

	public String getEno() {
		return eno;
	}

	public String getName() {
		return name;
	}

	public double getBalane() {
		return balance;
	}

	public abstract double calculateNetSalary();

	public abstract String getAllowanceDetails();

}
