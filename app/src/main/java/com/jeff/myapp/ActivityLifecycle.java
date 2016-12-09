package com.jeff.myapp;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class ActivityLifecycle extends AppCompatActivity {

    private static final String TAG= ActivityLifecycle.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lifecycle_layout);
        Toast.makeText(getBaseContext(),"OnCreate",Toast.LENGTH_SHORT).show();
        Log.i(TAG,"This is OnCreate method");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(getBaseContext(),"Start",Toast.LENGTH_SHORT).show();
        Log.i(TAG,"This is OnStart Method");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(getBaseContext(),"Resume",Toast.LENGTH_SHORT).show();
        Log.i(TAG,"This is OnResume Method");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(getBaseContext(),"Pause",Toast.LENGTH_SHORT).show();
        Log.i(TAG,"This is OnPause Method");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(getBaseContext(),"Stop",Toast.LENGTH_SHORT).show();
        Log.i(TAG,"This is OnStop Method");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(getBaseContext(),"Destroy",Toast.LENGTH_SHORT).show();
        Log.i(TAG,"This is OnDestroy Method");
    }
}
