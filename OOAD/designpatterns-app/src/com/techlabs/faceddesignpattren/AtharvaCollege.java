package com.techlabs.faceddesignpattren;

public class AtharvaCollege implements ICollege {
	private String collegeName = "VIVA";
	private String address = "Virar_West";

	@Override
	public String details() {
		return "College Name:" + collegeName + "\nAddress:" + address;
	}

}
