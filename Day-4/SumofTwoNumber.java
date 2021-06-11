package com.example.internship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SumofTwoNumber extends AppCompatActivity {

    EditText et1,et2;
    TextView tv1;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumof_two_number);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        btn = findViewById(R.id.submit);
        tv1 = findViewById(R.id.tv1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1,num2;
                num1=et1.getText().toString();
                num2=et2.getText().toString();
                int a = Integer.parseInt(num1);
                int b = Integer.parseInt(num2);
                int sum = a+b;
                tv1.setText("Sum is: "+sum);
                tv1.setVisibility(View.VISIBLE);
                //Toast.makeText(SumofTwoNumber.this, "Sum is: "+sum, Toast.LENGTH_SHORT).show();

                tv1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(SumofTwoNumber.this, IntentActivity.class);
                        startActivity(intent);
                    }
                });

            }
        });
    }
}