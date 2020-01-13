package com.techlabs.servce;

public class WaterWash extends ServiceDecorator {
	private int cost = 100;

	public WaterWash(Iserviceble servicable) {
		super(servicable);
	}

	@Override
	public int getCost() {
		return super.getCost() + this.cost;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + "+ WaterWash rs: 100";
	}
}
