package com.example.taskuse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ListViewDetailPage extends AppCompatActivity {

    ImageView ivimage;
    TextView tvnamedetail,tvdetail,tvtitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_detail_page);

        ivimage=findViewById(R.id.ivimage);
        tvnamedetail=findViewById(R.id.tvnamedetail);
        tvdetail=findViewById(R.id.tvdetails);
        tvtitle=findViewById(R.id.textTitle);
        Intent intent = getIntent();
        int image=intent.getIntExtra("image",R.drawable.ic_launcher_foreground);
        ivimage.setImageResource(image);
        String name=intent.getStringExtra("name");
        tvtitle.setText(name);
        tvnamedetail.setText(name);
        String detail=intent.getStringExtra("description");
        tvdetail.setText(detail);
    }
}