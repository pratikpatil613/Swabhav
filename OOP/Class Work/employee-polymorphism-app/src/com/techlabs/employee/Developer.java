package com.techlabs.employee;

public class Developer extends Employee {

	private float pa;
	private float bonus;

	public Developer(String eno, String name, double balance) {
		super(eno, name, balance);
	}

	@Override
	public double calculateNetSalary() {
		pa = (float) (40.00 / 100 * balance);
		bonus = (float) (30.00 / 100 * balance);
		double Netbalance = pa + bonus;
		return Netbalance;

	}

	@Override
	public String getAllowanceDetails() {
		String elements = "\npa:" + this.pa + "\nbonus:" + this.bonus;
		return elements;
	}

}
