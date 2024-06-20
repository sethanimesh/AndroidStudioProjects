package com.example.databinding;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MyClickHandler {
    //This class defines the method to be executed
    //when UI elements are clicked

    Context context;

    public MyClickHandler(Context context) {
        this.context = context;
    }

    public void onButtonClicked(View view){
        Toast.makeText(context, "Button is clicked!", Toast.LENGTH_SHORT).show();
    }
}
