package com.techlabs.guitarmadolin;

public enum Builder {
	FENDER, MARTIN, GIBSON, COLLING, OLSON, RYNS, PRS, ANY;

	@Override
	public String toString() {
		switch (this) {
		case FENDER:
			return "Fender";
		case MARTIN:
			return "martin";
		case GIBSON:
			return "gibson";
		case COLLING:
			return "colling";
		case OLSON:
			return "ryns";
		case RYNS:
			return "ryns";
		case PRS:
			return "prs";
		case ANY:
			return "any";

		}
		return null;
	}

}
