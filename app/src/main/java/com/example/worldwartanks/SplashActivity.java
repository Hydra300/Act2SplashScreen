package com.example.worldwartanks;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        MediaPlayer appIntro;
        appIntro = MediaPlayer.create(SplashActivity.this,R.raw.intro);
        appIntro.start();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // This method will be executed once the timer is over
                Intent i = new Intent(SplashActivity.this, Main.class);
                startActivity(i);
                appIntro.stop();
                finish();
            }
        }, 5000);
    }
}