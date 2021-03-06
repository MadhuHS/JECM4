package com.jsp.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	
	TextView logotextview,signuptextview,forgotpassswordtextview;
	EditText usernameedittext,passwordedittedt;
	CheckBox rembrpwdcheckbox;
	Button loginbutton;
	
	String stUsername = "abc";
	String stPassword = "1234";
	
	private String entusername;
	private String entpassword;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		usernameedittext = (EditText) findViewById(R.id.editTextusername);
		passwordedittedt = (EditText) findViewById(R.id.editTextpassword);
		loginbutton = (Button) findViewById(R.id.buttonlogin);
		rembrpwdcheckbox = (CheckBox) findViewById(R.id.checkBoxrembrpwd);
		
		loginbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				entusername = usernameedittext.getText().toString();
				entpassword = passwordedittedt.getText().toString();
				
				if(entusername.equalsIgnoreCase(stUsername)&&entpassword.equals(stPassword))
				{
					Log.d("[DEBUG]", "Login Success");
				}
				
				else
				{
					Log.d("[DEBUG]", "Login failed");
				}
			}
		});
		
		rembrpwdcheckbox.setOnCheckedChangeListener(new OnCheckedChangeListener() 
		{
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean state) 
			{
				if(state==true)
				{
					entusername = usernameedittext.getText().toString();
					entpassword = passwordedittedt.getText().toString();
					
					SharedPreferences sharedPreferences = getSharedPreferences("Login details",Context.MODE_PRIVATE);
					SharedPreferences.Editor editor = sharedPreferences.edit();
					editor.putString("username",entusername);
					editor.putString("password",entpassword);
					editor.putBoolean("isdatasaved",true);
					editor.commit();
				}
			}
		});
	}

	@Override
	protected void onStart()
	{
		super.onStart();
		
		
		 Intent intent = getIntent();
		 
		 boolean cleartop = intent.getBooleanExtra("clear top", false);
		 
		 if(cleartop==true)
		 {
			 finish();
		 }
		
	
		 else
		 
		 {
		 
		SharedPreferences sharedPreferences = getSharedPreferences("Login details",Context.MODE_PRIVATE);
		/*String spUsername = sharedPreferences.getString("username", "n/a");
		String spPassword = sharedPreferences.getString("password", "n/a");*/
		
		
		/*usernameedittext.setText(spUsername);
		passwordedittedt.setText(spPassword);*/
		
		boolean saved = sharedPreferences.getBoolean("isdatasaved",false);
		
		if(saved==true)
		{
			Intent homeIntent = new Intent(MainActivity.this,HomeActivity.class);
			startActivity(homeIntent);
		}
		
		 }
		
		
		
	}


}
