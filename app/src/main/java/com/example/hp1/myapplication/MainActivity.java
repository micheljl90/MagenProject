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
import android.widget.Toast;

import static com.example.hp1.myapplication.R.id.home;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bt,bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = (Button) findViewById(R.id.bt);
        bt3 = (Button) findViewById(R.id.bt3);
        bt3.setOnClickListener(this);
        bt.setOnClickListener(this);
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

    Intent i = new Intent();
    i.setClass(this,MapsActivity.class);

    startActivity(i);
}
        if(bt==v) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Alert Dialog");
            builder.setMessage("Alert dialog");
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
}
