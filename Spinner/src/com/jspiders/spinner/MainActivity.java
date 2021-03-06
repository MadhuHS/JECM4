package com.jspiders.spinner;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

	Spinner phonesspinner;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final String[] phonebrands = {"Sony","Samsung","Moto","Apple","Micromax","HTC","Blackberry","MI","Lenovo"};
		
		phonesspinner = (Spinner) findViewById(R.id.spinnerphones);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,phonebrands);
		phonesspinner.setAdapter(adapter);
		
		phonesspinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3) 
			{
				Log.d("[DEBUG]", phonebrands[position]);
				
				Toast.makeText(MainActivity.this,phonebrands[position],Toast.LENGTH_SHORT).show();
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) 
			{
				// TODO Auto-generated method stub
				
			}
		});
		
	}


}
