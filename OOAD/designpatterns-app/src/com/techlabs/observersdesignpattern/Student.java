package com.techlabs.observersdesignpattern;

public class Student {
	private String name;
	private Stream stream;

	public Student(String name) {
		this.name = name;
	}

	public void update() {
		System.out.println(name + " Assignment uploaded");
	}

}
