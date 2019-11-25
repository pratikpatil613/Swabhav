package com.techlabs.studentProfessor;

public class Student extends Preson {

	private String branch;

	public Student(int id, String address, String dob, String branch) {
		super(id, address, dob);
		this.branch = branch;
	}

	public String getBrach() {
		return branch;
	}

}
