package com.example.imageloader;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;

public class ImageLoader extends AsyncTask<Void,Void,Void>{

	ImageView ilImageView,ilImageView2;
	Bitmap bitmap,bitmap2;
	private URL imgurl1;
	private HttpURLConnection connection;
	private InputStream ins;
	ImageLoader(ImageView maImageView1,ImageView maImageView2)
	{
		ilImageView = maImageView1;
		ilImageView2 = maImageView2;
	}
	@Override
	protected void onPreExecute() {
		super.onPreExecute();
	}
	
	
	@Override
	protected Void doInBackground(Void... arg0) 
	{
		try 
		{
			imgurl1 = new URL("http://i.dailymail.co.uk/i/pix/2013/08/28/article-2404712-1B815F79000005DC-228_306x423.jpg");
			connection =  (HttpURLConnection) imgurl1.openConnection();
			ins = connection.getInputStream();
			bitmap =  BitmapFactory.decodeStream(ins);
			
			imgurl1=  new URL("https://upload.wikimedia.org/wikipedia/commons/8/8e/Kareena_Heroine_2.jpg");
			connection =  (HttpURLConnection) imgurl1.openConnection();
			ins = connection.getInputStream();
			bitmap2 =  BitmapFactory.decodeStream(ins);
		
		
		} 
		
		
		catch (MalformedURLException e) 
		
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	protected void onProgressUpdate(Void... values)
	{
		super.onProgressUpdate(values);
	}
	
	@Override
	protected void onPostExecute(Void result) {
		super.onPostExecute(result);
		
		ilImageView2.setImageBitmap(bitmap2);

	}
	

	
	

}
