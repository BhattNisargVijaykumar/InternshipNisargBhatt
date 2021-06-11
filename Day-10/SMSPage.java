package com.example.internship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SMSPage extends AppCompatActivity {

    EditText number,message;
    Button smsbtn,btnnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smspage);
        number =findViewById(R.id.numbersms);
        message =findViewById(R.id.messagesms);
        smsbtn = findViewById(R.id.btnsms);
        smsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no = number.getText().toString();
                String msg = message.getText().toString();
                SmsManager sms = SmsManager.getDefault();
                sms.sendTextMessage(no,null,msg,null,null);
                Toast.makeText(SMSPage.this, "Message Sent Successfully!", Toast.LENGTH_SHORT).show();
            }
        });

        btnnext = findViewById(R.id.nextact);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SMSPage.this, EmailPage.class);
                startActivity(intent);
            }
        });
    }
}