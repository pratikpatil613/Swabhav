package com.techlabs.compositedesignpattern;

public class Teacher implements ICollegeMembers {
	private String name;
	private int id;
	private double salary;

	public Teacher(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	@Override
	public void pritnInfo() {
		System.out.println("id:" + id + " name:" + name + " salary:" + salary);

	}

}
