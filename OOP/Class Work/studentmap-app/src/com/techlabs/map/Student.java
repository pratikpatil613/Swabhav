package com.techlabs.map;

public class Student {
	private int rollno;
	private int standard;
	private String name;
	private String cgpa;

	public Student(int rollno, int standard, String name, String cgpa) {
		this.rollno = rollno;
		this.standard = standard;
		this.name = name;
		this.cgpa = cgpa;

	}

	public int getRollNO() {
		return rollno;
	}

	public int getStandard() {
		return standard;
	}

	public String getName() {
		return name;
	}

	public String cgpa() {
		return cgpa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollno;
		result = prime * result + standard;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (rollno != other.rollno)
			return false;
		if (standard != other.standard)
			return false;
		return true;
	}

}
