package com.techlabs.compositedesignpattern;

public class Student implements ICollegeMembers {
	private String name;
	private int id;
	private int standard;

	public Student(String name, int id, int standard) {
		this.name = name;
		this.id = id;
		this.standard = standard;
	}

	@Override
	public void pritnInfo() {
		System.out.println("id:" + id + " name:" + name + " standard:" + standard);

	}

}
