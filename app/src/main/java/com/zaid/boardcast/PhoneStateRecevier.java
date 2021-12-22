package com.zaid.boardcast;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

public class PhoneStateRecevier extends BroadcastReceiver {

    private static final String TAG = "PhoneStatReceiver";

    private static boolean incomingFlag = false;

    private static String incoming_number = null;



    @Override

    public void onReceive(Context context, Intent intent) {


        if(intent.getAction().equals(Intent.ACTION_NEW_OUTGOING_CALL)){

            incomingFlag = false;

            String phoneNumber = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);
            Toast.makeText(context,"call OUT:"+phoneNumber, Toast.LENGTH_SHORT).show();
            Log.i(TAG, "call OUT:"+phoneNumber);

        }else{


            TelephonyManager tm =

                    (TelephonyManager)context.getSystemService(Service.TELEPHONY_SERVICE);



            switch (tm.getCallState()) {

                case TelephonyManager.CALL_STATE_RINGING:

                    incomingFlag = true;//标识当前是来电

                    incoming_number = intent.getStringExtra("incoming_number");
                    Toast.makeText(context,"Ringing:"+incoming_number, Toast.LENGTH_SHORT).show();

                    Log.i(TAG, "RINGING :"+ incoming_number);

                    break;

                case TelephonyManager.CALL_STATE_OFFHOOK:

                    if(incomingFlag){

                        Log.i(TAG, "incoming ACCEPT :"+ incoming_number);
                        Toast.makeText(context,"incoming ACCEPT:"+ incoming_number, Toast.LENGTH_SHORT).show();

                    }

                    break;



                case TelephonyManager.CALL_STATE_IDLE:

                    if(incomingFlag){

                        Log.i(TAG, "incoming IDLE");
                        Toast.makeText(context,"incoming IDLE"+ incoming_number, Toast.LENGTH_SHORT).show();

                    }

                    break;

            }

        }


}
}
