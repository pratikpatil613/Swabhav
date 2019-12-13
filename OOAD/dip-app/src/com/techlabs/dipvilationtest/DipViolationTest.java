package com.techlabs.dipvilationtest;

import com.techlabs.dipviolation.Designer;
import com.techlabs.dipviolation.Developer;
import com.techlabs.dipviolation.Manager;

public class DipViolationTest {
	public static void main(String[] args) {
		Manager m=new Manager(new Developer());
		m.watchDeveloperWork();

		m=new Manager(new Designer());
		m.watchDesigmerWork();
	}
	

}
