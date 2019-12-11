package com.techlabs.isp;

public class DivMediaPlayer implements IAudioMediaPlayer, IVideoMediaPlayer {
	@Override
	public void plyAudio() {
		System.out.println("DivMediaPlayer playing Audio");

	}

	@Override
	public void playVideo() {
		System.out.println("DivMediaPlayer playing Video");
	}
}
