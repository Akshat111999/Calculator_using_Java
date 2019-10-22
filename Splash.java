package com.example.quiz;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ActionBar r = getSupportActionBar();
        r.hide();
        Thread t = new Thread(){
            public  void run(){
                try{
                    sleep(3000);
                    }
                catch (Exception e){}
                finally {
                    Intent p = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(p);
                    finish();
                }
            }
        };
        t.start();
    }
}
