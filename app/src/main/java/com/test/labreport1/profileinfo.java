package com.test.labreport1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class profileinfo extends AppCompatActivity {

    //button id from ptofileinfo.xml
    Button LogOut,update1;
    //text view
    TextView name,id,email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        //end of title bar remove
        setContentView(R.layout.profileinfo);

        //refrencing
        LogOut = findViewById(R.id.LogOut);
        update1 = findViewById(R.id.update1);
        //for data fetching
        name = findViewById(R.id.pname);
        id = findViewById(R.id.pid);
        email = findViewById(R.id.pemail);

        //recving data from updated activity
        Intent intent = getIntent();
        String nam = intent.getStringExtra("name");
        String idx = intent.getStringExtra("id");
        String mail = intent.getStringExtra("email");
        //data fetching
        name.setText(nam);
        id.setText(idx);
        email.setText(mail);


        //lintner for logout btn
        LogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Welcome Back",Toast.LENGTH_SHORT).show();
               //clicking logout , will go back to home page
                Intent intent4 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent4);
            }
        });
        //listener end for logout

        //lister for update btn
        update1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(),updatepage.class);
                startActivity(intent2);
            }
        });
        //lister for update ends
    }
}