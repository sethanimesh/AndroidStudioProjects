package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cube extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        EditText cube_edge = findViewById(R.id.editText);
        TextView title = findViewById(R.id.textView);
        TextView result = findViewById(R.id.textView2);
        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edge = cube_edge.getText().toString();
                int e = Integer.parseInt(edge);

                double volume = e*e*e;
                result.setText("V = "+volume+" m^3");
            }
        });
    }
}