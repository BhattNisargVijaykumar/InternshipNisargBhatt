package com.example.internship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EmailPage extends AppCompatActivity {

    EditText tomail,subjectmail,messagemail;
    Button sendmail,btnnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_page);

        tomail = findViewById(R.id.toet);
        subjectmail = findViewById(R.id.subjectet);
        messagemail = findViewById(R.id.messageet);
        sendmail = findViewById(R.id.emailbtn);
        btnnext = findViewById(R.id.nextact);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmailPage.this, MediaPlayerPage.class);
                startActivity(intent);
            }
        });
        sendmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String to = tomail.getText().toString();
                String subject = subjectmail.getText().toString();
                String message = messagemail.getText().toString();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] {to});
                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                intent.putExtra(Intent.EXTRA_TEXT, message);
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent, "Send EMail :"));
            }
        });

    }
}