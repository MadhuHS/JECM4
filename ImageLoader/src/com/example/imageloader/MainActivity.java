package com.example.imageloader;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;

/*
 * this is main activity by which he AsyncTask will be triggered
 * Author : Madhu
 */


public class MainActivity extends Activity {

	
	ImageView displayimageview,diImageView2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		displayimageview = (ImageView) findViewById(R.id.imageView1);
		diImageView2 = (ImageView) findViewById(R.id.imageView2);
		
		ImageLoader imageLoader = new ImageLoader(displayimageview,diImageView2);
		imageLoader.execute();
	}

	
}
