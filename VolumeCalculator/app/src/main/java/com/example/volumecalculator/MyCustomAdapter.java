package com.example.volumecalculator;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MyCustomAdapter extends ArrayAdapter<shape> {
    private ArrayList<shape> shapesArrayList;  //Data Source
    Context context;
    //Represents the current environment of the application


    public MyCustomAdapter(ArrayList<shape> shapesArrayList, Context context) {
        super(context, R.layout.grid_item_layout, shapesArrayList);
        this.shapesArrayList = shapesArrayList;
        this.context = context;
    }

    //View Holder
    //Used to cache references to the views within an item layout
    private static class MyViewHolder{
        TextView shapeName;
        ImageView shapeImg;
    }

    //Get View
    // Used to create and return a view for a specific item in grid


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //If recycled view is available

        //1 - Get the shape object for the current position
        shape shapes = getItem(position);

        //2 - inflating layout
        MyViewHolder myViewHolder = null;

        if (convertView == null){
            // no view went off-screen --> Create new view
            myViewHolder = new MyViewHolder();
            //Instantiate XML Files
            LayoutInflater inflator = LayoutInflater.from(getContext());

            convertView = inflator.inflate(
                    R.layout.grid_item_layout,
                    parent,
                    false
            );
            //Finding the views
            myViewHolder.shapeName = (TextView) convertView.findViewById(R.id.textview);
            myViewHolder.shapeImg = (ImageView) convertView.findViewById(R.id.imageview);

            convertView.setTag(myViewHolder);

        }else{
            // a view went off-screen --> reuse it
            myViewHolder = (MyViewHolder) convertView.getTag();

        }

        //Getting the data from the model class (shape)
        myViewHolder.shapeName.setText(shapes.getShapeName());
        myViewHolder.shapeImg.setImageResource(shapes.getShapeImg());

        return convertView;
    }
}























