package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cylinder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        EditText cylinder_radius = findViewById(R.id.editText);
        EditText cylinder_height = findViewById(R.id.editText2);
        TextView title = findViewById(R.id.textView);
        TextView result = findViewById(R.id.textView2);
        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radius = cylinder_radius.getText().toString();
                String height = cylinder_height.getText().toString();
                int r = Integer.parseInt(radius);
                int h = Integer.parseInt(height);

                double volume = 3.14159 * r*r* h;
                result.setText("V = "+volume+" m^3");
            }
        });
    }
}