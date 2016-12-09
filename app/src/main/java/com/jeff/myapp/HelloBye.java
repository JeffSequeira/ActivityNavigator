package com.jeff.myapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HelloBye extends AppCompatActivity {

    private TextView tV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hellobye_activity);
        tV=(TextView)findViewById(R.id.tvResult);
    }

    public void Button(View view){
        String message="Bye";
        tV.setText(message);
        tV.setTextColor(Color.BLUE);
    }
}
