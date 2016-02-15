package com.jspiders.broadcastrecvrs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class RecieveBroadcast extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) 
	{
	    Toast.makeText(context,"Phone mode changed",Toast.LENGTH_SHORT).show();
	}

}
