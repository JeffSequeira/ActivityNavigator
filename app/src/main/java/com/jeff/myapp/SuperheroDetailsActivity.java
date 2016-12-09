package com.jeff.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SuperheroDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.superhero_details_layout);
        TextView tvDetails = (TextView) findViewById(R.id.tvDetails);

        String path = getIntent().getExtras().getString("Heroes");

        switch (path){
            case "Superman":
                tvDetails.setText("Clark Kent\n Super Strength \n Laser Beam \n Flight ");
                break;

            case "Batman":
                tvDetails.setText("Bruce Wayne\n No SuperPowers");
                break;

            case "Spiderman":
                tvDetails.setText("Peter Parker\n Spider Sense \n Spider Web Swing");
                break;

            case "Ironman":
                tvDetails.setText("Tony Stark \n Iron Suit");
        }
    }
}
