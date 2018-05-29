package com.example.hp1.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.hp1.myapplication.Cump2.PCImage;

import static com.example.hp1.myapplication.R.id.home;
import static com.example.hp1.myapplication.R.layout.custom_row;
import static com.example.hp1.myapplication.R.layout.custom_row2;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bt,bt3,btnlogin;
    EditText bud;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = (Button) findViewById(R.id.bt);
        bt3 = (Button) findViewById(R.id.bt3);
        btnlogin = (Button) findViewById(R.id.btnlogin);
        bt3.setOnClickListener(this);
        bt.setOnClickListener(this);
        btnlogin.setOnClickListener(this);


        bud=(EditText)findViewById(R.id.bud);
    }



    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_setting:

                final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Are you sure you want to exit?");
                builder.setCancelable(true);
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View v) {
        if (bt3 == v)
        {
            String stBud=bud.getText().toString();
            int integerBud=Integer.parseInt(stBud);
            if(integerBud>=2500 &&integerBud<=5000)
            {
                Intent i = new Intent(this,Cump2.class);
                startActivity(i);


                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Register");
                builder.setMessage("You have to be signed in to continue");
                builder.setNegativeButton("Cancel", null);
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {



                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "!!!", Toast.LENGTH_SHORT).show();


                    }
                });

                AlertDialog ad = builder.create();
                ad.show();
            }

        }
        if(bt==v) {

            Intent i = new Intent(this,Register.class);
            startActivity(i);


        }
        if(btnlogin == v){
            Intent i = new Intent(this,Login.class);
            startActivity(i);
        }
    }


}
