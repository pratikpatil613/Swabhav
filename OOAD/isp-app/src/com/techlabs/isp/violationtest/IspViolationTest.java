package com.techlabs.isp.violationtest;

import com.techlabs.ispviolation.Developer;
import com.techlabs.ispviolation.IWork;
import com.techlabs.ispviolation.Manager;

public class IspViolationTest {
	public static void main(String[] args) {
		Manager m = new Manager();
		Developer d = new Developer();

		printInfo(m);
		try {
			printInfo(d);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private static void printInfo(IWork i) {
		i.startWork();
		i.stopWork();
		i.startEat();
		i.stopEat();

	}

}
