package com.techlabs.ispviolation.solutiontest;

import com.techlabs.ispviolation.solution.Developer;
import com.techlabs.ispviolation.solution.IEat;
import com.techlabs.ispviolation.solution.IWork;
import com.techlabs.ispviolation.solution.Manager;

public class IspSolutionTest {
	public static void main(String[] args) {
		Manager manager = new Manager();

		Developer developer = new Developer();

		printWorkInfo(manager);
		printEatInfo(manager);
		printWorkInfo(developer);

	}

	public static void printWorkInfo(IWork w) {
		w.startWork();
		w.stopWork();

	}

	public static void printEatInfo(IEat e) {
		e.startEat();
		e.stopEat();
		System.out.println(" ");
	}

}
