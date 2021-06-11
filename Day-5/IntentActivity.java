package com.example.internship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentActivity extends AppCompatActivity {

    Button btn,btn1,btn2;
    EditText passdataet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        btn = findViewById(R.id.intent);
        btn1 = findViewById(R.id.implicitintent);
        btn2 = findViewById(R.id.datapasssubmit);
        passdataet = findViewById(R.id.passdataet);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IntentActivity.this,IntentWelcome.class);
                startActivity(intent);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com"));
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String passdata = passdataet.getText().toString();
                Intent intent = new Intent(IntentActivity.this, IntentPassData.class);
                intent.putExtra("DATA", passdata);
                startActivity(intent);
            }
        });
    }
}