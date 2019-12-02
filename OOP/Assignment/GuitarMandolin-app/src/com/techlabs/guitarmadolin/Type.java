package com.techlabs.guitarmadolin;

public enum Type {
	Acoustic, Electric;

	@Override
	public String toString() {
		switch (this) {
		case Acoustic:
			return "acoustic";
		case Electric:
			return "Electric";
		// default :return "Invallid choice";
		}
		return null;
	}

}
