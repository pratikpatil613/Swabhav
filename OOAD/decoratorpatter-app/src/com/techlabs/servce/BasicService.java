package com.techlabs.servce;

public class BasicService implements Iserviceble {
	int cost=350;

	public BasicService() {
		this.cost = cost;
	}

	@Override
	public int getCost() {
		return cost;
	}

	@Override
	public String getDescription() {
		return "BasicSevice rs:350";
	}

}
