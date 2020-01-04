package com.techlabs.compositedesignpattern.test;

import com.techlabs.compositedesignpattern.CollegeDirectory;
import com.techlabs.compositedesignpattern.ICollegeMembers;
import com.techlabs.compositedesignpattern.Student;
import com.techlabs.compositedesignpattern.Teacher;

public class CollegeMemberTest {
	public static void main(String[] args) {
		Student studentA = new Student("A", 101, 10);
		Student studentB = new Student("B", 102, 9);
		CollegeDirectory studentDirectory = new CollegeDirectory();
		studentDirectory.add(studentA);
		studentDirectory.add(studentB);

		Teacher teacherP = new Teacher("P", 501, 20000);
		Teacher teacherQ = new Teacher("Q", 502, 25000);
		CollegeDirectory teacherDirectory = new CollegeDirectory();
		teacherDirectory.add(teacherP);
		teacherDirectory.add(teacherQ);

		CollegeDirectory directory = new CollegeDirectory();
		directory.add(studentDirectory);
		directory.add(teacherDirectory);
		directory.pritnInfo();

	}

}
