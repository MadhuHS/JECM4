package com.jspiders.project1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends Activity {

	EditText nameEditText,usernameEditText,mobileEditText,passwordEditText;
	Button registeruserButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		
		nameEditText = (EditText) findViewById(R.id.editTextREGname);
		usernameEditText= (EditText) findViewById(R.id.editTextREGusername);
		mobileEditText = (EditText) findViewById(R.id.editTextREGmobilenumber);
		passwordEditText = (EditText) findViewById(R.id.editTextREGpassword);
		
		registeruserButton = (Button) findViewById(R.id.buttonREGregisteruser);
		
	}
	
	public void addtodatabase(View v)
	{
		String name = nameEditText.getText().toString();
		String username = usernameEditText.getText().toString();
		String mobile = mobileEditText.getText().toString();
		String password = passwordEditText.getText().toString();
		
		
		BackgroundTask b1 = new BackgroundTask();
		b1.execute("register",name,username,mobile,password);
	}

	

}
