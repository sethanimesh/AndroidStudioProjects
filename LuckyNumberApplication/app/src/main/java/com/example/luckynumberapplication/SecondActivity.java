package com.example.luckynumberapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    TextView welcomeTxt, luckNumberTxt;
    Button share_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        welcomeTxt = findViewById(R.id.textView2);
        luckNumberTxt = findViewById(R.id.textView3);
        share_btn = findViewById(R.id.button2);

        Intent intent = getIntent();

        String userName = intent.getStringExtra("name");

        //Generate Random Number

        int randomNumberGenerated = generateRandom();

        luckNumberTxt.setText(""+randomNumberGenerated);

        share_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareData(userName, randomNumberGenerated);
            }
        });
    }

    public int generateRandom(){
        Random random = new Random();
        int upper_limit = 1000;

        int randomNumber = random.nextInt(upper_limit);

        return randomNumber;
    }

    public void shareData(String username, int randomNumber){
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_SUBJECT, username+" got lucky today");
        i.putExtra(Intent.EXTRA_TEXT, "My lucky number is: "+randomNumber);

        startActivity(Intent.createChooser(i, "Choose a platform"));
    }
}