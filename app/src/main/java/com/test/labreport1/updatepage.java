package com.test.labreport1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.graphics.drawable.AnimationDrawable;

public class updatepage extends AppCompatActivity {

    Button upd,bak;
    EditText name,email,id;
    View layout;

    //for animated bg

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        //end of title bar remove
        setContentView(R.layout.updatepage);



        //animated bg
        layout = findViewById(R.id.layout);
        //With the help of AnimatedDrawable class, we can set
        //the duration to our background and then call the
        AnimationDrawable animationDrawable = (AnimationDrawable)
                layout.getBackground();
        animationDrawable.setEnterFadeDuration(1500);
        animationDrawable.setExitFadeDuration(3000);
        animationDrawable.start();
        //function end.


        //for data sending
        upd = findViewById(R.id.upd01);
        name = findViewById(R.id.upusrname);
        email = findViewById(R.id.upemail);
        id = findViewById(R.id.upid);
        //update button start onclick
        upd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String upusrname = name.getText().toString().trim();
                String upemail = email.getText().toString().trim();
                String upid = id.getText().toString().trim();
                Toast.makeText(getApplicationContext(),"Upadated",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),profileinfo.class);
                intent.putExtra("name", upusrname);
                intent.putExtra("email", upemail);
                intent.putExtra("id", upid);
                startActivity(intent);
            }
        });
        //update button on click end

        //back button onclick back
        bak = findViewById(R.id.bak01);

        bak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),profileinfo.class);
                startActivity(intent);
            }
        });
        //end of onclck for back button

    }
}