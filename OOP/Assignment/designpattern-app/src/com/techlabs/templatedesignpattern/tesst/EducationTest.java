package com.techlabs.templatedesignpattern.tesst;

import com.techlabs.templatedesignpattern.Education;
import com.techlabs.templatedesignpattern.FirstStudent;
import com.techlabs.templatedesignpattern.SecondStudent;

public class EducationTest {
	public static void main(String[] args) {
		Education education = new FirstStudent();
		System.out.println("Student->1");
		education.completeEducation();

		education = new SecondStudent();
		System.out.println("Student->2");
		education.completeEducation();

	}

}
