package com.jeff.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class A2 extends AppCompatActivity {

    EditText etUserName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2);
        etUserName = (EditText)findViewById(R.id.etUserName);
    }

    public void submit(View view){

        String name = etUserName.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("username",name);
        //setIntent(intent);
        setResult(RESULT_OK, intent);

        finish();
    }
}

