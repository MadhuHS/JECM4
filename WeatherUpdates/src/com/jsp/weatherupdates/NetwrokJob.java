package com.jsp.weatherupdates;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class NetwrokJob extends AsyncTask<Void, Void, Void> {

	TextView njCitynametextview,njTempteTextView;
	Bundle b1;
	//String Stupdateurl = "http://api.openweathermap.org/data/2.5/weather?q=London,uk&appid=44db6a862fba0b067b1930da0d769e98";
	
	public NetwrokJob(TextView maCityname,TextView maTemp ) 
	{
		njCitynametextview = maCityname;
		njTempteTextView = maTemp;
	}
	
	
	@Override
	protected Void doInBackground(Void... params) 
	{
		try 
		{
			URL updateurl = new URL("http://api.openweathermap.org/data/2.5/weather?q=London,uk&appid=44db6a862fba0b067b1930da0d769e98");
			
			HttpURLConnection connection = (HttpURLConnection) updateurl.openConnection();
			
            InputStream ins =  connection.getInputStream();
		    
		    InputStreamReader insr = new InputStreamReader(ins);
		    
		    BufferedReader reader = new BufferedReader(insr);
		    
		    StringBuffer buffer = new StringBuffer();
		    
		    String line = "";
			
			while(( line = reader.readLine())!=null)
			{
				buffer.append(line+"/r"+"/n");
			}
			
			String result = buffer.toString();
			
			Log.d("JSON RESPONSE", result);
			
			b1 = JsonParser.parsejson(result);
			
			
		} 
		
		catch (MalformedURLException e) 
		
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	protected void onPostExecute(Void result)
	{
		super.onPostExecute(result);
		njCitynametextview.setText(b1.getString("cityname"));
		njTempteTextView.setText(""+b1.getDouble("citytemp"));
		
	}

}
