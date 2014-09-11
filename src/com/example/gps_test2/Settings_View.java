package com.example.gps_test2;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ListActivity;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TimePicker;
import android.widget.Toast;

public class Settings_View extends ListActivity
{
		TimePicker pickerTime;

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
			    	
			    	//Toast.makeText(this, "Set Timers", Toast.LENGTH_SHORT).show();
			    	
			    	final CharSequence[] items={"10 Mins","20 Mins","30 Mins"};
			    	
			    	AlertDialog.Builder builder=new AlertDialog.Builder(this);
			    	builder.setIcon(R.drawable.sms);
			    	builder.setTitle("Set Interval");
			    	//builder.setMessage("This interval determines the timegap while sending SMS to the selected contacts");
			    	builder.setPositiveButton("Set", new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {}
					});
			    
			    	builder.setSingleChoiceItems(items,-1, new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub	
							if("10 Secs".equals(items[which]))
							{
							 Toast.makeText(getBaseContext(), "10 Mins Selected", Toast.LENGTH_SHORT).show();
							}
							else if("20 Secs".equals(items[which]))
							{
								 Toast.makeText(getBaseContext(), "20 Mins Selected", Toast.LENGTH_SHORT).show();
							}
							else if("30 Secs".equals(items[which]))
							{
								 Toast.makeText(getBaseContext(), "30 Mins Selected", Toast.LENGTH_SHORT).show();
							}
							
						}
					});
			    	builder.show();
			    	
			    }
			    if(item.equalsIgnoreCase("Send Sms?"))
			    {
			    	Toast.makeText(this, "Send Sms", Toast.LENGTH_SHORT).show();
			    }
			  }
	}