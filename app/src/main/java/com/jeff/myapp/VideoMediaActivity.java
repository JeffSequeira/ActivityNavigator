package com.jeff.myapp;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoMediaActivity extends AppCompatActivity {

    VideoView vv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.videomedia_layout);

        Bundle bundle= getIntent().getExtras();
        String path= bundle.getString("video");

        vv=(VideoView)findViewById(R.id.videoView);
        MediaController mc=new MediaController(this);
        mc.setAnchorView(vv);

        Uri u=Uri.parse(path);
        vv.setVideoURI(u);
        vv.setMediaController(mc);
        vv.start();
    }
}
