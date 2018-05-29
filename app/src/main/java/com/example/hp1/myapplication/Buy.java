package com.example.hp1.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Buy extends AppCompatActivity implements View.OnClickListener {
    Button checkout;
    String[] str1={"GeForce® GTX 1050 D5 2G(rev1.0/rev1.1) ","ASUS GeForce GTX 1060 3GB Dual-Fan OC Edition Graphics Card (DUAL-GTX1060-O3G)","ASUS GeForce GTX 1080 8GB Turbo Graphic Card TURBO-GTX1080-8G"};
    String[] str2={"item 1","item 2","item 3"};
    String[] str3={"item 1","item 2","item 3"};
    String[] str4 ={"item 1","item 2","item 3"};
    String[] str5={"item 1","item 2","item 3"};
    String[] str6={"item 1","item 2","item 3"};
    String[] str7={"item 1","item 2","item 3"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        checkout = (Button) findViewById(R.id.bt3);



        Spinner s1=(Spinner)findViewById(R.id.gpu1);
        Spinner s2=(Spinner)findViewById(R.id.mem1);
        Spinner s3=(Spinner)findViewById(R.id.cpu1);
        Spinner s4=(Spinner)findViewById(R.id.mother1);
        Spinner s5=(Spinner)findViewById(R.id.fan1);
        Spinner s6=(Spinner)findViewById(R.id.opt1);
        Spinner s7=(Spinner)findViewById(R.id.power1);

        ArrayAdapter<String> adapterS1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,str1);
        s1.setAdapter(adapterS1);
        ArrayAdapter<String> adapterS2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,str2);
        s2.setAdapter(adapterS2);
        ArrayAdapter<String> adapterS3 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,str3);
        s3.setAdapter(adapterS3);
        ArrayAdapter<String> adapterS4 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,str4);
        s4.setAdapter(adapterS4);
        ArrayAdapter<String> adapterS5 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,str5);
        s5.setAdapter(adapterS5);
        ArrayAdapter<String> adapterS6 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,str6);
        s6.setAdapter(adapterS6);
        ArrayAdapter<String> adapterS7 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,str7);
        s7.setAdapter(adapterS7);

    }


    @Override
    public void onClick(View v) {
        if (checkout == v) {
            {
                Intent i = new Intent(this, Checkout.class);
                startActivity(i);
            }
        }}}
