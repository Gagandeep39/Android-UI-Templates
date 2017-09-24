package com.example.gagandeep.myapplication.Notification;

import android.app.ActionBar;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.gagandeep.myapplication.R;

public class NotificationActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        click();
    }

    private void click() {
        textView = findViewById(R.id.textNotification);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                simpleNotification();
            }
        });

        textView = findViewById(R.id.textBig);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bigNotification();
            }
        });

        textView = findViewById(R.id.textImage);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageNotification();
            }
        });

        textView = findViewById(R.id.textSimple);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                simpleNotification2();
            }
        });

        textView = findViewById(R.id.textSimple2);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                simpleNotification_2();
            }
        });

        textView = findViewById(R.id.textSimple3);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                simpleNotification3();
            }
        });

        textView = findViewById(R.id.textImage2);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageNotification2();
            }
        });

        textView = findViewById(R.id.textSimple4);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                four();
            }
        });
    }

    private void four() {
        NotificationCompat.Builder notification = new NotificationCompat.Builder(this);
        notification.setColor(getResources().getColor(R.color.design_9));
        notification.setContentText("Simple notification four");
        notification.setContentTitle("KLOLOL hi");
        notification.setSmallIcon(R.drawable.ic_star_black_24dp);

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0, notification.build());
    }


    private void imageNotification2() {
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.rime_blurpng);
        NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle();
        bigPictureStyle.bigPicture(bitmap);
        bigPictureStyle.bigLargeIcon(bitmap);
        bigPictureStyle.setSummaryText("Rime Blurred Image");
        bigPictureStyle.setSummaryText("Another Recollection notification");

        NotificationCompat.Builder notification = new NotificationCompat.Builder(this);
        notification.setColor(getResources().getColor(R.color.design_11));
        notification.setStyle(bigPictureStyle);
        notification.setContentTitle("Image Notification");
        notification.setContentText("Hiiii All");

        NotificationManager notificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0, notification.build());
    }

    private void simpleNotification3() {

        NotificationCompat.Builder notification = new NotificationCompat.Builder(this);
        notification.setColor(getResources().getColor(R.color.design_10));
        notification.setContentTitle("Third Simple Notification");
        notification.setContentText("This is the third notification text....just wanted to revise it");
        notification.setSmallIcon(R.drawable.ic_star_black_24dp);
        //notification.setOngoing(true);
        NotificationManager notificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0, notification.build());
    }

    private void simpleNotification_2() {

        NotificationCompat.Builder notification = new NotificationCompat.Builder(this);
        notification.setColor(getResources().getColor(R.color.design_9));
        notification.setSmallIcon(R.drawable.ic_star_black_24dp);
        notification.setContentTitle("Just a revision of my memorizing skills");
        notification.setContentText("N wonder there are millions of things here to memorize over and over again ....doesnt even mater im clear with the concept");


        NotificationManager notificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0, notification.build());
    }

    private void simpleNotification2() {

        NotificationCompat.Builder notification1 = new NotificationCompat.Builder(this);
        notification1.setContentTitle("This is second notification");
        notification1.setContentText("Memorizing this doesn't really makes sense");
        notification1.setColor(getResources().getColor(R.color.design_8));
        notification1.setSmallIcon(R.drawable.ic_star_black_24dp);

        NotificationManager notificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0, notification1.build());
    }

    private void imageNotification() {
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.rime);
        NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle().bigPicture(bitmap);
        bigPictureStyle.setSummaryText("This is Summary of a Big Picture");

        NotificationCompat.Builder notification = new NotificationCompat.Builder(this);
        notification.setColor(getResources().getColor(R.color.design_6));
        notification.setSmallIcon(R.drawable.ic_star_black_24dp);
        notification.setContentTitle("This is a picture notification");
        notification.setContentText("This is about a game RIME");
        notification.setStyle(bigPictureStyle);

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0, notification.build());
    }

    private void bigNotification() {


        NotificationCompat.Builder notification = new NotificationCompat.Builder(this);
        notification.setColor(getResources().getColor(R.color.design_5));

        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
        bigTextStyle.setBigContentTitle("This s big notification");
        bigTextStyle.setSummaryText("This is a big notification");
        bigTextStyle.bigText("oostFramework: mAcquireTouchFunc method = public int com.qualcomm.qti.Performance.perfLockAcquireTouch(android.view.MotionEvent,android.util.DisplayMetrics,int,int[])\n" +
                "08-29 03:03:38.644 22654-22654/? V/BoostFramework: mIOPStart method = public int com.qualcomm.qti.Performance.perfIOPrefetchStart(int,java.lang.String)\n" +
                "08-29 03:03:38.644 22654-22654/? V/BoostFramework: mIOPStop method = public int com.qualcomm.qti.Performance.perfIOPrefetchStop()\n" +
                "08-29 03:03:38.647 22654-22654/? V/BoostFramework: BoostFramework() : mPerf = com.qualcomm.qti.Performance@ad50b71\n" +
                "08-29 03:03:38.647 22654-22654/? V/BoostFramework: BoostFramework() : mPerf = com.qualcomm.qti.Performance@987d56\n" +
                "08-29 03:03:38.696 22654-22654/? V/BoostFramework: BoostFramework() : mPerf = com.qualcomm.qti.Performance@718b7a9\n" +
                "08-29 03:03:38.696 22654-22654/? V/BoostFramework: BoostFramework() : mPerf = com.qualcomm.qti.Performance@331e1");


        notification.setSmallIcon(R.drawable.ic_star_black_24dp);
        notification.setContentTitle("This is default title");
        notification.setContentText("This is cotent text");
        notification.setStyle(bigTextStyle);


        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0, notification.build());
    }

    private void simpleNotification() {

        NotificationCompat.Builder notification = new NotificationCompat.Builder(this);
        notification.setColor(this.getResources().getColor(R.color.design_4));
        notification.setContentText("This is a simple notification");
        notification.setContentTitle("This is Simple Title");
        notification.setSmallIcon(R.drawable.ic_star_black_24dp);

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0, notification.build());
    }
}
