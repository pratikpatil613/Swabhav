package com.techlabs.studentProfessor;

public class Proffesor extends Preson {
	private double salary;

	public Proffesor(int id, String name, String dob, double salary) {
		super(id, name, dob);
		this.salary = salary;

	}

	public double getSalary() {
		return salary;
	}

}
