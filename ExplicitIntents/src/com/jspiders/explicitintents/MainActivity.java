package com.jspiders.explicitintents;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	Button launchbutton;
	EditText inputEditText;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		launchbutton = (Button) findViewById(R.id.buttonlaunch);
		inputEditText = (EditText) findViewById(R.id.editTextinput);
		
		launchbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				String data = inputEditText.getText().toString();
				Intent intent = new Intent(MainActivity.this,SecondActivity.class);
				intent.putExtra("Key1",Integer.parseInt(data));
				startActivity(intent);
				
			}
		});
	}


}
