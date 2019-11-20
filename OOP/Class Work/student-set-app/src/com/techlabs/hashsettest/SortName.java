package com.techlabs.hashsettest;

import java.util.Comparator;

import com.techlabs.student.Student;

public class SortName implements Comparator<Student> {
	@Override
	public int compare(Student one, Student two) {
		return one.getName().compareTo(two.getName());
	}

}