package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sphere extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

        EditText sphere_radius = findViewById(R.id.editText);
        TextView title = findViewById(R.id.textView);
        TextView result = findViewById(R.id.textView2);
        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radius = sphere_radius.getText().toString();
                int r = Integer.parseInt(radius);

                double volume = (4/3)*3.14159 * r*r*r;
                result.setText("V = "+volume+" m^3");
            }
        });
    }
}