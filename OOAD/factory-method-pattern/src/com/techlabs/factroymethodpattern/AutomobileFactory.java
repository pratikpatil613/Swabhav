package com.techlabs.factroymethodpattern;

public class AutomobileFactory {

	public AutomobileFactory() {
	}

	public static AutomobileFactory getInstance() {

		return new AutomobileFactory();
	}

	public IAutomobile make(AutoType autoname) {
		if (autoname.equals(AutoType.BMW)) {
			return new BMW();
		} else if (autoname.equals(AutoType.Audi)) {
			return new Audi();
		} else if (autoname.equals(AutoType.Tesla)) {
			return new Tesla();
		}
		return null;
	}
}
