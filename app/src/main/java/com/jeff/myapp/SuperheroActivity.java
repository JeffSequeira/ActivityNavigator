package com.jeff.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SuperheroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.superhero_layout);
        
        populateListView();
        registerClickCallBack();
    }

    private void populateListView() {
        //Create the list
        String[] superheroes = {"Batman", "Superman", "Spiderman", "Ironman"};
        //Build the adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.da_item,superheroes);

        //Configure the ListView
        ListView lvSuperhero = (ListView) findViewById(R.id.lvSuperhero);
        lvSuperhero.setAdapter(adapter);
    }

    private void registerClickCallBack() {
        ListView lvSuperhero = (ListView) findViewById(R.id.lvSuperhero);
        lvSuperhero.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String s = parent.getItemAtPosition(position).toString();
                Intent intent = new Intent();
                intent.putExtra("Heroes",s);
                intent.setClass(getApplicationContext(),SuperheroDetailsActivity.class);
                startActivity(intent);

            }
        });
    }
}
