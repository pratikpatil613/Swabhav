package com.techlabs.isp.test;

import com.techlabs.isp.DivMediaPlayer;
import com.techlabs.isp.IVideoMediaPlayer;
import com.techlabs.isp.WinAmpMediaPlayer;

public class MediaTest {
	public static void main(String[] args) {
		WinAmpMediaPlayer wap = new WinAmpMediaPlayer();
		wap.plyAudio();

		DivMediaPlayer dmp = new DivMediaPlayer();
		dmp.plyAudio();
		dmp.playVideo();

	}

}
