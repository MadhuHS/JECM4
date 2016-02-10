package com.jspiders.dynamicfragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button launchbutton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		launchbutton = (Button) findViewById(R.id.button1);
		
		launchbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				DynamicFragments dynamicFragments = new DynamicFragments();

				FragmentManager fm =  getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				ft.add(R.id.main_activity_id,dynamicFragments);
				ft.addToBackStack("frag1");
			
				ft.commit();
				
			}
		});
	}


}
