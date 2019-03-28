package com.durga.balaji66.intentserviceexample;


import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class HelloIntentService extends IntentService {



    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     */
    public HelloIntentService() {
        super("HelloIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        try{
            Log.i("Practice", "onHandleIntent Thread time started");
            Thread.sleep(5000);
            Log.i("Practice", "onHandleIntent Thread time completed ");

        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("Practice","Service is running");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.i("Practice","Service is Destroyed");
        super.onDestroy();
    }

    @Override
    public void onCreate() {
        Log.i("Practice","Service onCreate is executed");
        super.onCreate();
    }
}


