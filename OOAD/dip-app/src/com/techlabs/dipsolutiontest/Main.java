package com.techlabs.dipsolutiontest;

import com.techlabs.dipsolution.Designer;
import com.techlabs.dipsolution.Developer;
import com.techlabs.dipsolution.IEmployee;
import com.techlabs.dipsolution.Manager;
import com.techlabs.dipsolution.Tester;

public class Main {
	public static void main(String[] args) {
		IEmployee m = new Manager(new Developer());
		m.work();

		m = new Manager(new Designer());
		m.work();

		m = new Manager(new Tester());
		m.work();
	}

}
