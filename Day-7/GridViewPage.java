package com.example.internship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class GridViewPage extends AppCompatActivity {

    GridView gv;
    TextView gvt;
    String griddata[] = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eight", "Nine", "Ten"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_page);
        gv = findViewById(R.id.gridviewid);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, griddata);
        gv.setAdapter(arrayAdapter);

        gv.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(getApplicationContext(), griddata[position], Toast.LENGTH_SHORT).show();
        });

        gvt =findViewById(R.id.gvtv);
        gvt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(GridViewPage.this, ListViewPage.class);
                startActivity(intent);
            }
        });

    }
}