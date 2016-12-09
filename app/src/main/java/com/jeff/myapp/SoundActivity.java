package com.jeff.myapp;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;

public class SoundActivity extends AppCompatActivity {

    private MediaPlayer rawAudioPlayer;
    private MediaPlayer URLAudioPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sound_layout);
        URLAudioPlayer=new MediaPlayer();


    }

    public void Raw(View view){
        rawAudioPlayer=MediaPlayer.create(getBaseContext(),R.raw.teri);
        rawAudioPlayer.start();
    }

    public void Url(View view) {
        URLAudioPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        String url = "http://programmerguru.com/android-tutorial/wp-content/uploads/2013/04/hosannatelugu.mp3";
        try {
            URLAudioPlayer.setDataSource(url);
            URLAudioPlayer.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
            URLAudioPlayer.start();
    }

    public void MusicPlayer(View view){
        Intent intent;
        intent = new Intent(this,MusicListActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        rawAudioPlayer.stop();
        URLAudioPlayer.stop();
        super.onDestroy();

    }
}
