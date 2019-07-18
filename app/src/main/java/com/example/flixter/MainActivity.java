package com.example.flixter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    Handler h;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Handler
        h = new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                i = new Intent(MainActivity.this, MovieActivity.class);
                startActivity(i);
            }
        }, 5000);
    }
}
