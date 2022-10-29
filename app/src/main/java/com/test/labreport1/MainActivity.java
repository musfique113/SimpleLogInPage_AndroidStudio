package com.test.labreport1;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.net.wifi.aware.WifiAwareManager;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText pass;
    EditText usrname;
    Button loginBT,reset;
    ImageButton cls;
    LinearLayout mainlayout;


    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        //end of title bar remove
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //refrencing
        email=findViewById(R.id.upemail);
        pass=findViewById(R.id.upid);
        usrname=findViewById(R.id.upusrname);
        loginBT=findViewById(R.id.upupdate) ;
        cls=findViewById(R.id.cls);
        reset=findViewById(R.id.reset);
        mainlayout =findViewById(R.id.mainlayout);


        //event listner for loginbtn begins
        loginBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textN=usrname.getText().toString();
                String textP=pass.getText().toString();
                String textQ=email.getText().toString();
                //condition for login
                if ((textN.equals("musfique")) && (textP.equals("123")) && (textQ.equals("tes@gmail.com")))
                //Toast.makeText(getApplicationContext(),"Login in button selected", Toast.LENGTH_SHORT).show();
                {
                    Intent intent = new Intent(getApplicationContext(),profileinfo.class);
                    startActivity(intent);
                }
               else
               {
                    Toast.makeText(getApplicationContext(),"Login failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //end here loginBtN ON CLICK LISTNER

        //listner for canclebutton
        cls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Toast.makeText(getApplicationContext(),"Login Cancled",Toast.LENGTH_SHORT).show();
            }
        });
        //end of cancle button

        //reset button for colore change
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
                mainlayout.setBackgroundColor(color);
            }
        });
        //reset button color change

        /* touch any where to change color
        mainlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
                mainlayout.setBackgroundColor(color);
            }
        });
         */



    }
}