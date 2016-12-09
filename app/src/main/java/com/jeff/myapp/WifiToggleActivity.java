package com.jeff.myapp;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class WifiToggleActivity extends AppCompatActivity {

    WifiManager wifiManager;
    ToggleButton tbtnWifi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wifitoggle_layout);
    }

    @Override
    protected void onStart(){
        super.onStart();

        wifiManager= (WifiManager) this.getSystemService(Context.WIFI_SERVICE);

        tbtnWifi = (ToggleButton) findViewById(R.id.tbtnWifi);
        tbtnWifi.setChecked(wifiManager.isWifiEnabled());
        tbtnWifi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,boolean isChecked){
                wifiManager.setWifiEnabled(isChecked);
            }
        });

    }
}
