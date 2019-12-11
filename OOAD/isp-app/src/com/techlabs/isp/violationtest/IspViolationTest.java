package com.techlabs.isp.violationtest;

import com.techlabs.ispviolation.Developer;
import com.techlabs.ispviolation.IWork;
import com.techlabs.ispviolation.Manager;

public class IspViolationTest {
	public static void main(String[] args) {
		Manager m = new Manager();
		Developer d = new Developer();

		printInfo(m);
		printInfo(d);

	}

	private static void printInfo(IWork i) {
		i.startWork();
		i.stopWork();
		i.startEat();
		i.stopEat();

	}

}
