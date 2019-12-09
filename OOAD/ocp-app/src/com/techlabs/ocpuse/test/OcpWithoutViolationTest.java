package com.techlabs.ocpuse.test;

import com.techlabs.ocpuse.FixedDeposit;
import com.techlabs.ocpuse.Holi;
import com.techlabs.ocpuse.Normal;

public class OcpWithoutViolationTest {
	public static void main(String[] args) {
		FixedDeposit fix=new FixedDeposit(101,"abc",100000,10,new Holi());
		
		FixedDeposit fix2=new FixedDeposit(102,"pqr",100000,10,new Normal());
		printInfo(fix);
		printInfo(fix2);
	}

	private static void printInfo(FixedDeposit fix) {
		System.out.println(fix.calcualteSimpleInterest());

	}

}
