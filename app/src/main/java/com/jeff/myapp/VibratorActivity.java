package com.jeff.myapp;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VibratorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vibrator_layout);
    }


    public void Vibrate(View view) {
        Vibrator vibrator;
    switch (view.getId()){
        case R.id.btnSun:
            vibrator= (Vibrator) getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(1000);
            break;

        case R.id.btnMoon:
            vibrator= (Vibrator) getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(700);
            break;

        case R.id.btnStar:
            vibrator= (Vibrator) getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(200);
            break;
    }

    }
}
