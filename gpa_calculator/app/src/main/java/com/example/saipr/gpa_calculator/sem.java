package com.example.saipr.gpa_calculator;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class sem extends AppCompatActivity {
private Button bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem);
        Window window=this.getWindow();
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        window.setStatusBarColor(this.getResources().getColor(R.color.red));
    }
        bb1=(Button)findViewById(R.id.b1);
        bb2=(Button)findViewById(R.id.b2);
        bb3=(Button)findViewById(R.id.b3);
        bb4=(Button)findViewById(R.id.b4);
        bb5=(Button)findViewById(R.id.b5);
        bb6=(Button)findViewById(R.id.b6);
        bb7=(Button)findViewById(R.id.b7);
        bb8=(Button)findViewById(R.id.b8);
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sem.this,MainActivity.class);
                intent.putExtra("KEY","sem1");
                startActivity(intent);
            }
        });
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sem.this,MainActivity.class);
                intent.putExtra("KEY","sem2");
                startActivity(intent);
            }
        });
        bb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sem.this,MainActivity.class);
                intent.putExtra("KEY","sem3");
                startActivity(intent);
            }
        });
        bb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sem.this,MainActivity.class);
                intent.putExtra("KEY","sem4");
                startActivity(intent);
            }
        });
        bb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(sem.this,"Will be updating soon...",Toast.LENGTH_SHORT).show();
            }
        });
        bb6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(sem.this,"Will be updating soon...",Toast.LENGTH_SHORT).show();
        }
        });
        bb7.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(sem.this,"Will be updating soon...",Toast.LENGTH_SHORT).show();
        }
        });
        bb8.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(sem.this,"Will be updating soon...",Toast.LENGTH_SHORT).show();
        }
        });
    }

}
