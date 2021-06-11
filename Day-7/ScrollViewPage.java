package com.example.internship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ScrollViewPage extends AppCompatActivity {

    TextView nextpage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view_page);

        nextpage = findViewById(R.id.nextpagescroll);
        nextpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScrollViewPage.this, CustomListViewPage.class);
                startActivity(intent);
            }
        });
    }
}