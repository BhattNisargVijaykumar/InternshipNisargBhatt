package com.example.internship;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ListViewDetailPage extends AppCompatActivity {

    TextView tvqwe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_detail_page);
        tvqwe = findViewById(R.id.customlvpage);
        tvqwe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListViewDetailPage.this, CustomeGridViewPage.class);
                startActivity(intent);
            }
        });
    }
}