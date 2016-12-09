package com.jeff.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class AnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation_layout);
    }

    public void Animation(View view) {

        ImageView image = (ImageView) findViewById(R.id.ivLogo);

        switch (view.getId()) {

            case R.id.btnZoom:
            Animation zoom = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
            image.startAnimation(zoom);
                break;

            case R.id.btnClockwise:
                Animation clockwise = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
                image.startAnimation(clockwise);
                break;


            case R.id.btnFade:
            Animation Fade = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            image.startAnimation(Fade);
                break;


            case R.id.btnBlink:
            Animation blink = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
            image.startAnimation(blink);
                break;


            case R.id.btnSlideLeft:
            Animation slideleft = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slideleft);
            image.startAnimation(slideleft);
                break;


            case R.id.btnSlideRight:
            Animation slideright = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slideright);
            image.startAnimation(slideright);
    }
}
}
