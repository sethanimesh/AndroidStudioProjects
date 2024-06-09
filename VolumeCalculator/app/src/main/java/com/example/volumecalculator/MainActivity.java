package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //1 - AdapterView: GridView
    GridView gridView;

    //2 - Data Source
    ArrayList<shape> shapeArrayList;

    //3 - Adapter: custom adapter
    MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridview);

        shapeArrayList = new ArrayList<>();

        shape s1 = new shape(R.drawable.sphere, "Sphere");
        shape s2 = new shape(R.drawable.cylinder, "Cylinder");
        shape s3 = new shape(R.drawable.cube, "Cube");
        shape s4 = new shape(R.drawable.prism, "Prism");

        shapeArrayList.add(s1);
        shapeArrayList.add(s2);
        shapeArrayList.add(s3);
        shapeArrayList.add(s4);

        adapter = new MyCustomAdapter(shapeArrayList, getApplicationContext());
        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0){
                Intent i = new Intent(getApplicationContext(), Sphere.class);
                startActivity(i);
            } else if (position == 1){
                    Intent i = new Intent(getApplicationContext(), Cylinder.class);
                    startActivity(i);
                } else if (position == 2){
                    Intent i = new Intent(getApplicationContext(), Cube.class);
                    startActivity(i);
                } else if (position == 3){
                    Intent i = new Intent(getApplicationContext(), Prism.class);
                    startActivity(i);
                }
            }
        });
    }
}