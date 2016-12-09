package com.jeff.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class ToastActivity extends AppCompatActivity {
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toast_activity);
    }

    public void Toast(View view) {
        switch (view.getId()) {
            case R.id.btnTL:
                toast = Toast.makeText(getBaseContext(), "Top Left", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP | Gravity.LEFT, 10, 150);
                toast.show();
                break;

            case R.id.btnTC:
                toast = Toast.makeText(getBaseContext(), "Top Center", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP | Gravity.CENTER, 10, 150);
                toast.show();
                break;

            case R.id.btnTR:
                toast = Toast.makeText(getBaseContext(), "Top Right", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP | Gravity.RIGHT, 10, 150);
                toast.show();
                break;


            case R.id.btnCL:
                toast = Toast.makeText(getBaseContext(), "Center Left", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER | Gravity.LEFT, 50, 150);
                toast.show();
                break;

            case R.id.btnCC:
                toast = Toast.makeText(getBaseContext(), "Center Center", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER | Gravity.CENTER, 50, 150);
                toast.show();
                break;

            case R.id.btnCR:
                toast = Toast.makeText(getBaseContext(), "Center Right", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER | Gravity.RIGHT, 50, 150);
                toast.show();
                break;

            case R.id.btnBL:
                toast = Toast.makeText(getBaseContext(), "Bottom Left", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM | Gravity.LEFT, 50, 150);
                toast.show();
                break;

            case R.id.btnBC:
                toast = Toast.makeText(getBaseContext(), "Bottom Center", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 50, 150);
                toast.show();
                break;

            case R.id.btnBR:
                toast = Toast.makeText(getBaseContext(), "Bottom Right", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM | Gravity.RIGHT, 50, 150);
                toast.show();
                break;

        }
    }
}