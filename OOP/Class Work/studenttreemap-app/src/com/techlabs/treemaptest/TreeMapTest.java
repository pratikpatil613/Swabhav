package com.techlabs.treemaptest;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.techlabs.student.Student;

public class TreeMapTest {
	public static void main(String[] args) {
		Map<Student, Student> map = new TreeMap<Student, Student>();
		Student s1 = new Student(101, 10, "nilesh", "9.9");
		Student s2 = new Student(101, 10, "pratik", "7.9");

		map.put(s1, s1);
		map.put(s2, s2);

		System.out.println(map.size());

	}

}
