package com.example.internship;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Signup_Sp extends AppCompatActivity {
    EditText etName,etEmail,etPassword,etNumber;
    Button btnsignup;

    public static final String main_key="myprerf";
    public static final String name_key="namekey";
    public static final String email_key="emailkey";
    public static final String password_key="passwordkey";
    public static final String number_key="numberkey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_sp);

        etName=findViewById(R.id.etName);
        etEmail=findViewById(R.id.etEmail);
        etPassword=findViewById(R.id.etPassword);
        etNumber=findViewById(R.id.etNumber);

        btnsignup=findViewById(R.id.btnsignup);

        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences preferences=getSharedPreferences(main_key,MODE_PRIVATE);
                String name,email,password,contact;
                name=etName.getText().toString();
                email=etEmail.getText().toString();
                password=etPassword.getText().toString();
                contact=etNumber.getText().toString();

                SharedPreferences.Editor editor= preferences.edit();
                editor.putString(name_key,name);
                editor.putString(email_key,email);
                editor.putString(password_key,password);
                editor.putString(number_key,contact);

                editor.commit();
                Intent intent=new Intent(Signup_Sp.this,Login_Sp.class);
                startActivity(intent);
            }
        });
    }
}