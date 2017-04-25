package com.vinitlee.app002;

import android.content.Intent;
import android.os.IBinder;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.speech.tts.TextToSpeech;
import android.util.Log;

/**
 * Created by vinitlee on 4/24/2017.
 *
 * Extends the NotificationListenerService to do extra things on notification events.
 */

public class NLService extends NotificationListenerService {

    private static final String TAG = "NLService";

    @Override
    public IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {
        super.onNotificationPosted(sbn);
        Log.i(TAG,"PACKAGE   : " + sbn.getPackageName());
        Log.i(TAG,"WHEN      : " + sbn.getNotification().when);
        Log.i(TAG,"TICKERTXT : " + sbn.getNotification().tickerText);
        Log.i(TAG,"TOSTRING  : " + sbn.getNotification().toString());
    }

    @Override
    public void onNotificationRemoved(StatusBarNotification sbn) {
        super.onNotificationRemoved(sbn);
        Log.i(TAG,"onNotificationRemoved");
    }

}
