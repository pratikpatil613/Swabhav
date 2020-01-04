package com.techlabs.adapterdesignpattern.test;

import com.techlabs.adapterdesignpattern.NormalTv;

public class AdpaterPatternTest {
	public static void main(String[] args) {
		NormalTv tv = new NormalTv();
		tv.display("Youtube");
		tv.display("Hotstar");
		tv.display("Movie");
		tv.display("MS Office");
	}

}
