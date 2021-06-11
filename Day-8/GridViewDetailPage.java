package com.example.internship;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class GridViewDetailPage extends AppCompatActivity {
    ImageView ivimage;
    TextView tvnamedetail,tvqwe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_detail_page);
        ivimage=findViewById(R.id.ivimage);
        tvnamedetail=findViewById(R.id.tvnamedetail);
        Intent intent=getIntent();
        int image=intent.getIntExtra("image",R.drawable.ic_launcher_background);
        ivimage.setImageResource(image);

        String name=intent.getStringExtra("name");
        tvnamedetail.setText(name);

        tvqwe = findViewById(R.id.customlvpage);
        tvqwe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GridViewDetailPage.this, Login_Sp.class);
                startActivity(intent);
            }
        });

    }
}
