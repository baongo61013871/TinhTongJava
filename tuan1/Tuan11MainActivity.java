package com.example.myapplication.Tuan1;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

public class Tuan11MainActivity extends AppCompatActivity {
    EditText edt1,edt2;
    TextView tv1;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan11_main);
        edt1 = findViewById(R.id.tuan11edt1);
        edt2 = findViewById(R.id.tuan11edt2);
        tv1 = findViewById(R.id.tuan11tv1);
        btn1 = findViewById(R.id.tuan11btn1);

        btn1.setOnClickListener(v -> {
            Intent i = new Intent(Tuan11MainActivity.this, tuan12MainActivity.class);
            i.putExtra("so1",edt1.getText().toString());
            i.putExtra("so2",edt2.getText().toString());
            startActivity(i);
        });
    }
}