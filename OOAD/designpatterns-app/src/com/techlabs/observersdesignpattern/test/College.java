package com.techlabs.observersdesignpattern.test;

import com.techlabs.observersdesignpattern.Stream;
import com.techlabs.observersdesignpattern.Student;

public class College {
	public static void main(String[] args) {
		Stream computer = new Stream();

		Student student1 = new Student("A");
		Student student2 = new Student("B");
		
		computer.takeAdmission(student1);
		computer.takeAdmission(student2);
		
		computer.upload("oop");
	}

}
