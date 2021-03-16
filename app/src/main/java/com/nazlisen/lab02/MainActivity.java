package com.nazlisen.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email;
    EditText password;

    String mail ="nazlisn123@gmail.com";
    String pass = "123";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email= findViewById(R.id.TextEmail);
        password= findViewById(R.id.TextPassword);
         }

    public void login (View view){

        if(email.getText().toString().matches(mail) & password.getText().toString().matches(pass)){
            Intent intent = new Intent(this,SecondActivity2.class);
            intent.putExtra("customer", mail);
            startActivity(intent);
        }
        else{
            Toast.makeText(MainActivity.this , "Username or password wrong!",Toast.LENGTH_LONG).show();
        }


    }
}