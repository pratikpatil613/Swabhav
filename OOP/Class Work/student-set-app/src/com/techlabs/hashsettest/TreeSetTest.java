package com.techlabs.hashsettest;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.techlabs.student.Student;

public class TreeSetTest {
	public static void main(String[] args) {
		Set<Student> set = new TreeSet<Student>();

		Student s1 = new Student(101, "Pratik", 7.5);
		Student s2 = new Student(102, "Nilesh", 8.9);

		set.add(s1);
		set.add(s1);
		System.out.println(set.size());
		set.add(s2);
		set.add(s2);
		System.out.println(set.size());
		Student s3 = new Student(101, "Pratik", 7.5);
		set.add(s3);
		System.out.println(set.size());

	}

}
