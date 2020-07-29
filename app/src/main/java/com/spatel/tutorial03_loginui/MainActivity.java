package com.spatel.tutorial03_loginui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    public EditText email;
    public EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        this.setTitle("Tutorial03");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.txt_email);
        password = findViewById(R.id.txt_password);
    }

    public void varifyIt(View view) {
        if (email.getText().toString().equals("admin@gmail.com")) {
            //Log.i("tag",password.getText().toString());
            if (password.getText().toString().equals("admin")) {
                Intent intent = new Intent(this, AnotherActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Welcome to AnotherActivity", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this,"Invalid Password",Toast.LENGTH_SHORT).show();
            }
        }
        else{
                Toast.makeText(this,"Invalid Email",Toast.LENGTH_SHORT).show();
        }
    }
}