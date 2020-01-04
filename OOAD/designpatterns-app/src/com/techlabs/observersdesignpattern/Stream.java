package com.techlabs.observersdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Stream {
	List<Student> students = new ArrayList<Student>();
	String subName;

	public void takeAdmission(Student student) {
		students.add(student);
	}

	public void cancelAdmission(Student student) {
		students.remove(student);
	}

	public void informTOAll() {
		for (Student s : students)
			s.update();
	}

	public void upload(String subName) {
		this.subName = subName;
		informTOAll();
	}
}
