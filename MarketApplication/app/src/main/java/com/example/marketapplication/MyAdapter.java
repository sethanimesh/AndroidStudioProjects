package com.example.marketapplication;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<item> itemList;

    public MyAdapter(List<item> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Responsible for creating new view holders for your items

        View itemView = LayoutInflater
                .from(parent.getContext()).
                inflate(R.layout.item_layout, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //Binds the data from your dataset to the views within the view holder
        item item = itemList.get(position);

        holder.title.setText(item.getItemName());
        holder.description.setText(item.getItemDesc());
        holder.imageView.setImageResource(item.getItemImg());
    }

    @Override
    public int getItemCount() {
        // Returns the total number of items in the list
        return itemList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        // Holds references to the views within the item layout
        ImageView imageView;
        TextView title;
        TextView description;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            title = itemView.findViewById(R.id.textView);
            description = itemView.findViewById(R.id.textView2);
        }
    }
}


