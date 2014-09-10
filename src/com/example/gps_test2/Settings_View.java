package com.example.gps_test2;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Settings_View extends ListActivity
{

		public void onCreate(Bundle icicle)
		{
			super.onCreate(icicle);
			String[] values = new String[] { "Set Timers", "Send Sms?"};
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
	        android.R.layout.simple_list_item_1, values);
			setListAdapter(adapter);
	  }
		  protected void onListItemClick(ListView l, View v, int position, long id) {
			    String item = (String) getListAdapter().getItem(position);
			    if(item.equalsIgnoreCase("Set Timers"))
			    {
			    	Toast.makeText(this, "Set Timers", Toast.LENGTH_SHORT).show();
			    }
			    if(item.equalsIgnoreCase("Send Sms?"))
			    {
			    	Toast.makeText(this, "Send Sms", Toast.LENGTH_SHORT).show();
			    }
			  }
	}