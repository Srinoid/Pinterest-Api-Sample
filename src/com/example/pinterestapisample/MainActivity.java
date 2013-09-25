package com.example.pinterestapisample;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

import com.pinterest.pinit.PinItButton;
import com.pinterest.pinit.PinItListener;

public class MainActivity extends Activity {
	
	String TAG = "SASI";
	String CLIENT_ID ="1433306";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// Use your client id from "register a client id" page http://developers.pinterest.com/manage/
		PinItButton.setPartnerId(CLIENT_ID);
		// To enable logging errors
		PinItButton.setDebugMode(true);
		
		PinItButton pinItButton;
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// Configure Pinit button
		pinItButton = (PinItButton) findViewById(R.id.pin_it_button);
		pinItButton.setImageUrl("http://designlap.com/wp-content/uploads/2013/04/artistic-photography-317486.jpg");
		pinItButton.setUrl("http://droidschools.blogspot.in/");
		pinItButton.setDescription("This is just a demo code for pinning");
		// Enable click listener
		pinItButton.setListener(new PinItListener() {
			 @Override
		        public void onStart() {
		            super.onStart();
		            Log.i(TAG, "PinItListener.onStart");
		        }

		        @Override
		        public void onComplete(boolean completed) {
		            super.onComplete(completed);
		            Log.i(TAG, "PinItListener.onComplete");
		        }

		        @Override
		        public void onException(Exception e) {
		            super.onException(e);
		            Log.i(TAG, "PinItListener.onException");
		        }

		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
