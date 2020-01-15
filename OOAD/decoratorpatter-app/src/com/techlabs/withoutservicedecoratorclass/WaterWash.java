package com.techlabs.withoutservicedecoratorclass;


public class WaterWash extends OilChange {
	private int cost = 100;

	public WaterWash(IServiceble servicable) {
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
