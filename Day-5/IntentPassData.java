package com.example.internship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class IntentPassData extends AppCompatActivity {

    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_pass_data);

        tv1 = findViewById(R.id.passeddata);
        Intent intent=getIntent();
        String data=intent.getStringExtra("DATA");
        tv1.setText("Your Data:-" + data);
        tv1.setVisibility(View.VISIBLE);
    }
}