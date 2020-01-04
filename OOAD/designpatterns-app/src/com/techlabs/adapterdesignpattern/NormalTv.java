package com.techlabs.adapterdesignpattern;

public class NormalTv implements ITV {
	TvAdapter tvAdapter;

	@Override
	public void display(String PlayType) {
		if (PlayType.equalsIgnoreCase("Movie")) {
			System.out.println("playing movie");

		} else if (PlayType.equalsIgnoreCase("Hotstar") || PlayType.equalsIgnoreCase("Youtube")) {
			tvAdapter = new TvAdapter(PlayType);
			tvAdapter.display(PlayType);
		} else {
			System.out.println(PlayType + " Invalid choice");
		}
	}

}
