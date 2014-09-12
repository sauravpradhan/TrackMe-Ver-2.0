package com.example.gps_test2;

import java.util.TimerTask;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.telephony.SmsManager;
import android.widget.Toast;

public class timerImp extends TimerTask{
	 SmsManager send_sms_obj = SmsManager.getDefault();
	// MainActivity location_var = new MainActivity();
	 //creating singleton

	  private static timerImp uniqInstance;

	  private timerImp() {
	  }

	  public static synchronized timerImp getInstance() {
	    if (uniqInstance == null) {
	      uniqInstance = new timerImp();
	    }
	    return uniqInstance;
	  }
	 
//end	 
	 public Activity activity;
	  //  public timerImp (Activity act)
	  //  {		
	   //      this.activity = act;
	  //  }
	@Override
	public void run() {
		//send_sms_obj.sendTextMessage("+917259250682", null, "Just Some Trial msg!", null, null);
	//	activity.runOnUiThread(new Runnable() {
			// public void run() {
				  String SENT = "SMS_SENT";
				  String DELIVERED = "SMS_DELIVERED";
				  
				  PendingIntent sentPI = PendingIntent.getBroadcast(MainActivity.context, 0,
			                new Intent(SENT), 0);

			      PendingIntent deliveredPI = PendingIntent.getBroadcast(MainActivity.context,
			                0, new Intent(DELIVERED), 0);
			   
			      
			      //when sms will be sent
			      MainActivity.context.registerReceiver(new BroadcastReceiver(){
			    	  @Override
			    	  public void onReceive(Context arg0, Intent arg1) {
			    	  switch (getResultCode())
			    	  {
			    	  case Activity.RESULT_OK:
			    	  Toast.makeText(MainActivity.context, "SMS sent",
			    	  Toast.LENGTH_SHORT).show();
			    	  break;
			    	  }
			    	  }
			    	  }, new IntentFilter(SENT));
			      	  
			      	 //when sms will be sent
			      MainActivity.context.registerReceiver(new BroadcastReceiver(){
			    	  @Override
			    	  public void onReceive(Context arg0, Intent arg1) {
			    	  switch (getResultCode())
			    	  {
			    	  case Activity.RESULT_OK:
			    	  Toast.makeText(MainActivity.context, "SMS Delivered",
			    	  Toast.LENGTH_SHORT).show();
			    	  break;
			    	  }
			    	  }
			    	  }, new IntentFilter(DELIVERED));


			      
				 // send_sms_obj.sendTextMessage("+917259250682", null, MainActivity.final_parsed_location, sentPI, deliveredPI);
			    
			    
			  }
	//	});
		//Toast.makeText(activity.getApplicationContext(),"Timer Expired!!", Toast.LENGTH_LONG).show();
		// TODO Auto-generated method stub
		
//	}
}
//}
