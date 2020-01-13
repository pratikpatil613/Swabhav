package com.techlabs.servce;

public class OilChange extends ServiceDecorator {
	private int cost = 400;

	public OilChange(Iserviceble servicebe) {
		super(servicebe);
	}

	@Override
	public int getCost() {
		return super.getCost() + this.cost;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + "+ OilChange rs: 400";

	}

}
