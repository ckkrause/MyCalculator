package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void additionClickFunction(View view) {
        EditText num1 = (EditText) findViewById(R.id.editTextNumber1);
        EditText num2 = (EditText) findViewById((R.id.editTextNumber2));

        String str1 = num1.getText().toString();
        String str2 = num2.getText().toString();

        int addNum = Integer.parseInt(str1) + Integer.parseInt(str2);
        goToActivity2(addNum);

    }

    public void subtractionClickFunction(View view) {
        EditText num1 = (EditText) findViewById(R.id.editTextNumber1);
        EditText num2 = (EditText) findViewById((R.id.editTextNumber2));

        String str1 = num1.getText().toString();
        String str2 = num2.getText().toString();

        int subNum = Integer.parseInt(str1) - Integer.parseInt(str2);
        goToActivity2(subNum);
    }

    public void multiplicationClickFunction(View view) {
        EditText num1 = (EditText) findViewById(R.id.editTextNumber1);
        EditText num2 = (EditText) findViewById((R.id.editTextNumber2));

        String str1 = num1.getText().toString();
        String str2 = num2.getText().toString();

        int multNum = Integer.parseInt(str1) * Integer.parseInt(str2);
        goToActivity2(multNum);
    }

    public void divisionClickFunction(View view) {
        EditText num1 = (EditText) findViewById(R.id.editTextNumber1);
        EditText num2 = (EditText) findViewById((R.id.editTextNumber2));

        String str1 = num1.getText().toString();
        String str2 = num2.getText().toString();

        int divNum = Integer.parseInt(str1) / Integer.parseInt(str2);
        goToActivity2(divNum);
    }

    public void goToActivity2(int val) {
        Intent intent = new Intent(this, MainActivity2.class);
        String s = Integer.toString(val);
        intent.putExtra("message",s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}