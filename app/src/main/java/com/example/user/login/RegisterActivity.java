package com.example.user.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    EditText emailEt;
    EditText passwordEt;
    EditText phoneNumberEt;

    Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Connect activity class to layout

        setContentView(R.layout.activity_register);
        emailEt = findViewById(R.id.email_et);
        passwordEt = findViewById(R.id.password_et);
        phoneNumberEt = findViewById(R.id.phone_et);
        registerBtn = findViewById(R.id.register_btn);


        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // do something

                String email = emailEt.getText().toString();
                String password = passwordEt.getText().toString();
                String phoneNumber = phoneNumberEt.getText().toString();

                createAccount(email,password,phoneNumber);

            }
        });

    }



    private void createAccount(String email, String password,String phoneNumber){

        // TODO cose
    }























    private boolean isValidEmail(String email){
        //TODO
        return true;
    }

    private boolean isValidPassowrd(String password){
        return true;
    }

    private  boolean isValidPhone(String phone){
        return false;
    }
}
