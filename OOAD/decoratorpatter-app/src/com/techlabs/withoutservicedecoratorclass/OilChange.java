package com.techlabs.withoutservicedecoratorclass;

public class OilChange implements IServiceble {
	IServiceble serviceble;
	private int cost = 500;

	public OilChange(IServiceble servicable) {
		this.serviceble = servicable;
		// super(servicebe);
	}

	@Override
	public int getCost() {
		return this.serviceble.getCost() + this.cost;
	}

	@Override
	public String getDescription() {
		return this.serviceble.getDescription() + "+ OilChange rs: 500";

	}

}
