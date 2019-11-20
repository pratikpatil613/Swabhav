package com.techlabs.hashsettest;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import com.techlabs.student.Student;

public class NameTest {
	public static void main(String[] args) {
		// SortName name = new SortName();
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
		Student s4 = new Student(103, "Aniket", 1.1);
		set.add(s4);
		
		 SortName nameCompare = new SortName(); 
	        Collections.sort(set, nameCompare); 
	        for (Movie movie: list) 
	            System.out.println(movie.getName() + " " + 
	                               movie.getRating() + " " + 
	                               movie.getYear()); 

		System.out.println(set.size());
		for (Student s : set) {
			System.out.println(s);
		}

	}

}
