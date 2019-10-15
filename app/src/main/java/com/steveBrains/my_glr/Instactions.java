package com.steveBrains.my_glr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Instactions extends AppCompatActivity {
    Button startbtn;
    CheckBox chkIos;
    int a=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instactions);


        startbtn = findViewById(R.id.startbtn);
//        startbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(Instactions.this, Scan.class);
//                startActivity(i);


        addListenerOnChkIos();
        addListenerOnButton();
    }

    public void addListenerOnChkIos() {

        chkIos = (CheckBox) findViewById(R.id.chkWindows);

        chkIos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //is chkIos checked?
                if (((CheckBox) v).isChecked()) {
                    a=1;
                }

            }
        });

    }

    public void addListenerOnButton() {

        startbtn = (Button) findViewById(R.id.startbtn);

        startbtn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                if(a==1) {
                    Intent i = new Intent(Instactions.this, Scan.class);
                    startActivity(i);
                }else {
                    Toast.makeText(Instactions.this, "Please Check The box", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
