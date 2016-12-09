package com.jeff.myapp;


import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class VideoRawActivity extends AppCompatActivity {

    private VideoView vvplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.videoraw_layout);
        vvplayer=(VideoView) findViewById(R.id.vvplayer);
        String path = "android.resource://"+ getPackageName()+ "/" + R.raw.abcdef;
        vvplayer.setVideoURI(Uri.parse(path));
        vvplayer.start();
    }



}

