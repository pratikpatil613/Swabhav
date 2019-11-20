package com.techlabs.hashsettest;

import java.util.Comparator;

import com.techlabs.student.Student;

public class SortCgpa implements Comparator<Student> {
	@Override
	public int compare(Student one, Student two) {
		if (one.getCgpa() > two.getCgpa()) {
			return -1;
		}
		return 1;

		// return (int) (one.getCgpa() - two.getCgpa());
	}

}
