package com.jspiders.widgets;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioGroup;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements android.widget.RadioGroup.OnCheckedChangeListener{

	CheckBox opt1,opt2;
	RadioGroup radiogroup1;
	ToggleButton toggleButton1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		opt1 = (CheckBox) findViewById(R.id.checkBoxoption1);
		opt2 = (CheckBox) findViewById(R.id.checkBoxoption2);
		radiogroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
		toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton1);
		
		
		toggleButton1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) 
			{
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		
		if(opt1.isChecked())
		{
			Log.d("[DEBUG]", "Opt1 is selected");
		}
		
		opt1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean state) 
			{
				if(state==true)
				{
					Log.d("[DEBUG]", "Option1 is selected");
				}
				
				else
				{
					Log.d("[DEBUG]", "Option1 is not selected");

				}
			}
		});
		
	}

	@Override
	public void onCheckedChanged(RadioGroup arg0, int id) 
	{
		switch (id) 
		{
		case 0:Log.d("[DEBUG]", "1st Radio button is selected");
		break;
		
		case 1:Log.d("[DEBUG]", "2nd Radio button is selected");
		break;
		
		case 2:Log.d("[DEBUG]", "3rd Radio button is selected");
		break;
		
		case 3:Log.d("[DEBUG]", "4th Radio button is selected");

		default:
			break;
		}
		
	}


}
