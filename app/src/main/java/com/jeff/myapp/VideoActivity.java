package com.jeff.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VideoActivity extends AppCompatActivity {
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_layout);
    }

    public void Video(View view){

        switch (view.getId()) {
            case R.id.btnVideoRaw:
                intent = new Intent(getBaseContext(), VideoRawActivity.class);
                startActivity(intent);
                break;

            case R.id.btnVideoUrl:
                intent = new Intent(this, VideoURLActivity.class);
                startActivity(intent);
                break;

           /* case R.id.btnVideoMedia:
                intent = new Intent(this, VideoMediaActivity.class);
                startActivity(intent);
                break;*/
        }
    }

}
