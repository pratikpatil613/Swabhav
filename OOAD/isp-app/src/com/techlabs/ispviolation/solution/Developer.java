package com.techlabs.ispviolation.solution;

public class Developer implements IWork {

	@Override
	public void startWork() {
		System.out.println("Developer Start Working");

	}

	@Override
	public void stopWork() {
		System.out.println("Developer Stop Working");

	}

}
