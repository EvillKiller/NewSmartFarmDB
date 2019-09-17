package com.battistradadeveloper.smartfarm;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splashscreen extends AppCompatActivity {
	private int waktu_loading = 4000;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splashscreen);

		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				Intent login = new Intent(Splashscreen.this, MainActivity.class);
				startActivity(login);
				finish();
			}
		},waktu_loading);
	}
}
