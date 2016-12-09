package com.jeff.myapp;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;

public class NotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_layout);
    }

    public void showNotification(View view){
        NotificationCompat.Builder builder= new NotificationCompat.Builder(getBaseContext());
        builder.setSmallIcon(R.drawable.noti);
        builder.setContentTitle("My Notification");
        builder.setContentText("This is a notification");


        Intent intent=new Intent(getBaseContext(),NotificationOutputActivity.class);
        TaskStackBuilder stackBuilder=TaskStackBuilder.create(getBaseContext());
        stackBuilder.addParentStack(NotificationOutputActivity.class);
        stackBuilder.addNextIntent(intent);
        PendingIntent pendingIntent=stackBuilder.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(pendingIntent);
        NotificationManager NM= (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        NM.notify(0,builder.build());
    }
}
