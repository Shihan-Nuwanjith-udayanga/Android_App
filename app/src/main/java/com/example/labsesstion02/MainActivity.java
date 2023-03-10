package com.example.labsesstion02;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SuspiciousIndentation")
    public void playButton(View view) {
        if(mediaPlayer==null)
        mediaPlayer = MediaPlayer.create(this, R.raw.audio1);
        mediaPlayer.start();
    }

    public void pauseButton(View view) {
        mediaPlayer.pause();
    }

    public void stopButton(View view) {
        mediaPlayer.stop();
        mediaPlayer=null;
    }
}