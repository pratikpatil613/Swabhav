package com.techlabs.isp2.violation.test;

import com.techlabs.isp2.violation.IWork;
import com.techlabs.isp2.violation.Manager;
import com.techlabs.isp2.violation.Robot;

public class Isp2ViolationTest {
	public static void main(String[] args) {
		Manager m = new Manager();
		Robot r = new Robot();

		AtTheWorkStation(m);
		AtTheWorkStation(r);

		AtTheCafeteria(m);
		AtTheCafeteria(r);

	}

	private static void AtTheWorkStation(IWork w) {

		w.startWork();
		w.stopWork();

	}

	private static void AtTheCafeteria(IWork w) {
		w.startEat();
		w.stopEat();

	}

}
