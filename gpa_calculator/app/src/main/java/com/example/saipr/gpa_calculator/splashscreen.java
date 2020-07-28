package com.example.saipr.gpa_calculator;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.TextView;

public class splashscreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT =2000;
    private TextView textView1,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        Window window=this.getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.setStatusBarColor(this.getResources().getColor(R.color.red));
        }
        textView1=(TextView)findViewById(R.id.text);
        textView1.setTextColor(Color.WHITE);
        textView2=(TextView)findViewById(R.id.textView3);
        textView2.setTextColor(Color.WHITE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splashscreen.this, sem.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }

}
