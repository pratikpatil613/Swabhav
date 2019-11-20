package com.techlabs.student;

public class Student implements Comparable<Student> {

	private int id;
	public String name;
	private double cgpa;

	public Student(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object second) {
		Student secondStudent = (Student) second;
		if (secondStudent.id == this.id) {
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Student sec) {
		// Student secStudent = (Student) sec;
		if (sec.id > this.id) {
			return 1;
		} else if (sec.id < this.id) {
			return -1;
		}
		return 0;

	}

	@Override
	public String toString() {
		return this.name;
	}

}
