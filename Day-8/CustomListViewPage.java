package com.example.internship;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.internship.adapter.MyAdapter;

public class CustomListViewPage extends AppCompatActivity {
    ListView lv1;
    int image []={R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_background};
    String[]name= {"This is First foreground","This is First Background","This is Second Foreground","This is Second Background","This is Third Foreground","This is Third Background"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view_page);
        lv1=findViewById(R.id.lv1);
        MyAdapter myAdapter=new MyAdapter(image, name, CustomListViewPage.this);
        lv1.setAdapter(myAdapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(CustomListViewPage.this,ListViewDetailPage.class);
                intent.putExtra("image",image[position]);
                intent.putExtra("name",name[position]);
                startActivity(intent);
            }
        });
    }
}