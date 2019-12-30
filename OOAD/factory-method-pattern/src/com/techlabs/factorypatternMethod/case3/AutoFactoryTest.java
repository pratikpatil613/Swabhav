package com.techlabs.factorypatternMethod.case3;

import com.techlabs.factorymethodpattern.case2.Audi;
import com.techlabs.factorymethodpattern.case2.BMW;
import com.techlabs.factorymethodpattern.case2.IAutomobile;
import com.techlabs.factorymethodpattern.case2.IAutomobileFactory;

public class AutoFactoryTest {
	public static void main(String[] args) {

		IAutomobileFactory factory = BMW.getInstance();
		IAutomobile auto = factory.make();
		auto.start();
		auto.stop();

		factory = Audi.getInstance();
		auto = factory.make();
		auto.start();
		auto.stop();

	}

}
