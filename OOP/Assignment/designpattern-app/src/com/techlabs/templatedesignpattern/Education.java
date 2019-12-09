package com.techlabs.templatedesignpattern;

public abstract class Education {
	public abstract void comleteSSC();

	public abstract void completeDiploma();

	public abstract void completeDegree();

	public final void completeEducation() {

		comleteSSC();
		completeDiploma();
		completeDegree();
	}

}
