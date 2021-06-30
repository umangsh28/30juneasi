package com.example.a30juneasign2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText mv2;
    private TextView mtxt1;
    private Button mbtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mv2 = findViewById(R.id.v2);
        mtxt1=findViewById(R.id.txt1);
        mbtn2=findViewById(R.id.btn2);

        mbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Receiveactivity.class);
                intent.putExtra("key", mv2.getText().toString());
                startActivity(intent);
            }
        });
    }

}

