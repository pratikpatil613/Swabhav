package com.techlabs.studentProfessor;

public class Student extends Preson {
	Branch branch;

	public Student(int id, String address, String dob, Branch branch) {
		super(id, address, dob);
		this.branch = branch;
	}

	public Branch getBrach() {
		return branch;
	}

}
