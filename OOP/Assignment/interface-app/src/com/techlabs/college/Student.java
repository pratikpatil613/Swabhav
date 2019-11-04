package com.techlabs.college;

public class Student implements Result {
	private int rollNo;
	private String name;
	private int mark1, mark2, total, per;

	public Student(int rollNo, String name, int mark1, int mark2) {
		// TODO Auto-generated constructor stub
		this.rollNo = rollNo;
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}

	public void displayDetails() {
		System.out.println("Class Name:" + className);
		System.out.println("Roll No:" + rollNo);
		System.out.println("Name:" + name);
	}

	public void calculate() {
		total = mark1 + mark2;
		per = total / 2;
		System.out.println("Total:" + total);
		System.out.println("per:" + per);

	}

	public void displayResult() {
		if (per > 65) {
			System.out.println("Distinction");
		} else if (per > 60) {
			System.out.println("first class");
		} else if (per < 60) {
			System.out.println("pass");
		} else if (per < 35) {
			System.out.println("fail");
		}
	}

}
