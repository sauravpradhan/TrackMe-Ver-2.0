package com.example.gps_test2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.Toast;

public class uiHandler extends Handler{
	
public static uiHandler uiInstance=null;


private uiHandler(Context con, Looper loop)
{
	super(loop);
}

public static void getInstance (Context con, Looper loop)
{
	if(uiInstance == null)
	{
		uiInstance = new uiHandler( con,  loop);
	}
}

@Override
public void handleMessage(Message msg) {
	// TODO Auto-generated method stub
	super.handleMessage(msg);
	switch(msg.what)
	{
	case Constants.Show_toast_msg:
		Toast.makeText(MainActivity.context,"Sms sent Fake! Timer Expired!!"+MainActivity.final_parsed_location, Toast.LENGTH_LONG).show();
		
	
	}
	 
}


}
