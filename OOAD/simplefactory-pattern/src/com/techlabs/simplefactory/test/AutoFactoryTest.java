package com.techlabs.simplefactory.test;

import com.techlabs.simplefactory.AutoType;
import com.techlabs.simplefactory.IAutomobile;
import com.techlabs.simplefactory.AutomobileFactory;

public class AutoFactoryTest {
	public static void main(String[] args) {
		AutomobileFactory autoFactory = new AutomobileFactory();
		IAutomobile auto = autoFactory.make(AutoType.Audi);
		System.out.println(auto.getClass());
		auto.start();
		auto.stop();

		auto = autoFactory.make(AutoType.BMW);
		System.out.println(auto.getClass());
		auto.start();
		auto.stop();
	}

}
