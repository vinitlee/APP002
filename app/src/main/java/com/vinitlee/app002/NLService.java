package com.vinitlee.app002;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.speech.tts.TextToSpeech;
import android.util.Log;

import java.util.ArrayList;
import java.util.Set;

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
        Log.i(TAG,"PACKAGE : " + sbn.getPackageName());
        Log.i(TAG,"WHEN : " + sbn.getNotification().when);
        Log.i(TAG,"TICKERTXT : " + sbn.getNotification().tickerText);
        Log.i(TAG,"CONTENTS : " + sbn.getNotification().describeContents());
        Log.i(TAG,"GROUP : " + sbn.getNotification().getGroup());
        Log.i(TAG,"SORTKEY : " + sbn.getNotification().getSortKey());
        Log.i(TAG,"TOSTRING : " + sbn.getNotification().toString());

//        String[] keysOfInterest = {"title","subtext","infoText"};
        Bundle notificationExtras = sbn.getNotification().extras;
//        Log.i(TAG,notificationExtras.toString());
        Set<String> keys = notificationExtras.keySet();
        for (String k : keys) {
            Log.i(TAG,k + " : " + notificationExtras.get(k));
        }
    }

    @Override
    public void onNotificationRemoved(StatusBarNotification sbn) {
        super.onNotificationRemoved(sbn);
        Log.i(TAG,"onNotificationRemoved");
    }

}
