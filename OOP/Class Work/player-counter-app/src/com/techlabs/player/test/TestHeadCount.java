package com.techlabs.player.test;

import com.techlabs.player.Player;

public class TestHeadCount {
	public static void main(String[] args) {

		Player p1 = new Player(1, "pratik", 20);
		Player p2 = new Player(2, "aniket", 22);
		Player p3 = new Player(3, "Akash", 23);

		System.out.println(p1.getCount());
	}
}
