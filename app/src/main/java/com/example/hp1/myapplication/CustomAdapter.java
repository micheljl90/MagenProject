package com.example.hp1.myapplication;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;



public class CustomAdapter  extends ArrayAdapter<Pc> {

    private int resource;

    public CustomAdapter(Context context, int resource, ArrayList<Pc> objects) {
        super(context, resource, objects);
        this.resource = resource;

    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater imageInflater = LayoutInflater.from(getContext());
        View cuView = imageInflater.inflate(resource, parent, false);

        Pc item = getItem(position);
        TextView title = (TextView) cuView.findViewById(R.id.tvpc1);
        ImageView image = (ImageView) cuView.findViewById(R.id.pc1b);
        Button btnClick = (Button) cuView.findViewById(R.id.btnBuy);
        title.setText(item.getTitle());
        image.setImageResource(item.getImageId());

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Item Poisition: " + position, Toast.LENGTH_LONG).show();
                Intent i = new Intent(getContext(), Buy.class);
                getContext().startActivity(i);
            }
        });
        return cuView;

    }
}
