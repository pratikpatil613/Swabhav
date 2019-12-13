package com.techlabs.isp2.solution.test;

import com.techlabs.isp2.solution.IEatable;
import com.techlabs.isp2.solution.IWorkable;
import com.techlabs.isp2.solution.IWorkableEatable;
import com.techlabs.isp2.solution.Manager;
import com.techlabs.isp2.solution.Robot;
import com.techlabs.isp2.violation.IWork;

public class Isp2SolutionTest {
	public static void main(String[] args) {
		Manager m = new Manager();
		Robot r = new Robot();

		atTheWorkStation(m);
		atTheWorkStation(r);

		atTheCafeteria(m);

	}

	public static void atTheWorkStation(IWorkable m) {
		m.startWork();
		m.stopWork();

	}

	public static void atTheCafeteria(IEatable e) {
		e.startEat();
		e.stopEat();
	}

}
