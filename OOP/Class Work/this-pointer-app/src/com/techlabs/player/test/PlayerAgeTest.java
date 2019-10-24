package com.techlabs.player.test;

import com.techlabs.player.Player;

public class PlayerAgeTest {
	public static void main(String[] args) {
		Player virat = new Player(101, "virat");
		Player sachin = new Player(102, "sachin", 30);

		Player elder = virat.whosIsElder(sachin);
		System.out.println(elder.hashCode());
		System.out.println(virat.hashCode());
		System.out.println(sachin.hashCode());
		System.out.println(elder.getname());

	}

}
