package com.example.planetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<planet> planetsArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1- AdapterView: a listView
        listView = findViewById(R.id.listview);

        // 2- Data Source: ArrayList<Planet>
        planetsArrayList = new ArrayList<>();

        planet planet1 = new planet("Mercury", "0 Moon", R.drawable.mercury);
        planet planet2 = new planet("Venus", "0 Moon", R.drawable.venus);
        planet planet3 = new planet("Earth", "1 Moon", R.drawable.earth);
        planet planet4 = new planet("Mars", "2 Moons", R.drawable.mars);
        planet planet5 = new planet("Jupyter", "79 Moons", R.drawable.jupiter);
        planet planet6 = new planet("Saturn", "83 Moons", R.drawable.saturn);
        planet planet7 = new planet("Uranus", "27 Moons", R.drawable.uranus);
        planet planet8 = new planet("Neptune", "14  Moon", R.drawable.neptune);

        planetsArrayList.add(planet1);
        planetsArrayList.add(planet2);
        planetsArrayList.add(planet3);
        planetsArrayList.add(planet4);
        planetsArrayList.add(planet5);
        planetsArrayList.add(planet6);
        planetsArrayList.add(planet7);
        planetsArrayList.add(planet8);

        //Adapter:
        MyCustomAdapter adapter = new MyCustomAdapter(planetsArrayList, getApplicationContext());
        listView.setAdapter(adapter);

        //Handling click events

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Planet Name: "+adapter.getItem(position).getPlanetName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}