package com.jeff.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SmsActivity extends AppCompatActivity {

    Button send;
    EditText phoneno, message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sms_layout);
        send = (Button) findViewById(R.id.btnSend);
        phoneno = (EditText) findViewById(R.id.etphone);
        message = (EditText) findViewById(R.id.etMsg);
    }

    public void SendMessage(View view) {
        String Phone = phoneno.getText().toString();
        String Msg = message.getText().toString();


        try {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(Phone, null, Msg, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {

        }
    }
}