package com.bignerdranch.android.hellomoon;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class HelloMoonVideoActivity extends Activity {
	private VideoView mVideoView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_video);
		mVideoView = (VideoView)findViewById(R.id.helloMoonVideoActivity);
		//if you want the controls to appear
		mVideoView.setMediaController(new MediaController(this));
		Uri video = Uri.parse("android.resource://" + getPackageName() + "/" 
		+ R.raw.apollo_17_stroll); //do not add any extension
		//if your file is named sherif.mp4 and placed in /raw
		//use R.raw.sherif
		mVideoView.setVideoURI(video);
		setContentView(mVideoView);
		mVideoView.start();
	}

	
	
}
