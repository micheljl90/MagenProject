package com.example.hp1.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Checkout extends AppCompatActivity implements View.OnClickListener {
    Button callksp1,callivory1;
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        callksp1 = (Button) findViewById(R.id.callksp1);
        callivory1 = (Button) findViewById(R.id.callivory1);
        callivory1.setOnClickListener(this);
        callksp1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {{
                if (v==callivory1){
                dialContactPhone("03-9166000");
                }
            if(v==callksp1) {
                dialContactPhone("1-599-555-700 ");
            }
            }

        };

    private void dialContactPhone(final String phoneNumber) {

        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }
}
