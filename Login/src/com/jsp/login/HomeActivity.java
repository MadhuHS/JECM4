package com.jsp.login;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class HomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}
	
	@Override
	public void onBackPressed() 
	{
		super.onBackPressed();
		
		Intent stopappIntent = new Intent(HomeActivity.this,MainActivity.class);
		stopappIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		stopappIntent.putExtra("clear top", true);
		startActivity(stopappIntent);
	}

}
