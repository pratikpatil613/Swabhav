package com.techlabs.studentProfessor;

public class Proffesor extends Preson implements ISalaridEmployee {
	private double salary;

	public Proffesor(int id, String name, String dob, double salary) {
		super(id, name, dob);
		this.salary = salary;

	}

	@Override
	public double calsal() {
		double pa = 40.0 / 100 * salary;
		double bn = 30.0 / 100 * salary;
		double newSalary = salary + pa + bn;
		return newSalary;

	}

}
