package com.example.internship;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class VideoPlayerPage extends AppCompatActivity {

    VideoView videoView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player_page);

        videoView1 = findViewById(R.id.videoView);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView1);
        Uri uri= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.bestvideo);
        videoView1.setMediaController(mediaController);
        videoView1.setVideoURI(uri);
        videoView1.requestFocus();
        videoView1.start();
        videoView1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(VideoPlayerPage.this, "Thank You...", Toast.LENGTH_SHORT).show();
            }
        });

        videoView1.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            @Override
            public boolean onError(MediaPlayer mp, int what, int extra) {
                Toast.makeText(VideoPlayerPage.this, "Error Occure...", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

    }
}