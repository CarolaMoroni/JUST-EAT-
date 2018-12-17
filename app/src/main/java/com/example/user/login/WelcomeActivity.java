package com.example.user.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
    TextView text_mail;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_welcome); // lega Activity al rispettivo Layout

        text_mail = findViewById(R.id.welcome_Tv);  // UI controller che lega variabile text_mail all' xml

        String mail  = getIntent().getStringExtra("email"); // mette in una variabile stringa il contenuto extra dell' intent

        text_mail.setText(mail);  // mette il testo extra nella variabile ( legata all' xml)

    }
}
