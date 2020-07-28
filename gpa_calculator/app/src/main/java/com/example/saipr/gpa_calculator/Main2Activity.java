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

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2Activity extends AppCompatActivity {
Float sum;
private Button button;
private EditText lab1et,lab2et,lab3et,lab4et;
private TextView lab1tv,lab2tv,lab3tv,lab4tv;
//private TextView txt;
Float lab1,lab2,lab3,lab4,sum1;
String l1,l2,l3,l4;
DatabaseReference databaseReference1,databaseReference2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Window window=this.getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.setStatusBarColor(this.getResources().getColor(R.color.brown));
        }
        lab1et=(EditText)findViewById(R.id.t1);
        lab2et=(EditText)findViewById(R.id.t2);
        lab3et=(EditText)findViewById(R.id.t3);
        lab4et=(EditText)findViewById(R.id.etlab4);
        lab1tv=(TextView)findViewById(R.id.e1);
        lab2tv=(TextView)findViewById(R.id.e2);
        lab3tv=(TextView)findViewById(R.id.e3);
        lab4tv=(TextView)findViewById(R.id.tvlab4);
        button=(Button)findViewById(R.id.bts);
//        txt=(TextView)findViewById(R.id.textView);
        String value=getIntent().getExtras().getString("KEY");
        String tot=getIntent().getExtras().getString("key");
        sum=Float.parseFloat(tot);
        databaseReference1=FirebaseDatabase.getInstance().getReference();
        if(value.equals("sem3")) {
            lab1tv.setText("DS LAB");
            lab2tv.setText("OOPS LAB");
            lab3tv.setText("DPSA LAB");
            lab4tv.setText("ENGLISH LAB");
            databaseReference2 = databaseReference1.child("sem3");
//            databaseReference2.child("oopslab").setValue("2");
//            databaseReference2.child("dslab").setValue("2");
//            databaseReference2.child("dpsdlab").setValue("2");
//            databaseReference2.child("englishlab").setValue("1");
            databaseReference2.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    l1 = dataSnapshot.child("dslab").getValue(String.class);
                    l2 = dataSnapshot.child("oopslab").getValue(String.class);
                    l3 = dataSnapshot.child("dpsdlab").getValue(String.class);
                    l4 = dataSnapshot.child("englishlab").getValue(String.class);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Pattern ps = Pattern.compile("^[0-9]*$");
                            Matcher ms1 = ps.matcher(lab1et.getText().toString());
                            Matcher ms2 = ps.matcher(lab2et.getText().toString());
                            Matcher ms3 = ps.matcher(lab3et.getText().toString());
                            Matcher ms4 = ps.matcher(lab4et.getText().toString());
                            boolean bs = ((ms1.matches()) && (ms2.matches()) && (ms3.matches()) && (ms4.matches()));
                            if (String.valueOf(lab1et.getText().toString()).matches("") || String.valueOf(lab2et.getText().toString()).matches("") || String.valueOf(lab3et.getText().toString()).matches("") || String.valueOf(lab4et.getText().toString()).matches("")) {
                                Toast.makeText(Main2Activity.this, "Enter grade of all subjects", Toast.LENGTH_SHORT).show();
                            }
                            else {
                                if (bs == true) {
                                    lab1 = Float.parseFloat(String.valueOf(lab1et.getText())) * Float.parseFloat(String.valueOf(l1));
                                    lab2 = Float.parseFloat(String.valueOf(lab2et.getText())) * Float.parseFloat(String.valueOf(l2));
                                    lab3 = Float.parseFloat(String.valueOf(lab3et.getText())) * Float.parseFloat(String.valueOf(l3));
                                    lab4 = Float.parseFloat(String.valueOf(lab4et.getText())) * Float.parseFloat(String.valueOf(l4));
                                    sum1 = lab1 + lab2 + lab3 + lab4;
                                    sum = sum + sum1;
                                    sum = sum / 24;
                                    Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                                    intent.putExtra("KEY1", String.valueOf(sum));
                                    startActivity(intent);
//                        txt.setText(String.valueOf(sum1));
                                }
                                else {
                                    Toast.makeText(Main2Activity.this, "Enter grade in numbers", Toast.LENGTH_SHORT).show();
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
            lab4et.setVisibility(View.INVISIBLE);
            lab1tv.setText("DBMS LAB");
            lab2tv.setText("OS LAB");
            lab3tv.setText("ENGLISH LAB");
            databaseReference2 = databaseReference1.child("sem4");
//            databaseReference2.child("dbmslab").setValue("2");
//            databaseReference2.child("oslab").setValue("2");
//            databaseReference2.child("englishlab").setValue("1");
            databaseReference2.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    l1 = dataSnapshot.child("dbmslab").getValue(String.class);
                    l2 = dataSnapshot.child("oslab").getValue(String.class);
                    l3 = dataSnapshot.child("englishlab").getValue(String.class);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Pattern ps = Pattern.compile("^[0-9]*$");
                            Matcher ms1 = ps.matcher(lab1et.getText().toString());
                            Matcher ms2 = ps.matcher(lab2et.getText().toString());
                            Matcher ms3 = ps.matcher(lab3et.getText().toString());
                            boolean bs = ((ms1.matches()) && (ms2.matches()) && (ms3.matches()));
                            if (String.valueOf(lab1et.getText().toString()).matches("") || String.valueOf(lab2et.getText().toString()).matches("") || String.valueOf(lab3et.getText().toString()).matches("")) {
                                Toast.makeText(Main2Activity.this, "Enter grade of all subjects", Toast.LENGTH_SHORT).show();
                            } else {
                                if (bs == true) {
                                    lab1 = Float.parseFloat(String.valueOf(lab1et.getText())) * Float.parseFloat(String.valueOf(l1));
                                    lab2 = Float.parseFloat(String.valueOf(lab2et.getText())) * Float.parseFloat(String.valueOf(l2));
                                    lab3 = Float.parseFloat(String.valueOf(lab3et.getText())) * Float.parseFloat(String.valueOf(l3));
                                    sum1 = lab1 + lab2 + lab3;
                                    sum = sum + sum1;
                                    sum = sum / 24;
                                    Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                                    intent.putExtra("KEY1", String.valueOf(sum));
                                    startActivity(intent);
//                        txt.setText(String.valueOf(sum1));
                                } else {
                                    Toast.makeText(Main2Activity.this, "Enter grade in numbers", Toast.LENGTH_SHORT).show();
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
            lab4et.setVisibility(View.INVISIBLE);
            lab3et.setVisibility(View.INVISIBLE);
            lab1tv.setText("PYTHON LAB");
            lab2tv.setText("PHYSICS AND CHEMISTRY LAB");
            databaseReference2 = databaseReference1.child("sem1");
//            databaseReference2.child("phychemlab").setValue("2");
//            databaseReference2.child("pythonlab").setValue("2");
            databaseReference2.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    l1 = dataSnapshot.child("pythonlab").getValue(String.class);
                    l2 = dataSnapshot.child("phychemlab").getValue(String.class);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Pattern ps = Pattern.compile("^[0-9]*$");
                            Matcher ms1 = ps.matcher(lab1et.getText().toString());
                            Matcher ms2 = ps.matcher(lab2et.getText().toString());
                            boolean bs = ((ms1.matches()) && (ms2.matches()));
                            if (String.valueOf(lab1et.getText().toString()).matches("") || String.valueOf(lab2et.getText().toString()).matches("")) {
                                Toast.makeText(Main2Activity.this, "Enter grade of all subjects", Toast.LENGTH_SHORT).show();
                            } else {
                                if (bs == true) {
                                    lab1 = Float.parseFloat(String.valueOf(lab1et.getText())) * Float.parseFloat(String.valueOf(l1));
                                    lab2 = Float.parseFloat(String.valueOf(lab2et.getText())) * Float.parseFloat(String.valueOf(l2));
                                    sum1 = lab1 + lab2;
                                    sum = sum + sum1;
                                    sum = sum / 25;
                                    Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                                    intent.putExtra("KEY1", String.valueOf(sum));
                                    startActivity(intent);
//                        txt.setText(String.valueOf(sum1));
                                } else {
                                    Toast.makeText(Main2Activity.this, "Enter grade in numbers", Toast.LENGTH_SHORT).show();
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
            lab4et.setVisibility(View.INVISIBLE);
            lab3et.setVisibility(View.INVISIBLE);
            lab1tv.setText("ENGINEERING PRACTICES LAB");
            lab2tv.setText("C LAB");
            databaseReference2 = databaseReference1.child("sem2");
//            databaseReference2.child("elab").setValue("2");
//            databaseReference2.child("clab").setValue("2");
            databaseReference2.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    l1 = dataSnapshot.child("elab").getValue(String.class);
                    l2 = dataSnapshot.child("clab").getValue(String.class);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Pattern ps = Pattern.compile("^[0-9]*$");
                            Matcher ms1 = ps.matcher(lab1et.getText().toString());
                            Matcher ms2 = ps.matcher(lab2et.getText().toString());
                            boolean bs = ((ms1.matches()) && (ms2.matches()));
                            if (String.valueOf(lab1et.getText().toString()).matches("") || String.valueOf(lab2et.getText().toString()).matches("")) {
                                Toast.makeText(Main2Activity.this, "Enter grade of all subjects", Toast.LENGTH_SHORT).show();
                            } else {
                                if (bs == true) {
                                    lab1 = Float.parseFloat(String.valueOf(lab1et.getText())) * Float.parseFloat(String.valueOf(l1));
                                    lab2 = Float.parseFloat(String.valueOf(lab2et.getText())) * Float.parseFloat(String.valueOf(l2));
                                    sum1 = lab1 + lab2;
                                    sum = sum + sum1;
                                    sum = sum / 24;
                                    Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                                    intent.putExtra("KEY1", String.valueOf(sum));
                                    startActivity(intent);
//                        txt.setText(String.valueOf(sum1));
                                } else {
                                    Toast.makeText(Main2Activity.this, "Enter grade in numbers", Toast.LENGTH_SHORT).show();
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
