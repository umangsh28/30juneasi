package com.example.a30juneasign2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Receiveactivity extends AppCompatActivity {

    private EditText mt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiveactivity);
        mt1=findViewById(R.id.t1);
        String name=getIntent().getStringExtra("key");
        mt1.setText(name);

    }
}