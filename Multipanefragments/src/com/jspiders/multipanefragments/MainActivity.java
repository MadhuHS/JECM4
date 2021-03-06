package com.jspiders.multipanefragments;

import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.Menu;
import android.view.animation.DecelerateInterpolator;

public class MainActivity extends Activity implements Communicator {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//to know if my app is running on mobile phone
		if(findViewById(R.id.fragment_container)!=null)
		{
			VersionList list = new VersionList();
			
			FragmentManager fm = getFragmentManager();
			
			FragmentTransaction transaction =  fm.beginTransaction();
			
			transaction.add(R.id.fragment_container,list);
			
				
			transaction.commit();	
		}
		
		
			
		
	}

	
	@Override
	public void onPositionchangedListner(int position)
	{
		
		
		VersionDescription descriptionfragment = (VersionDescription) getFragmentManager().findFragmentById(R.id.fragment_description);
		
		if(descriptionfragment!=null)
		{
			descriptionfragment.recvposition(position);
				
		}
			
		else
		{
            VersionDescription description = new VersionDescription();
            
            Bundle argumnets = new Bundle();
            
            argumnets.putInt("position", position);
            
            description.setArguments(argumnets);
            
			FragmentManager fm = getFragmentManager();
			
			FragmentTransaction transaction =  fm.beginTransaction();
			
			transaction.replace(R.id.fragment_container, description);
			
			transaction.addToBackStack(null);
			
			transaction.commit();
			
		}
	}

}
