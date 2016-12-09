package com.jeff.myapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Greetings extends AppCompatActivity {

    private static final String TAG= Greetings.class.getName();
    TextView tV;
    EditText editTextFirstName;
    EditText editTextSecondName;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.greetings_layout);
        editTextFirstName=(EditText) findViewById(R.id.etfName);
        editTextSecondName=(EditText) findViewById(R.id.etlName);
        tV=(TextView)findViewById(R.id.tvResult);

    }

   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.settings_id:
                Toast.makeText(getBaseContext(),"No Settings",Toast.LENGTH_SHORT).show();
                break;

            case R.id.help_id:
                Toast.makeText(getBaseContext(),"Nobody is there to help",Toast.LENGTH_SHORT).show();
                break;

            case R.id.aboutus_id:
                Toast.makeText(getBaseContext(),"None of your business",Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }



    public void Greeting(View view){
        Log.i(TAG,"Hey "+editTextFirstName.getText().toString()+" "+editTextSecondName.getText().toString());
        String str=""+editTextFirstName.getText().toString()+" "+editTextSecondName.getText().toString();
        tV.setText("Hello  "+str);
        Toast.makeText(getBaseContext(), "hey " +editTextFirstName.getText().toString()+" "+editTextSecondName.getText().toString(),Toast.LENGTH_SHORT).show();

    }
}
