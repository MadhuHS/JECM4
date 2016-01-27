package com.jspiders.myapp;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements android.view.View.OnClickListener {


	Button displaybutton,clearbutton;
	EditText inputedittext;
	TextView outputtextview;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		displaybutton = (Button)findViewById(R.id.buttondisplay);
		inputedittext = (EditText) findViewById(R.id.editTextinputmesage);
		outputtextview = (TextView) findViewById(R.id.textViewoutputmessage);
		clearbutton = (Button) findViewById(R.id.buttonclear);
		
		displaybutton.setOnClickListener(MainActivity.this);
		clearbutton.setOnClickListener(MainActivity.this);
		
		
		
	}

	/*public void OnDisplaybuttonclick(View v)
	{
		//Editable e1 = inputedittext.getText();
		//String s1 = inputedittext.getText().toString();
		outputtextview.setText(inputedittext.getText().toString());
	}*/

	@Override
	public void onClick(View v) 
	{
		if(v.getId()==R.id.buttondisplay)
		{
			outputtextview.setText(inputedittext.getText().toString());
		}
		
		else if (v.getId()==R.id.buttonclear)
		{
			outputtextview.setText("");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



}
