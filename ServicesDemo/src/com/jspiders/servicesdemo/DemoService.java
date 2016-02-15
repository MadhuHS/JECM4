package com.jspiders.servicesdemo;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class DemoService extends Service {

	MediaPlayer mp;
	
	@Override
	public void onCreate() 
	{
		super.onCreate();
		mp = MediaPlayer.create(DemoService.this,R.raw.sound_1);
		Toast.makeText(DemoService.this,"Inside Oncreate() method",Toast.LENGTH_SHORT).show();
		
		
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) 
	{
		Toast.makeText(DemoService.this,"Inside Onstartcommand() method",Toast.LENGTH_SHORT).show();
		mp.start();
        return super.onStartCommand(intent, flags, startId);
	}
	
	
	@Override
	public void onDestroy() 
	{
		Toast.makeText(DemoService.this,"Inside OnDestroy() method",Toast.LENGTH_SHORT).show();
        mp.stop();
		super.onDestroy();
	}
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public IBinder onBind(Intent arg0) 
	{
		
		return null;
	}

}
