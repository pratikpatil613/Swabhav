package com.techlabs.ocpuse;

public class FixedDeposit {
	private int accno;
	private String name;
	private double pricipleDeposit;
	private int duration;
	private IFestivalRate iFestivalRate;

	public FixedDeposit(int accno, String name, double principleDeposit, 
			int duration,IFestivalRate iFestivalRate) {
		super();
		this.accno = accno;
		this.name = name;
		this.pricipleDeposit = principleDeposit;
		this.duration = duration;
		this.iFestivalRate=iFestivalRate;
	}
	
	
	public double calcualteSimpleInterest() {
		double interest = pricipleDeposit * duration *iFestivalRate.getRate();
		return interest;

	}

}
