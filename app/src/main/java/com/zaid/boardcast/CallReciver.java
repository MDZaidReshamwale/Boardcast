package com.zaid.boardcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.view.Gravity;
import android.widget.Toast;

public class CallReciver extends BroadcastReceiver {
    String state,number,message;
    @Override
    public void onReceive(Context context, Intent intent) {
        state = intent.getStringExtra(TelephonyManager.EXTRA_STATE);
        if(state.equals(TelephonyManager.EXTRA_STATE_RINGING)){
            number = intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);
            message = "phone is ringing";
            Toast.makeText(context, "Incoming Call From:"+number, Toast.LENGTH_SHORT).show();
        }
        if ((state.equals(TelephonyManager.EXTRA_STATE_OFFHOOK))){
            Toast.makeText(context, "Call Received", Toast.LENGTH_SHORT).show();
        }
        if (state.equals(TelephonyManager.EXTRA_STATE_IDLE)){
            message += "phone is idled";
            Toast.makeText(context, "Idled", Toast.LENGTH_SHORT).show();
        }
    }


}
