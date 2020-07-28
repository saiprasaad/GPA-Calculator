package com.example.saipr.gpa_calculator;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    private TextView sub1tv,sub2tv,sub3tv,sub4tv,sub5tv,sub6tv;
    private EditText sub1et,sub2et,sub3et,sub4et,sub5et,sub6et;
    private Button button;
    float sub1,sub2,sub3,sub4,sub5,sub6,sum;
    DatabaseReference rootRef, demoRef;
    TextView demoValue;
    String s1,s2,s3,s4,s5,s6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Window window=this.getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.setStatusBarColor(this.getResources().getColor(R.color.brown));
        }
        String value=getIntent().getExtras().getString("KEY");
        sub1et=(EditText)findViewById(R.id.etsub1);
        sub2et=(EditText)findViewById(R.id.etsub2);
        sub3et=(EditText)findViewById(R.id.etsub3);
        sub4et=(EditText)findViewById(R.id.etsub4);
        sub5et=(EditText)findViewById(R.id.etsub5);
        sub6et=(EditText)findViewById(R.id.etsub6);
        sub1tv=(TextView)findViewById(R.id.e1);
        sub2tv=(TextView)findViewById(R.id.tvsub2);
        sub3tv=(TextView)findViewById(R.id.tvsub3);
        sub4tv=(TextView)findViewById(R.id.tvsub4);
        sub5tv=(TextView)findViewById(R.id.tvsub5);
        sub6tv=(TextView)findViewById(R.id.tvsub6);
        button=(Button)findViewById(R.id.bt);
        rootRef = FirebaseDatabase.getInstance().getReference();
        if(value.equals("sem3")) {
            sub6et.setVisibility(View.INVISIBLE);
            sub1tv.setText("MATHS");
            sub2tv.setText("DPSD");
            sub3tv.setText("DS");
            sub4tv.setText("OOPS");
            sub5tv.setText("CE");
            demoRef = rootRef.child("sem3");
//            demoRef.child("maths").setValue("4");
//            demoRef.child("oops").setValue("3");
//            demoRef.child("dpsd").setValue("4");
//            demoRef.child("ds").setValue("3");
//            demoRef.child("ce").setValue("3");
            demoRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    s1 = dataSnapshot.child("maths").getValue(String.class);
                    s2 = dataSnapshot.child("dpsd").getValue(String.class);
                    s3 = dataSnapshot.child("ds").getValue(String.class);
                    s4 = dataSnapshot.child("oops").getValue(String.class);
                    s5 = dataSnapshot.child("ce").getValue(String.class);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Pattern ps = Pattern.compile("^[0-9]*$");
                            Matcher ms1 = ps.matcher(sub1et.getText().toString());
                            Matcher ms2 = ps.matcher(sub2et.getText().toString());
                            Matcher ms3 = ps.matcher(sub3et.getText().toString());
                            Matcher ms4 = ps.matcher(sub4et.getText().toString());
                            Matcher ms5 = ps.matcher(sub5et.getText().toString());
                            boolean bs = ((ms1.matches()) && (ms2.matches()) && (ms3.matches()) && (ms4.matches()) && (ms5.matches()));
                            if (String.valueOf(sub1et.getText().toString()).matches("") || String.valueOf(sub2et.getText().toString()).matches("") || String.valueOf(sub3et.getText().toString()).matches("") || String.valueOf(sub4et.getText().toString()).matches("") || String.valueOf(sub5et.getText().toString()).matches("")){
                                Toast.makeText(MainActivity.this, "Enter grade of all subjects", Toast.LENGTH_SHORT).show();
                            } else {
                                if (bs == true) {
                                    sub1 = Float.parseFloat(String.valueOf(sub1et.getText())) * Float.parseFloat(String.valueOf(s1));
                                    sub2 = Float.parseFloat(String.valueOf(sub2et.getText())) * Float.parseFloat(String.valueOf(s2));
                                    sub3 = Float.parseFloat(String.valueOf(sub3et.getText())) * Float.parseFloat(String.valueOf(s3));
                                    sub4 = Float.parseFloat(String.valueOf(sub4et.getText())) * Float.parseFloat(String.valueOf(s4));
                                    sub5 = Float.parseFloat(String.valueOf(sub5et.getText())) * Float.parseFloat(String.valueOf(s5));
                                    sum = sub1 + sub2 + sub3 + sub4 + sub5;
                                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                                    intent.putExtra("KEY", "sem3");
                                    intent.putExtra("key", String.valueOf(sum));
                                    startActivity(intent);
                                } else {
                                    Toast.makeText(MainActivity.this, "Enter grade in numbers", Toast.LENGTH_SHORT).show();
                                }
                            }
                        }
                    });
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });
        }
        else if(value.equals("sem4"))
        {
            sub1tv.setText("MATHS");
            sub2tv.setText("CA");
            sub3tv.setText("DBMS");
            sub4tv.setText("DAA");
            sub5tv.setText("OS");
            sub6tv.setText("SE");
            demoRef = rootRef.child("sem4");
//            demoRef.child("maths").setValue("4");
//            demoRef.child("ca").setValue("3");
//            demoRef.child("dbms").setValue("3");
//            demoRef.child("daa").setValue("3");
//            demoRef.child("os").setValue("3");
//            demoRef.child("se").setValue("3");
            demoRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    s1 = dataSnapshot.child("maths").getValue(String.class);
                    s2 = dataSnapshot.child("ca").getValue(String.class);
                    s3 = dataSnapshot.child("dbms").getValue(String.class);
                    s4 = dataSnapshot.child("daa").getValue(String.class);
                    s5 = dataSnapshot.child("os").getValue(String.class);
                    s6=  dataSnapshot.child("se").getValue(String.class);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Pattern ps = Pattern.compile("^[0-9]*$");
                            Matcher ms1 = ps.matcher(sub1et.getText().toString());Matcher ms2 = ps.matcher(sub2et.getText().toString());Matcher ms3 = ps.matcher(sub3et.getText().toString());Matcher ms4 = ps.matcher(sub4et.getText().toString());Matcher ms5 = ps.matcher(sub5et.getText().toString());Matcher ms6 = ps.matcher(sub6et.getText().toString());
                            boolean bs = ((ms1.matches()) && (ms2.matches()) && (ms3.matches()) && (ms4.matches()) && (ms5.matches()) && (ms6.matches()));
                            if(String.valueOf(sub1et.getText().toString()).matches("")||String.valueOf(sub2et.getText().toString()).matches("")||String.valueOf(sub3et.getText().toString()).matches("")||String.valueOf(sub4et.getText().toString()).matches("")||String.valueOf(sub5et.getText().toString()).matches("")||String.valueOf(sub6et.getText().toString()).matches(""))
                            {
                                Toast.makeText(MainActivity.this, "Enter grade of all subjects", Toast.LENGTH_SHORT).show();
                            }
                            else {
                                if (bs == true) {
                                    sub1 = Float.parseFloat(String.valueOf(sub1et.getText())) * Float.parseFloat(String.valueOf(s1));
                                    sub2 = Float.parseFloat(String.valueOf(sub2et.getText())) * Float.parseFloat(String.valueOf(s2));
                                    sub3 = Float.parseFloat(String.valueOf(sub3et.getText())) * Float.parseFloat(String.valueOf(s3));
                                    sub4 = Float.parseFloat(String.valueOf(sub4et.getText())) * Float.parseFloat(String.valueOf(s4));
                                    sub5 = Float.parseFloat(String.valueOf(sub5et.getText())) * Float.parseFloat(String.valueOf(s5));
                                    sub6 = Float.parseFloat(String.valueOf(sub6et.getText())) * Float.parseFloat(String.valueOf(s6));
                                    sum = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
                                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                                    intent.putExtra("KEY", "sem4");
                                    intent.putExtra("key", String.valueOf(sum));
                                    startActivity(intent);
                                } else {
                                    Toast.makeText(MainActivity.this, "Enter grade in numbers", Toast.LENGTH_SHORT).show();
                                }
                            }
                        }
                    });
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });
        }

        else if(value.equals("sem1"))
        {
            sub1tv.setText("MATHS");
            sub2tv.setText("ENGLISH");
            sub3tv.setText("EG");
            sub4tv.setText("PYTHON");
            sub5tv.setText("CHEMISTRY");
            sub6tv.setText("PHYSICS");
            demoRef = rootRef.child("sem1");
//            demoRef.child("maths").setValue("4");
//            demoRef.child("english").setValue("4");
//            demoRef.child("eg").setValue("4");
//            demoRef.child("python").setValue("3");
//            demoRef.child("chemistry").setValue("3");
//            demoRef.child("physics").setValue("3");
            demoRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    s1 = dataSnapshot.child("maths").getValue(String.class);
                    s2 = dataSnapshot.child("english").getValue(String.class);
                    s3 = dataSnapshot.child("eg").getValue(String.class);
                    s4 = dataSnapshot.child("python").getValue(String.class);
                    s5 = dataSnapshot.child("chemistry").getValue(String.class);
                    s6=  dataSnapshot.child("physics").getValue(String.class);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Pattern ps = Pattern.compile("^[0-9]*$");
                            Matcher ms1 = ps.matcher(sub1et.getText().toString());
                            Matcher ms2 = ps.matcher(sub2et.getText().toString());
                            Matcher ms3 = ps.matcher(sub3et.getText().toString());
                            Matcher ms4 = ps.matcher(sub4et.getText().toString());
                            Matcher ms5 = ps.matcher(sub5et.getText().toString());
                            Matcher ms6 = ps.matcher(sub6et.getText().toString());
                            boolean bs = ((ms1.matches()) && (ms2.matches()) && (ms3.matches()) && (ms4.matches()) && (ms5.matches())&&(ms6.matches()));
                            if(String.valueOf(sub1et.getText().toString()).matches("")||String.valueOf(sub2et.getText().toString()).matches("")||String.valueOf(sub3et.getText().toString()).matches("")||String.valueOf(sub4et.getText().toString()).matches("")||String.valueOf(sub5et.getText().toString()).matches("")||String.valueOf(sub6et.getText().toString()).matches(""))
                            {
                                Toast.makeText(MainActivity.this, "Enter grade of all subjects", Toast.LENGTH_SHORT).show();
                            }
                            else {
                                if (bs == true) {
                                    sub1 = Float.parseFloat(String.valueOf(sub1et.getText())) * Float.parseFloat(String.valueOf(s1));
                                    sub2 = Float.parseFloat(String.valueOf(sub2et.getText())) * Float.parseFloat(String.valueOf(s2));
                                    sub3 = Float.parseFloat(String.valueOf(sub3et.getText())) * Float.parseFloat(String.valueOf(s3));
                                    sub4 = Float.parseFloat(String.valueOf(sub4et.getText())) * Float.parseFloat(String.valueOf(s4));
                                    sub5 = Float.parseFloat(String.valueOf(sub5et.getText())) * Float.parseFloat(String.valueOf(s5));
                                    sub6 = Float.parseFloat(String.valueOf(sub6et.getText())) * Float.parseFloat(String.valueOf(s6));
                                    sum = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
                                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                                    intent.putExtra("KEY", "sem1");
                                    intent.putExtra("key", String.valueOf(sum));
                                    startActivity(intent);
                                } else {
                                    Toast.makeText(MainActivity.this, "Enter grade in numbers", Toast.LENGTH_SHORT).show();
                                }
                            }
                        }
                    });
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });
        }
        else if(value.equals("sem2"))
        {
            sub1tv.setText("MATHS");
            sub2tv.setText("ENGLISH");
            sub3tv.setText("EVS");
            sub4tv.setText("BEEE");
            sub5tv.setText("C");
            sub6tv.setText("PHYSICS");
            demoRef = rootRef.child("sem2");
//            demoRef.child("maths").setValue("4");
//            demoRef.child("english").setValue("4");
//            demoRef.child("evs").setValue("3");
//            demoRef.child("beee").setValue("3");
//            demoRef.child("c").setValue("3");
//            demoRef.child("physics").setValue("3");
            demoRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    s1 = dataSnapshot.child("maths").getValue(String.class);
                    s2 = dataSnapshot.child("english").getValue(String.class);
                    s3 = dataSnapshot.child("evs").getValue(String.class);
                    s4 = dataSnapshot.child("beee").getValue(String.class);
                    s5 = dataSnapshot.child("c").getValue(String.class);
                    s6=  dataSnapshot.child("physics").getValue(String.class);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Pattern ps = Pattern.compile("^[0-9]*$");
                            Matcher ms1 = ps.matcher(sub1et.getText().toString());
                            Matcher ms2 = ps.matcher(sub2et.getText().toString());
                            Matcher ms3 = ps.matcher(sub3et.getText().toString());
                            Matcher ms4 = ps.matcher(sub4et.getText().toString());
                            Matcher ms5 = ps.matcher(sub5et.getText().toString());
                            Matcher ms6 = ps.matcher(sub6et.getText().toString());
                            boolean bs = ((ms1.matches()) && (ms2.matches()) && (ms3.matches()) && (ms4.matches()) && (ms5.matches()) && (ms6.matches()));
                                if(String.valueOf(sub1et.getText().toString()).matches("")||String.valueOf(sub2et.getText().toString()).matches("")||String.valueOf(sub3et.getText().toString()).matches("")||String.valueOf(sub4et.getText().toString()).matches("")||String.valueOf(sub5et.getText().toString()).matches("")||String.valueOf(sub6et.getText().toString()).matches(""))
                                    {
                                        Toast.makeText(MainActivity.this, "Enter grade of all subjects", Toast.LENGTH_SHORT).show();
                                    }
                                   else
                                    {
                                        if (bs == true) {
                                            sub1 = Float.parseFloat(String.valueOf(sub1et.getText())) * Float.parseFloat(String.valueOf(s1));
                                            sub2 = Float.parseFloat(String.valueOf(sub2et.getText())) * Float.parseFloat(String.valueOf(s2));
                                            sub3 = Float.parseFloat(String.valueOf(sub3et.getText())) * Float.parseFloat(String.valueOf(s3));
                                            sub4 = Float.parseFloat(String.valueOf(sub4et.getText())) * Float.parseFloat(String.valueOf(s4));
                                            sub5 = Float.parseFloat(String.valueOf(sub5et.getText())) * Float.parseFloat(String.valueOf(s5));
                                            sub6 = Float.parseFloat(String.valueOf(sub6et.getText())) * Float.parseFloat(String.valueOf(s6));
                                            sum = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
                                            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                                            intent.putExtra("KEY", "sem2");
                                            intent.putExtra("key", String.valueOf(sum));
                                            startActivity(intent);
                                        } else {
                                            Toast.makeText(MainActivity.this, "Enter grade in numbers", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                        }
                    });
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });
        }
        }
    }