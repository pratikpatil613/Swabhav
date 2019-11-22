package com.techlabs.student;

import java.util.Comparator;

public class SortCgpa implements Comparator<Student> {
	@Override
	public int compare(Student one, Student two) {
		if (one.getCgpa() > two.getCgpa()) {
			return 1;
		}
		if (one.getCgpa() < two.getCgpa()) {
			return -1;
		}
		return 0;

		// return (int) (one.getCgpa() - two.getCgpa());
	}

}
