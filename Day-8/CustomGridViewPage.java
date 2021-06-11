package com.example.internship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import com.example.internship.R;
import com.example.internship.adapter.MainAdapter;

public class CustomeGridViewPage extends AppCompatActivity {
    GridView gridView;
    String[]name= {"This is BackGround","This is ForeGround","This is BackGround","This is ForeGround"};
    int[] image={R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custome_grid_view_page);
        gridView =findViewById(R.id.grid_view);
        MainAdapter mainAdapter=new MainAdapter(CustomeGridViewPage.this,image,name);
        gridView.setAdapter(mainAdapter);
        gridView.setOnItemClickListener(new  AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(CustomeGridViewPage.this,GridViewDetailPage.class);
                intent.putExtra("image",image[position]);
                intent.putExtra("name",name[position]);
                startActivity(intent);
                //Toast.makeText(getApplicationContext(),"you clicked"+name[+position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}
