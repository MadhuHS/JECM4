package com.jsp.weatherupdates;

import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button refreshButton;
	TextView citynameTextView,tempTextView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		refreshButton = (Button) findViewById(R.id.buttonrefresh);
		citynameTextView = (TextView) findViewById(R.id.textViewcityname);
		tempTextView = (TextView) findViewById(R.id.textViewtemp);
		
		ConnectivityManager cmManager =   (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
		
		NetworkInfo networkInfo = cmManager.getActiveNetworkInfo();
		
		if(networkInfo==null&&networkInfo.isConnected())
		{
			refreshButton.setEnabled(false);
		}
		
		else
		{
			refreshButton.setEnabled(true);
			refreshButton.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) 
				{
					NetwrokJob netwrokJob = new NetwrokJob(citynameTextView, tempTextView);
					netwrokJob.execute();	
				}
			});
			
		}
	}

	

}
