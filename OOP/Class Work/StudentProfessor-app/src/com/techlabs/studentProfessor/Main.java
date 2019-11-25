package com.techlabs.studentProfessor;

public class Main {
	public static void main(String[] args) {

		Student s1 = new Student(101, "abc", "10sep1996", "computer");
		Proffesor p1 = new Proffesor(101, "pqr", "1dec1985", 12000);

		StudetntInfo(s1);
		proffesorInfo(p1);

	}

	public static void StudetntInfo(Student s) {
		System.out.println("Name:" + s.getId());
		System.out.println("Address:" + s.getAddress());
		System.out.println("Dob:" + s.getDob());
		System.out.println(s.getBrach());

	}

	public static void proffesorInfo(Proffesor p) {
		System.out.println("Name:" + p.getId());
		System.out.println("Address:" + p.getAddress());
		System.out.println("Dob:" + p.getDob());
		System.out.println(p.getSalary());

	}

}
