package com.jspiders.servicesdemo;

import android.app.IntentService;
import android.content.Intent;

public class IntentServiceDemo extends IntentService {

	public IntentServiceDemo(String name) 
	{
		super("Helper Thread");
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		return super.onStartCommand(intent, flags, startId);
	}
	
	
	
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
	
	
	@Override
	protected void onHandleIntent(Intent arg0)
	{
		
		
	}

}
