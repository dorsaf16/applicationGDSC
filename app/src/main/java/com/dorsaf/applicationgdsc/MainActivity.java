package com.dorsaf.applicationgdsc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.text.DateFormatSymbols;

public class MainActivity extends AppCompatActivity {
 Spinner sp;
 ArrayAdapter<String>arrayAdapter;
 String[] filier = { "ISIL" , "SI", "ST" , "Computer Science"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = findViewById(R.id.filed);

        arrayAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,filier);
        sp.setAdapter(arrayAdapter);
    }


}