package com.techlabs.adapterdesignpattern;

public class TvAdapter implements ITV {
	ISmartTv smartTv;

	public TvAdapter(String PlayType) {
		if (PlayType.equalsIgnoreCase("Youtube")) {
			smartTv = new Youtube();
		} else if (PlayType.equalsIgnoreCase("Hotstar")) {
			smartTv = new HotStar();
		}
	}

	@Override
	public void display(String playType) {
		if (playType.equalsIgnoreCase("Youtube")) {
			smartTv.displayYoutube();
		} else if (playType.equalsIgnoreCase("Hotstar")) {
			smartTv.displayHotstar();

		}
	}

}
