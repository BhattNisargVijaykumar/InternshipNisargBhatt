package com.example.internship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MediaPlayerPage extends AppCompatActivity implements View.OnClickListener {

    Button startmusic,pausemusic,stopmusic,btnnext;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player_page);

        startmusic = findViewById(R.id.startmusic);
        pausemusic = findViewById(R.id.pausemusic);
        stopmusic = findViewById(R.id.stopmusic);

        btnnext = findViewById(R.id.nextact);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaPlayerPage.this, VideoPlayerPage.class);
                startActivity(intent);
            }
        });

        mediaPlayer = MediaPlayer.create(MediaPlayerPage.this, R.raw.bestsong);
        startmusic.setOnClickListener(this);
        pausemusic.setOnClickListener(this);
        stopmusic.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.startmusic:
                mediaPlayer.start();
                break;
            case R.id.pausemusic:
                mediaPlayer.pause();
                break;
            case R.id.stopmusic:
                mediaPlayer.stop();
                break;
        }

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}