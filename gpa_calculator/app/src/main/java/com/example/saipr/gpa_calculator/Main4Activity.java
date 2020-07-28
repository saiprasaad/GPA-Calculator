package com.example.saipr.gpa_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    private TextView txtv;
    private TextView tvtxt1,tvtxt2,tvtxt3,tvtxt4,tvtxt5,tvtxt6,tvtxt7,tvtxt8;
    private EditText ettxt1,ettxt2,ettxt3,ettxt4,ettxt5,ettxt6,ettxt7,ettxt8,ets;
    private Button bt,bt1;
    Float f;
    int c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        txtv=(TextView)findViewById(R.id.tvcgpa);
        bt=(Button)findViewById(R.id.bts);
        ettxt1=(EditText)findViewById(R.id.t1);ettxt2=(EditText)findViewById(R.id.t2);ettxt3=(EditText)findViewById(R.id.t3);ettxt4=(EditText)findViewById(R.id.t4);ettxt5=(EditText)findViewById(R.id.t5);
        ettxt6=(EditText)findViewById(R.id.t6);ettxt7=(EditText)findViewById(R.id.t7);ettxt8=(EditText)findViewById(R.id.t8);tvtxt1=(TextView)findViewById(R.id.e1);tvtxt2=(TextView)findViewById(R.id.e2);
        tvtxt3=(TextView)findViewById(R.id.e3);tvtxt4=(TextView)findViewById(R.id.e4);tvtxt5=(TextView)findViewById(R.id.e5);tvtxt6=(TextView)findViewById(R.id.e6);tvtxt7=(TextView)findViewById(R.id.e7);
        tvtxt8=(TextView)findViewById(R.id.e8);ets=(EditText)findViewById(R.id.etsem);bt1=(Button)findViewById(R.id.btok);
        ettxt1.setVisibility(View.INVISIBLE);ettxt2.setVisibility(View.INVISIBLE);ettxt3.setVisibility(View.INVISIBLE);ettxt4.setVisibility(View.INVISIBLE);
        ettxt5.setVisibility(View.INVISIBLE);ettxt6.setVisibility(View.INVISIBLE);ettxt7.setVisibility(View.INVISIBLE);ettxt8.setVisibility(View.INVISIBLE);
        tvtxt1.setVisibility(View.INVISIBLE);tvtxt2.setVisibility(View.INVISIBLE);tvtxt3.setVisibility(View.INVISIBLE);tvtxt4.setVisibility(View.INVISIBLE);
        tvtxt5.setVisibility(View.INVISIBLE);tvtxt6.setVisibility(View.INVISIBLE);tvtxt7.setVisibility(View.INVISIBLE);tvtxt8.setVisibility(View.INVISIBLE);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(String.valueOf(ets.getText()).equals("1"))
                {
                    ettxt1.setVisibility(View.VISIBLE);tvtxt1.setVisibility(View.VISIBLE);ettxt2.setVisibility(View.INVISIBLE);tvtxt2.setVisibility(View.INVISIBLE);ettxt3.setVisibility(View.INVISIBLE);
                    tvtxt3.setVisibility(View.INVISIBLE);ettxt4.setVisibility(View.INVISIBLE);tvtxt4.setVisibility(View.INVISIBLE);ettxt5.setVisibility(View.INVISIBLE);tvtxt5.setVisibility(View.INVISIBLE);
                    ettxt6.setVisibility(View.INVISIBLE);tvtxt6.setVisibility(View.INVISIBLE);ettxt7.setVisibility(View.INVISIBLE);tvtxt7.setVisibility(View.INVISIBLE);ettxt8.setVisibility(View.INVISIBLE);
                    tvtxt8.setVisibility(View.INVISIBLE);
                    c=1;
                }
                else if(String.valueOf(ets.getText()).equals("2"))
                {
                    ettxt1.setVisibility(View.VISIBLE);tvtxt1.setVisibility(View.VISIBLE);ettxt2.setVisibility(View.VISIBLE);tvtxt2.setVisibility(View.VISIBLE);
                    ettxt3.setVisibility(View.INVISIBLE);ettxt4.setVisibility(View.INVISIBLE);ettxt5.setVisibility(View.INVISIBLE);ettxt6.setVisibility(View.INVISIBLE);
                    ettxt7.setVisibility(View.INVISIBLE);ettxt8.setVisibility(View.INVISIBLE);tvtxt3.setVisibility(View.INVISIBLE);tvtxt4.setVisibility(View.INVISIBLE);
                    tvtxt5.setVisibility(View.INVISIBLE);tvtxt6.setVisibility(View.INVISIBLE);tvtxt7.setVisibility(View.INVISIBLE);tvtxt8.setVisibility(View.INVISIBLE);
                    c=2;
                }
                else if(String.valueOf(ets.getText()).equals("3"))
                {
                    ettxt1.setVisibility(View.VISIBLE);tvtxt1.setVisibility(View.VISIBLE);ettxt2.setVisibility(View.VISIBLE);tvtxt2.setVisibility(View.VISIBLE);ettxt3.setVisibility(View.VISIBLE);
                    tvtxt3.setVisibility(View.VISIBLE);ettxt4.setVisibility(View.INVISIBLE);ettxt5.setVisibility(View.INVISIBLE);ettxt6.setVisibility(View.INVISIBLE);ettxt7.setVisibility(View.INVISIBLE);
                    ettxt8.setVisibility(View.INVISIBLE);tvtxt4.setVisibility(View.INVISIBLE);tvtxt5.setVisibility(View.INVISIBLE);tvtxt6.setVisibility(View.INVISIBLE);tvtxt7.setVisibility(View.INVISIBLE);
                    tvtxt8.setVisibility(View.INVISIBLE);
                    c=3;
                }
                else if(String.valueOf(ets.getText()).equals("4"))
                {
                    ettxt1.setVisibility(View.VISIBLE);tvtxt1.setVisibility(View.VISIBLE);ettxt2.setVisibility(View.VISIBLE);tvtxt2.setVisibility(View.VISIBLE);ettxt3.setVisibility(View.VISIBLE);tvtxt3.setVisibility(View.VISIBLE);
                    ettxt4.setVisibility(View.VISIBLE);tvtxt4.setVisibility(View.VISIBLE);ettxt5.setVisibility(View.INVISIBLE);ettxt6.setVisibility(View.INVISIBLE);
                    ettxt7.setVisibility(View.INVISIBLE);ettxt8.setVisibility(View.INVISIBLE);tvtxt5.setVisibility(View.INVISIBLE);
                    tvtxt6.setVisibility(View.INVISIBLE);tvtxt7.setVisibility(View.INVISIBLE);tvtxt8.setVisibility(View.INVISIBLE);
                    c=4;

                }
                else if(String.valueOf(ets.getText()).equals("5"))
                {
                    ettxt1.setVisibility(View.VISIBLE);tvtxt1.setVisibility(View.VISIBLE);ettxt2.setVisibility(View.VISIBLE);tvtxt2.setVisibility(View.VISIBLE);ettxt3.setVisibility(View.VISIBLE);
                    tvtxt3.setVisibility(View.VISIBLE);ettxt4.setVisibility(View.VISIBLE);tvtxt4.setVisibility(View.VISIBLE);ettxt5.setVisibility(View.VISIBLE);tvtxt5.setVisibility(View.VISIBLE);
                    ettxt6.setVisibility(View.INVISIBLE);ettxt7.setVisibility(View.INVISIBLE);ettxt8.setVisibility(View.INVISIBLE);tvtxt6.setVisibility(View.INVISIBLE);tvtxt7.setVisibility(View.INVISIBLE);tvtxt8.setVisibility(View.INVISIBLE);
                    c=5;
                }
                else if(String.valueOf(ets.getText()).equals("6"))
                {
                    ettxt1.setVisibility(View.VISIBLE);tvtxt1.setVisibility(View.VISIBLE);ettxt2.setVisibility(View.VISIBLE);tvtxt2.setVisibility(View.VISIBLE);
                    ettxt3.setVisibility(View.VISIBLE);tvtxt3.setVisibility(View.VISIBLE);ettxt4.setVisibility(View.VISIBLE);tvtxt4.setVisibility(View.VISIBLE);
                    ettxt5.setVisibility(View.VISIBLE);tvtxt5.setVisibility(View.VISIBLE);ettxt6.setVisibility(View.VISIBLE);tvtxt6.setVisibility(View.VISIBLE);
                    ettxt7.setVisibility(View.INVISIBLE);ettxt8.setVisibility(View.INVISIBLE);tvtxt7.setVisibility(View.INVISIBLE);tvtxt8.setVisibility(View.INVISIBLE);
                    c=6;
                }
                else if(String.valueOf(ets.getText()).equals("7"))
                {
                    ettxt1.setVisibility(View.VISIBLE);tvtxt1.setVisibility(View.VISIBLE);ettxt2.setVisibility(View.VISIBLE);tvtxt2.setVisibility(View.VISIBLE);
                    ettxt3.setVisibility(View.VISIBLE);tvtxt3.setVisibility(View.VISIBLE);ettxt4.setVisibility(View.VISIBLE);tvtxt4.setVisibility(View.VISIBLE);ettxt5.setVisibility(View.VISIBLE);
                    tvtxt5.setVisibility(View.VISIBLE);ettxt6.setVisibility(View.VISIBLE);tvtxt6.setVisibility(View.VISIBLE);ettxt7.setVisibility(View.VISIBLE);
                    tvtxt7.setVisibility(View.VISIBLE);ettxt8.setVisibility(View.INVISIBLE);tvtxt8.setVisibility(View.INVISIBLE);
                    c=7;
                }
                else if(String.valueOf(ets.getText()).equals("8"))
                {
                    ettxt1.setVisibility(View.VISIBLE);tvtxt1.setVisibility(View.VISIBLE);ettxt2.setVisibility(View.VISIBLE);tvtxt2.setVisibility(View.VISIBLE);ettxt3.setVisibility(View.VISIBLE);
                    tvtxt3.setVisibility(View.VISIBLE);ettxt4.setVisibility(View.VISIBLE);tvtxt4.setVisibility(View.VISIBLE);ettxt5.setVisibility(View.VISIBLE);tvtxt5.setVisibility(View.VISIBLE);
                    ettxt6.setVisibility(View.VISIBLE);tvtxt6.setVisibility(View.VISIBLE);ettxt7.setVisibility(View.VISIBLE);tvtxt7.setVisibility(View.VISIBLE);ettxt8.setVisibility(View.VISIBLE);
                    tvtxt8.setVisibility(View.VISIBLE);
                    c=8;
                }
                else
                {
                    Toast.makeText(Main4Activity.this,"Enter a valid sem number",Toast.LENGTH_SHORT).show();
                }
            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(String.valueOf(ets.getText()).equals("")){Toast.makeText(Main4Activity.this,"Enter the gpa to calculate cgpa",Toast.LENGTH_SHORT).show();}
                else {
                    if (c == 1) {
                        if(String.valueOf(ettxt1.getText()).equals("")){Toast.makeText(Main4Activity.this,"Enter the gpa",Toast.LENGTH_SHORT).show();}
                        else
                        txtv.setText("CGPA: " + Float.parseFloat(String.valueOf(ettxt1.getText())));
                    } else if (c == 2) {
                        if(String.valueOf(ettxt1.getText()).equals("")||String.valueOf(ettxt2.getText()).equals("")){Toast.makeText(Main4Activity.this,"Enter the gpa",Toast.LENGTH_SHORT).show();}
                        else{
                        f = ((Float.parseFloat(String.valueOf(ettxt1.getText())) * 25) + (Float.parseFloat(String.valueOf(ettxt2.getText())) * 24)) / 49;
                        txtv.setText("CGPA: " + f.toString());}
                    } else if (c == 3) {
                        if(String.valueOf(ettxt1.getText()).equals("")||String.valueOf(ettxt2.getText()).equals("")||String.valueOf(ettxt3.getText()).equals("")){Toast.makeText(Main4Activity.this,"Enter the gpa",Toast.LENGTH_SHORT).show();}
                        else{
                        f = ((Float.parseFloat(String.valueOf(ettxt1.getText())) * 25) + (Float.parseFloat(String.valueOf(ettxt2.getText())) * 24) + (Float.parseFloat(String.valueOf(ettxt3.getText())) * 24)) / 73;
                        txtv.setText("CGPA: " + f.toString());}
                    } else if (c == 4) {
                        if(String.valueOf(ettxt1.getText()).equals("")||String.valueOf(ettxt2.getText()).equals("")||String.valueOf(ettxt3.getText()).equals("")||String.valueOf(ettxt4.getText()).equals("")){Toast.makeText(Main4Activity.this,"Enter the gpa",Toast.LENGTH_SHORT).show();}
                        else{
                        f = ((Float.parseFloat(String.valueOf(ettxt1.getText())) * 25) + (Float.parseFloat(String.valueOf(ettxt2.getText())) * 24) + (Float.parseFloat(String.valueOf(ettxt3.getText())) * 24) + (Float.parseFloat(String.valueOf(ettxt4.getText())) * 24)) / 97;
                        txtv.setText("CGPA: " + f.toString());}
                    } else if (c == 5) {
                        if(String.valueOf(ettxt1.getText()).equals("")||String.valueOf(ettxt2.getText()).equals("")||String.valueOf(ettxt3.getText()).equals("")||String.valueOf(ettxt4.getText()).equals("")||String.valueOf(ettxt5.getText()).equals("")){Toast.makeText(Main4Activity.this,"Enter the gpa",Toast.LENGTH_SHORT).show();}
                        else{
                        f = ((Float.parseFloat(String.valueOf(ettxt1.getText())) * 25) + (Float.parseFloat(String.valueOf(ettxt2.getText())) * 24) + (Float.parseFloat(String.valueOf(ettxt3.getText())) * 24) + (Float.parseFloat(String.valueOf(ettxt4.getText())) * 24) + (Float.parseFloat(String.valueOf(ettxt5.getText())) * 25)) / 122;
                        txtv.setText("CGPA: " + f.toString());}
                    } else if (c == 6) {
                        if(String.valueOf(ettxt1.getText()).equals("")||String.valueOf(ettxt2.getText()).equals("")||String.valueOf(ettxt3.getText()).equals("")||String.valueOf(ettxt4.getText()).equals("")||String.valueOf(ettxt5.getText()).equals("")||String.valueOf(ettxt6.getText()).equals("")){Toast.makeText(Main4Activity.this,"Enter the gpa",Toast.LENGTH_SHORT).show();}
                        else{
                        f = ((Float.parseFloat(String.valueOf(ettxt1.getText())) * 25) + (Float.parseFloat(String.valueOf(ettxt2.getText())) * 24) + (Float.parseFloat(String.valueOf(ettxt3.getText())) * 24) + (Float.parseFloat(String.valueOf(ettxt4.getText())) * 24) + (Float.parseFloat(String.valueOf(ettxt5.getText())) * 25) + (Float.parseFloat(String.valueOf(ettxt6.getText())) * 24)) / 146;
                        txtv.setText("CGPA: " + f.toString());}
                    } else if (c == 7) {
                        if(String.valueOf(ettxt1.getText()).equals("")||String.valueOf(ettxt2.getText()).equals("")||String.valueOf(ettxt3.getText()).equals("")||String.valueOf(ettxt4.getText()).equals("")||String.valueOf(ettxt5.getText()).equals("")||String.valueOf(ettxt6.getText()).equals("")||String.valueOf(ettxt7.getText()).equals("")){Toast.makeText(Main4Activity.this,"Enter the gpa",Toast.LENGTH_SHORT).show();}
                        else{
                        f = ((Float.parseFloat(String.valueOf(ettxt1.getText())) * 25) + (Float.parseFloat(String.valueOf(ettxt2.getText())) * 24) + (Float.parseFloat(String.valueOf(ettxt3.getText())) * 24) + (Float.parseFloat(String.valueOf(ettxt4.getText())) * 24) + (Float.parseFloat(String.valueOf(ettxt5.getText())) * 25) + (Float.parseFloat(String.valueOf(ettxt6.getText())) * 24) + (Float.parseFloat(String.valueOf(ettxt7.getText())) * 22)) / 168;
                        txtv.setText("CGPA: " + f.toString());}
                    } else if (c == 8) {
                        if(String.valueOf(ettxt1.getText()).equals("")||String.valueOf(ettxt2.getText()).equals("")||String.valueOf(ettxt3.getText()).equals("")||String.valueOf(ettxt4.getText()).equals("")||String.valueOf(ettxt5.getText()).equals("")||String.valueOf(ettxt6.getText()).equals("")||String.valueOf(ettxt7.getText()).equals("")||String.valueOf(ettxt8.getText()).equals("")){Toast.makeText(Main4Activity.this,"Enter the gpa",Toast.LENGTH_SHORT).show();}
                        else{
                        f = ((Float.parseFloat(String.valueOf(ettxt1.getText())) * 25) + (Float.parseFloat(String.valueOf(ettxt2.getText())) * 24) + (Float.parseFloat(String.valueOf(ettxt3.getText())) * 24) + (Float.parseFloat(String.valueOf(ettxt4.getText())) * 24) + (Float.parseFloat(String.valueOf(ettxt5.getText())) * 25) + (Float.parseFloat(String.valueOf(ettxt6.getText())) * 24) + (Float.parseFloat(String.valueOf(ettxt7.getText())) * 22) + (Float.parseFloat(String.valueOf(ettxt8.getText())) * 16)) / 184;
                        txtv.setText("CGPA: " + f.toString());}
                    }
                    else
                    {
                        Toast.makeText(Main4Activity.this,"Enter the gpa to calculate cgpa",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
