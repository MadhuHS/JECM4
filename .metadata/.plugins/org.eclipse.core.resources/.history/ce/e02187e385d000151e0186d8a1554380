package com.jspiders.multipanefragments;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class VersionList extends ListFragment {
	
/*	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) 
	{

		return inflater.inflate(R.layout.list_fragment, container,false);
	}*/
	
    @Override
    public void onActivityCreated(Bundle savedInstanceState) 
    {
    	super.onActivityCreated(savedInstanceState);
    	
    	final String[] version_names = {"Version 1","Version 2","Version 3","Version 4","Version 5","Version 6"};
    	
    	ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,version_names);
    	setListAdapter(adapter);
    }
    
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
    	// TODO Auto-generated method stub
    	super.onListItemClick(l, v, position, id);
    	
    	
    }
    
  
	
}
