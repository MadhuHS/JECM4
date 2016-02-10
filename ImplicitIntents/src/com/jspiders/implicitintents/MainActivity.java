package com.jspiders.implicitintents;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button cameraButton,callButton,browseButton;
	ImageView outputImageView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		cameraButton = (Button) findViewById(R.id.buttoncamera);
		callButton = (Button) findViewById(R.id.buttoncall);
		browseButton = (Button) findViewById(R.id.buttonbrowse);
		outputImageView = (ImageView) findViewById(R.id.imageViewoutput);
		
		cameraButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
				//startActivity(intent);
				startActivityForResult(intent,1);
			}
		});
		
		
		callButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				Intent intent = new Intent(Intent.ACTION_DIAL);//new Intent(Intent.ACTION_CALL)
				intent.setData(Uri.parse("tel:"+"998652661"));
				startActivity(intent);
				
			}
		});
	
	browseButton.setOnClickListener(new OnClickListener() 
	{
		
		@Override
		public void onClick(View arg0) 
		{
			Intent intent = new Intent(Intent.ACTION_VIEW);
			intent.setData(Uri.parse("https://www.google.com"));
			startActivity(intent);
		}
	});
	
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) 
	{
		super.onActivityResult(requestCode, resultCode, data);
		
		if(resultCode==RESULT_OK) 
		{
		    Bundle bundle = data.getExtras();
		    Bitmap bitmap = (Bitmap) bundle.get("data");
		    outputImageView.setImageBitmap(bitmap);
		    
		    // outputImageView.setImageBitmap((Bitmap) data.getExtras().get("data"));
	
		
		}
		
		else
		{
			Toast.makeText(MainActivity.this,"ERROR", Toast.LENGTH_SHORT).show();
		}
		
	}


}
