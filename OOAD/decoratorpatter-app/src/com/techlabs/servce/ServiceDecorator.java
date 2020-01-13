package com.techlabs.servce;

public class ServiceDecorator implements Iserviceble {
	protected Iserviceble servicable;

	public ServiceDecorator(Iserviceble serviceble) {
		this.servicable = serviceble;
	}

	@Override
	public int getCost() {
		return this.servicable.getCost();

	}

	@Override
	public String getDescription() {
		return this.servicable.getDescription();
	}

}
