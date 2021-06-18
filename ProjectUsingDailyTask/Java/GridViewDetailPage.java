package com.example.taskuse;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GridViewDetailPage extends AppCompatActivity {
    ImageView ivimage;
    TextView tvnamedetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_detail_page);

        ivimage=findViewById(R.id.ivimage);
        tvnamedetail=findViewById(R.id.tvnamedetail);
        Intent intent = getIntent();
        int image=intent.getIntExtra("image",R.drawable.ic_launcher_foreground);
        ivimage.setImageResource(image);
        String name=intent.getStringExtra("name");
        tvnamedetail.setText(name);
    }
}
