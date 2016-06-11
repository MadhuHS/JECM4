package com.jspiders.threads_demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button startButton;
	TextView statusTextView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		startButton = (Button) findViewById(R.id.buttonstart);
		statusTextView = (TextView) findViewById(R.id.textView1);
		
		startButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				longrunningtask();
			}
		} );
	}


	
	public void longrunningtask()
	{
		
	     new Thread(new Runnable() {
			
			@Override
			public void run() 
			{
				Log.d("DEBUG", "executing long running task");
				for (int i = 0; i <1000000000 ; i++) 
				{
					try 
					{
						Thread.sleep(2000);
						statusTextView.setText(""+i);

					}
					
					catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
				
			}
		} ).start();
	
	}

}
