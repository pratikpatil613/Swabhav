package com.techlabs.faceddesignpattren;

public class AtharvaCollege implements ICollege {
	private String collegeName = "Atharva";
	private String address = "Malad_West";

	@Override
	public String details() {
		return "College Name:" + collegeName + "\nAddress:" + address;
	}

}
