package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// making sure that your Identities that are to be used are labeled in your main activity.
        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        Button loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        //admin and admin
//This is the code to execute the login

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //This is what will determine if login is successful or not.
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    //correct
                    //We use Toast to display if login was successful
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                }else
                    //We use Toast to display if login was unsuccessful
                    Toast.makeText(MainActivity.this, "LOGIN FAILED",Toast.LENGTH_SHORT).show();
            }
        });


    }
}