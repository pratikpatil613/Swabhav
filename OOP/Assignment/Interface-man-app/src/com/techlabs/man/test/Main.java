package com.techlabs.man.test;

import com.techlabs.man.Boy;
import com.techlabs.man.IEmotionable;
import com.techlabs.man.IMannerable;
import com.techlabs.man.Man;

public class Main {
	public static void main(String[] args) {
		Man x = new Man();
		Boy y = new Boy();

		atThePartyHall(x);
		atThePartyHall(y);

		// atTheCinemaHall(x);
		atTheCinemaHall(y);

	}

	private static void atTheCinemaHall(IEmotionable obj) {
		obj.cry();
		obj.laugh();

	}

	private static void atThePartyHall(IMannerable obj) {
		obj.wish();
		obj.depart();

	}

}
