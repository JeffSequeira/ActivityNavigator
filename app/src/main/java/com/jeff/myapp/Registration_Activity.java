package com.jeff.myapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Akash117759 on 25-10-2016.
 */

public class Registration_Activity extends AppCompatActivity {

    EditText etUserName,etMailId,etMobileNo,etPassward, etConfirmPassward;
    RadioGroup radioGroup;
    Button submit;
    String password, confirmPassword;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_layout);
        etUserName=(EditText)findViewById(R.id.etUserName);
        etMailId=(EditText)findViewById(R.id.etMailId);
        submit=(Button)findViewById(R.id.btnSubmit);
        etPassward=(EditText)findViewById(R.id.etPassward);
        etConfirmPassward=(EditText)findViewById(R.id.etConfirmPassward);
        password=etPassward.getText().toString();
        confirmPassword =etConfirmPassward.getText().toString();
        etMobileNo=(EditText)findViewById(R.id.etMobileNo);

    }
    public void doValidation(View view){

       isValidEmail();
        isPasswordMatching(password,confirmPassword);
        isValidMobileNo();
       try{
           sendEmail();
           Toast.makeText(getApplicationContext(),"Resistration Successfull",Toast.LENGTH_LONG).show();

       }catch (Exception e){
           Toast.makeText(getApplicationContext(),"Resistration Unuccessfull",Toast.LENGTH_LONG).show();
       }
    }


    public void isValidEmail() {
        Pattern ps = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher ms = ps.matcher(etMailId.getText().toString());
        boolean bs = ms.matches();
        if (bs == false) {
            Toast.makeText(getApplicationContext(),"Email id is incorrect",Toast.LENGTH_LONG).show();
        }
    }

    public void isPasswordMatching(String password, String confirmPassword) {
        Pattern pattern = Pattern.compile(password, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(confirmPassword);

        if (!matcher.matches()) {
            Toast.makeText(getApplicationContext(),"Password is incorrect",Toast.LENGTH_LONG).show();
        }
        Toast.makeText(getApplicationContext(),"Password is correct",Toast.LENGTH_LONG).show();
    }

    public void isValidMobileNo(){
        if (etMobileNo.length()!=10)
        {
            Toast.makeText(getApplicationContext(),"Mobile Number is incorrect",Toast.LENGTH_LONG).show();
        }
     }

    public void sendEmail() {
        try {
            String to = etMailId.getText().toString();
            String subject = "Successful Registration";
            String message = "Registration is Successful. Welcome to our Webpage";
            SendMailActivity sm = new SendMailActivity(this, to, subject, message);
            sm.execute();
        } catch (Exception e) {
            Toast.makeText(getBaseContext(), "Email sending failed", Toast.LENGTH_SHORT).show();
        }
    }

}
