package com.techlabs.ocp.vilotion.Test;

import com.techlabs.ocp.vilotion.FestivalType;
import com.techlabs.ocp.vilotion.FixedDeposit;

public class OcpviolationTest {
	public static void main(String[] args) {
		FixedDeposit fix = new FixedDeposit(101, "xyz", 100000, 10, FestivalType.Normal);

		printInfo(fix);
	}

	private static void printInfo(FixedDeposit fix) {
		System.out.println(fix.calcualteSimpleInterest());
		System.out.println(fix.getRate());

	}

}
