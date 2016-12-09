package com.jeff.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.jeff.myapp.R.id.etfNum;
import static com.jeff.myapp.R.id.etsNum;
import static com.jeff.myapp.R.id.tvResult;

public class CalculatorActivity extends AppCompatActivity {

    private EditText etFirstNum;
    private EditText etSecondNum;
    private TextView tv;

   public void doCalculation(View view){
            double num1=0;
        try{
            num1 = Double.parseDouble(etFirstNum.getText().toString());
        }catch(NumberFormatException e){
            tv.setText("Enter the first number");
            return;
        }

       double num2=0;
       try{
           num2 = Double.parseDouble(etSecondNum.getText().toString());
       }catch(NumberFormatException e){
           tv.setText("Enter the second number");
           return;
       }

        switch (view.getId()){
            case R.id.btnAdd:
                tv.setText(""+(num1+num2));
                break;

            case R.id.btnSubtract:
                tv.setText(""+(num1-num2));
                break;

            case R.id.btnMultiply:
                tv.setText(""+(num1*num2));
                break;

            case R.id.btnDivide:
                tv.setText(""+(num1/num2));
                break;

            case R.id.btnMod:
                tv.setText(""+(num1%num2));
                break;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_layout);

        etFirstNum= (EditText) findViewById(etfNum);
        etSecondNum=(EditText) findViewById(etsNum);
        tv=(TextView) findViewById(tvResult);


    }
}
