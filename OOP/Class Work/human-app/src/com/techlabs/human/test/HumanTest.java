package com.techlabs.human.test;

import com.techlabs.human.GenderType;
import com.techlabs.human.Human;

public class HumanTest {
	public static void main(String[] args) {
		Human h1 = new Human("prtik", 20, 150.f, 45.0f, GenderType.Male);
		Human h2 = new Human("Aniket", 26);
		Human h3 = new Human("tejas", 20, 180f, 75f, GenderType.Male);

		printInfo(h1);
		printInfo(h2);
		printInfo(h3);

	}

	public static void printInfo(Human h) {
		h.eat();
		h.workout();
		System.out.println("BMI=" + h.calculateBMI());
		System.out.println("BMICategory=" + h.calculateBMICategory());
		System.out.println();
	}

}
