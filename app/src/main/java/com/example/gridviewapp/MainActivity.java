package com.example.gridviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=findViewById(R.id.gridView);

        //Data to be displayed into gridview

        ArrayList<courseModel> courseModelArrayList=new ArrayList<>();
        courseModelArrayList.add(new courseModel("The Complete Android 12 course",R.drawable.course1));
        courseModelArrayList.add(new courseModel("The Complete Java Developer course",R.drawable.course2));
        courseModelArrayList.add(new courseModel("The Complete Kotlin course",R.drawable.course3));
        courseModelArrayList.add(new courseModel("The Complete Data Structure course",R.drawable.course4));

        //Attach the adapter
        MyAdapter myAdapter=new MyAdapter(this,courseModelArrayList);
        gridView.setAdapter(myAdapter);



    }
}