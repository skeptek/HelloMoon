package com.bignerdranch.android.hellomoon;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.VideoView;

public class HelloMoonFragment extends Fragment {
	private VideoView videoView;
	private Button mPlayButton;
	private Button mStopButton;
	private Button mPauseButton;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent,
			Bundle savedInstanceState) {
		
		View v = inflater.inflate(R.layout.fragment_hello_moon, parent, false);
		mPlayButton = (Button)v.findViewById(R.id.hellomoon_playButton);
		mPlayButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//mPlayer.play(getActivity());
				videoView = (VideoView)getActivity().findViewById(R.id.VideoView);
				Uri video = Uri.parse("android.resource://" + getActivity().getPackageName() + "/" 
						+ R.raw.apollo_17_stroll);
				videoView.setVideoURI(video);
				//getActivity().setContentView(videoView);
				videoView.start();
			}
		});
		
		mStopButton = (Button)v.findViewById(R.id.hellomoon_stopButton);
		mStopButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//mPlayer.stop();
				videoView.stopPlayback();
			}
		});
		
		mPauseButton = (Button)v.findViewById(R.id.hellomoon_pauseButton);
		mPauseButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//mPlayer.pause(getActivity());
			}
		});
		
		return v;
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		//mPlayer.stop();
	}
	
}
