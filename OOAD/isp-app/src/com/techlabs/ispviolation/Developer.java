package com.techlabs.ispviolation;

import javax.management.RuntimeErrorException;

public class Developer implements IWork {

	@Override
	public void startWork() {
		System.out.println("Developer start Working");

	}

	@Override
	public void stopWork() {
		System.out.println("Developer Stop Working");

	}

	@Override
	public void startEat() {
		throw new RuntimeException("violating isp");

	}

	@Override
	public void stopEat() {
		throw new RuntimeException("violating isp");

	}

}
