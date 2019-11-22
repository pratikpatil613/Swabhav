package com.techlabs.student;

import java.util.Comparator;

public class SortName implements Comparator<Student> {
	@Override
	public int compare(Student one, Student two) {
		return one.getName().compareTo(two.getName());
	}

}