package com.techlabs.hashsettest;

import java.util.Set;
import java.util.TreeSet;

import com.techlabs.student.SortCgpa;
import com.techlabs.student.Student;

public class SortCgpaTest {
	public static void main(String[] args) {
		Set<Student> set = new TreeSet<Student>(new SortCgpa());

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
		set.add(new Student(103, "Aniket", 9.9));
		set.add(new Student(104, "Manoj", 9.9));
     	set.add(new Student(104, "Manoj", 9.99));


		System.out.println(set.size());
		for (Student s : set) {
			System.out.println(s);
		}

	}

}
