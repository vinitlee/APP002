package com.vinitlee.app002;

import android.app.NotificationManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void buttonClicked(View v) {
        if (v.getId() == R.id.permissionsButton) {
            Intent intent = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
            startActivity(intent);
        }
        else if (v.getId() == R.id.makeNotificationButton) {
            NotificationManager nManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            NotificationCompat.Builder ncomp = new NotificationCompat.Builder(this);
            ncomp.setContentTitle("**TITLE**");
            ncomp.setContentText("**TEXT**");
            ncomp.setTicker("**TICKER**");
            ncomp.setSubText("**SUBTEXT**");
            ncomp.setSmallIcon(R.drawable.ic_launcher);
            ncomp.setAutoCancel(true);
            nManager.notify((int)System.currentTimeMillis(),ncomp.build());
        }
        else if (v.getId() == R.id.clearNotificationButton) {
            // TODO Clear notifications
        }
    }
}
