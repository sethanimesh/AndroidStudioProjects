package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prism extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);
        EditText prism_base = findViewById(R.id.editText);
        EditText prism_height = findViewById(R.id.editText2);
        TextView title = findViewById(R.id.textView);
        TextView result = findViewById(R.id.textView2);
        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String base = prism_base.getText().toString();
                String height = prism_height.getText().toString();
                int b = Integer.parseInt(base);
                int h = Integer.parseInt(height);

                double volume = b*h;
                result.setText("V = "+volume+" m^3");
            }
        });
    }
}