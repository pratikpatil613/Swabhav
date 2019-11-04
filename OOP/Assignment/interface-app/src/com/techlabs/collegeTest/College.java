package com.techlabs.collegeTest;

import com.techlabs.college.Student;

public class College {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Akash", 70, 75);
		Student s2 = new Student(2, "Ravi", 60, 65);
		Student s3 = new Student(3, "Sunny", 40, 45);

		printinfo(s1);
		printinfo(s2);
		printinfo(s3);

	}

	public static void printinfo(Student s) {
		s.displayDetails();
		s.calculate();
		s.displayResult();
		System.out.println();
	}

}
