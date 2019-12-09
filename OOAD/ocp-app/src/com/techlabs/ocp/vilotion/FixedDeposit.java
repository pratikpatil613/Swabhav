package com.techlabs.ocp.vilotion;

public class FixedDeposit {
	private int accno;
	private String name;
	private double pricipleDeposit;
	private int duration;
	private FestivalType festivalType;

	public FixedDeposit(int accno, String name, double principleDeposit, int duration, FestivalType festivalType) {
		super();
		this.accno = accno;
		this.name = name;
		this.pricipleDeposit = principleDeposit;
		this.duration = duration;
		this.festivalType = festivalType;
	}
	
	public double getRate() {
		double rate = 0;
		if (FestivalType.values().equals("Normal")) {
			return rate = 0.07;
		} else if (FestivalType.Holi.equals("Holi")) {
			return rate = 0.08;

		}
		return rate = 0.09;

	}

	public double calcualteSimpleInterest() {
		double interest = pricipleDeposit * duration * getRate()/100;
		return interest;

	}

}
