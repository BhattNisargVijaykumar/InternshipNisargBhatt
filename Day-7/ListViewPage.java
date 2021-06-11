package com.example.internship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListViewPage extends AppCompatActivity {

    ListView lv;
    TextView lvtv;
    String listdata[] = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eight", "Nine", "Ten"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_page);
        lv = findViewById(R.id.listviewid);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listdata);
        lv.setAdapter(arrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), listdata[position], Toast.LENGTH_SHORT).show();
            }
        });
        lvtv =findViewById(R.id.lvtv);
        lvtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ListViewPage.this, ScrollViewPage.class);
                startActivity(intent);
            }
        });
    }
}