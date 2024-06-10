package com.example.marketapplication;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.marketapplication.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListener{

    // 1 - AdapterView
    RecyclerView recyclerView;

    // 2 - Data Source
    List<item> itemList;

    // 3 - Adapter - Instance from the custom adapter
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        itemList = new ArrayList<>();

        item i1 = new item(R.drawable.beverage, "Beverage", "Juice, Tea, Coffee and Soda");
        item i2 = new item(R.drawable.bread, "Bread", "Bread, Wheat and Beans");
        item i3 = new item(R.drawable.fruit, "Fruits", "Fresh fruits from the garden");
        item i4 = new item(R.drawable.milk, "Milk", "Milk, Shakes and Yogurt");
        item i5 = new item(R.drawable.popcorn, "Popcorn", "Pop Corn, Donut and Drinks");
        item i6 = new item(R.drawable.vegitables, "Vegetables", "Delecious Vegetables");

        itemList.add(i1);
        itemList.add(i2);
        itemList.add(i3);
        itemList.add(i4);
        itemList.add(i5);
        itemList.add(i6);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setLayoutManager(layoutManager);


        myAdapter = new MyAdapter(itemList);
        recyclerView.setAdapter(myAdapter);
        myAdapter.setClickListener(this);
    }

    @Override
    public void onClick(View v, int pos) {
        Toast.makeText(this, "You Choose: "+itemList.get(pos).getItemName(), Toast.LENGTH_SHORT).show();
    }
}