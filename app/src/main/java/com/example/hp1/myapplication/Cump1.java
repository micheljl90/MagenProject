package com.example.hp1.myapplication;
/*
@author Mich
 */

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class Cump1 extends MainActivity{


    ListView PCI;
    ArrayList prgmName;

    public static int [] PCImage={R.drawable.pc1b,R.drawable.pc2b, R.drawable.pc3b};
    public static String [] PCTitleList={"a","b","c"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cump1);
        prgmName=new ArrayList();
        for(int i=0;i<PCImage.length;i++)
            prgmName.add(new Pc(PCTitleList[i],PCImage[i]));

        PCI=(ListView) findViewById(R.id.lvp);
        CustomAdapter adapter = new CustomAdapter(this,R.layout.custom_row2,prgmName);
        PCI.setAdapter(adapter);
    }



    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_setting:

                final AlertDialog.Builder builder = new AlertDialog.Builder(Cump1.this);
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
}

