package com.zaid.boardcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.telephony.TelephonyManager
import android.view.Gravity
import android.widget.Toast

class CallReceiver : BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        TODO("Not yet implemented")
    }

//
//    private fun showSmsBody(intent: Intent, context: Context) {
//        var  bundle: Bundle
//        var  currentSMS: SmsMessage
//        var  message: String
//        if (intent.action.equals("android.provider.Telephony.SMS_RECEIVED")) {
//            bundle = intent.extras!!
//            if (bundle != null) {
//                val pdu_Objects = bundle.get("pdus") as Array<Any>
//                if (pdu_Objects != null) {
//                    for (aObject in pdu_Objects) {
//                        currentSMS = getIncomingMessage(aObject, bundle)
//                        val senderNo: String = currentSMS.getDisplayOriginatingAddress()
//                        message = currentSMS.getDisplayMessageBody()
//                        Toast.makeText(context,
//                            "senderNum: $senderNo :\n message: $message",
//                            Toast.LENGTH_LONG
//                        ).show()
//                    }
//                    // abortBroadcast()
//                    // End of loop
//                }
//            }
//        }
//    }
//
//    private fun getIncomingMessage(aObject: Any, bundle: Bundle): SmsMessage {
//        val currentSMS: SmsMessage
//        currentSMS = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            val format = bundle.getString("format")
//            SmsMessage.createFromPdu(aObject as ByteArray, format)
//        } else {
//            SmsMessage.createFromPdu(aObject as ByteArray)
//        }
//        return currentSMS
//    }
//}
////    override fun onReceive(context: Context?, intent: Intent?) {
////        if(intent!!
////                .getStringExtra(TelephonyManager.EXTRA_STATE)==
////            TelephonyManager.EXTRA_STATE_OFFHOOK){
////            showToast(context!!, "Phone call is Started...")
////        }else if (
////            intent.getStringExtra(TelephonyManager.EXTRA_STATE)
////            == TelephonyManager.EXTRA_STATE_IDLE){
////            showToast(context!!, "Phone call is Ended!...")
////        }else if (
////            intent.getStringExtra(TelephonyManager.EXTRA_STATE)
////            == TelephonyManager.EXTRA_STATE_RINGING){
////            showToast(context!!, "Incoming call!...")
////
////        }
////
////    }
////
//////    show toast function
////
////    fun showToast(c: Context, msg: String) {
////        val toast = Toast.makeText(c,msg,Toast.LENGTH_LONG)
////        toast.setGravity(Gravity.CENTER,0,0)
////        toast.show()
////    }


}