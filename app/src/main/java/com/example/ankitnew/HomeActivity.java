package com.example.ankitnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity
{
    Button mLemCold;
    Button mNA_NW;
    Button mNightNA;
    Button mHonorForm;
    public int x=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mLemCold=(Button)findViewById(R.id.len_cold);
        mNA_NW=(Button)findViewById(R.id.na_nw);
        mNightNA=(Button)findViewById(R.id.nn_a);
        mHonorForm=(Button)findViewById(R.id.honor_form);

        mLemCold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String FINAL_URL = "https://www.docdroid.net/FKv2vCD/length-cold-pdf";
                Intent intent = new Intent(getApplicationContext(), ViewActivity.class);
                intent.putExtra("url", FINAL_URL);
                startActivity(intent);
            }
        });
        mNA_NW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String FINAL_URL = "https://www.docdroid.net/0RzmX80/na-nw-pdf";
                Intent intent = new Intent(getApplicationContext(), ViewActivity.class);
                intent.putExtra("url", FINAL_URL);
                startActivity(intent);
            }
        });
        mNightNA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String FINAL_URL = "https://www.docdroid.net/QRjmGz2/nna-pdf";
                Intent intent = new Intent(getApplicationContext(), ViewActivity.class);
                intent.putExtra("url", FINAL_URL);
                startActivity(intent);
            }
        });
        mHonorForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String FINAL_URL = "https://www.docdroid.net/tLtYjPa/hf-pdf";
                Intent intent = new Intent(getApplicationContext(), ViewActivity.class);
                intent.putExtra("url", FINAL_URL);
                startActivity(intent);
            }
        });
    }
}