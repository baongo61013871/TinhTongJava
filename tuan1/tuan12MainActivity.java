package com.example.myapplication.Tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

public class tuan12MainActivity extends AppCompatActivity {
    TextView tv1,tv2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan12_main);
        tv1 = findViewById(R.id.tuan12tv1);
        tv2 = findViewById(R.id.tuan12tv2);
        Intent i1 = getIntent();

        String chuoi1 = i1.getExtras().getString("so1");
        String chuoi2 =i1.getExtras().getString("so2");

        float so1 = Float.parseFloat(chuoi1);
        float so2 = Float.parseFloat(chuoi2);

        float tong = so1 + so2;

        tv1.setText(String.valueOf(tong));

    }
}