package com.jeff.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityNavigator extends AppCompatActivity {
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.navigator_layout);

    }

    public void onClick(View view){

        switch (view.getId()){
            case R.id.btnCalculator:
                intent = new Intent(getBaseContext(),CalculatorActivity.class);
                startActivity(intent);
                break;

            case R.id.btnSorting:
                intent = new Intent(this,SortingBenchmarkActivity.class);
                startActivity(intent);
                break;

            case R.id.btnToast:
                intent = new Intent(this,ToastActivity.class);
                startActivity(intent);
                break;

            case R.id.btnVibrator:
                intent = new Intent(this,VibratorActivity.class);
                startActivity(intent);
                break;

            case R.id.btnAnimation:
                intent = new Intent(this,AnimationActivity.class);
                startActivity(intent);
                break;

            case R.id.btnInstagram:
                intent = new Intent(this,InstagramActivity.class);
                startActivity(intent);
                break;

            case R.id.btnNotification:
                intent = new Intent(this,NotificationActivity.class);
                startActivity(intent);
                break;

            case R.id.btnWifi:
                intent = new Intent(this,WifiToggleActivity.class);
                startActivity(intent);
                break;

            case R.id.btnSound:
                intent = new Intent(this,SoundActivity.class);
                startActivity(intent);
                break;

            case R.id.btnVideo:
                intent = new Intent(this,VideoActivity.class);
                startActivity(intent);
                break;

            case R.id.btnA1:
                intent = new Intent(this,A1 .class);
                startActivity(intent);
                break;

            case R.id.btnRegister:
                intent = new Intent(this,Registration_Activity.class);
                startActivity(intent);
                break;

            case R.id.btnSensor:
                intent = new Intent(this,SensorListActivity.class);
                startActivity(intent);
                break;

            case R.id.btnSuperhero:
                intent = new Intent(this,SuperheroActivity.class);
                startActivity(intent);
                break;

            case R.id.btnMaps:
                intent = new Intent(this,MapsActivity.class);
                startActivity(intent);
                break;



        }
    }
}
