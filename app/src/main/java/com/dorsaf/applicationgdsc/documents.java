package com.dorsaf.applicationgdsc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class documents extends AppCompatActivity {
private RecyclerView recyclerView;



private RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_documents);
        ArrayList<String> itemdoc = new ArrayList<>();
        itemdoc.add("School certificate");
        itemdoc.add("letter of recommendation");
        itemdoc.add("report card");
        itemdoc.add("Diploma");
        itemdoc.add("Abundant certificate");
        itemdoc.add("cover letter");
        itemdoc.add("change group");
        itemdoc.add("change speciality");

        recyclerView = findViewById(R.id.recycle);
        myadapter adapter= new myadapter(itemdoc);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        recyclerView.setAdapter(adapter);

    }
}