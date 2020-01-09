package com.techlabs.testdrivendevelopment;

public enum MarkType {
	O, X, EMPTY;

	@Override
	public String toString() {
		switch (this) {
		case O:
			return "O";

		case X:
			return "X";

		case EMPTY:
			return "Empty";

		}
		return null;
	}
}
