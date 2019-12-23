package com.techlabs.faceddesignpattren;

public class DetaisTeller {

	private ICollege vivaCollege;
	private ICollege atharvaCollege;

	public DetaisTeller() {
		vivaCollege = new VivaCollege();
		atharvaCollege = new AtharvaCollege();

	}

	public String vivaCollegeDetais() {
		return vivaCollege.details();
	}

	public String atharvaCollegeDetails() {
		return atharvaCollege.details();

	}

}
