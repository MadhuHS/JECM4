package com.jspiders.activitylifecycle;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	TextView statustextview;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		statustextview = (TextView) findViewById(R.id.textViewstatus);
		Toast.makeText(MainActivity.this,"Inside onCreate() method",Toast.LENGTH_SHORT).show();
		statustextview.setText("Inside onCreate() method");
	}

	@Override
	protected void onStart() 
	{
		super.onStart();
		Toast.makeText(MainActivity.this,"Inside onStart() method",Toast.LENGTH_SHORT).show();
		statustextview.setText("Inside onStart() method");	
	}

	@Override
	protected void onResume() {
		super.onResume();
		Toast.makeText(MainActivity.this,"Inside onResume() method",Toast.LENGTH_SHORT).show();
		statustextview.setText("Inside onResume() method");	
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		Toast.makeText(MainActivity.this,"Inside onPause() method",Toast.LENGTH_SHORT).show();
		statustextview.setText("Inside onPause() method");	
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		Toast.makeText(MainActivity.this,"Inside onStop() method",Toast.LENGTH_SHORT).show();
		statustextview.setText("Inside onStop() method");	
	}
	
	@Override
	protected void onRestart() {
		super.onRestart();
		Toast.makeText(MainActivity.this,"Inside onRestart() method",Toast.LENGTH_SHORT).show();
		statustextview.setText("Inside onRestart() method");	
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Toast.makeText(MainActivity.this,"Inside onDestroy() method",Toast.LENGTH_SHORT).show();
		statustextview.setText("Inside onDestroy() method");	
	}
	
	
	
	
}
