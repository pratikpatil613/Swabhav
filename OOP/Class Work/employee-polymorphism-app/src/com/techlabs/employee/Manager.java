package com.techlabs.employee;

public class Manager extends Employee {

	private float hra;
	private float ta;
	private float da;

	public Manager(String eno, String name, double balance) {
		super(eno, name, balance);
	}

	@Override
	public double calculateNetSalary() {
		hra = (float) (50.00 / 100 * balance);
		ta = (float) (40.00 / 100 * balance);
		da = (float) (30.00 / 100 * balance);
		double netBalance = hra + ta + da;
		return netBalance;

	}

	@Override
	public String getAllowanceDetails() {
		String OtherElement = "\nhara:" + this.hra + "\nta:" + this.ta + "\nda:" + this.da;
		return OtherElement;
	}

}
