package com.zaid.boardcast

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.util.Log

class MyService : Service() {
    var TAG = MyService::class.java.simpleName

    override fun onCreate() {
        super.onCreate()
        Log.i(TAG,"oncreate-myservice")
////        var songname = intent?.getStringExtra("songname")
//        Log.i(TAG,"i am playing--"+songname)
//        var  mplayer = MediaPlayer.create(this,R.raw.music)
//        mplayer.start()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i(TAG,"onstartcommand-myservice")

        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"ondestroy-myservice")

    }

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
}