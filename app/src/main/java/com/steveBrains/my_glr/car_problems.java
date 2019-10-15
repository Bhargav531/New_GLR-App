package com.steveBrains.my_glr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class car_problems extends AppCompatActivity {
    private RadioGroup Car_problems;
    private RadioButton radioSexButton;
    private Button Car_start;
    RadioButton Wheels,Oil,battery,bumper;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.car_problems);
        findViewById(R.id.Car_start).setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                RadioButton  Wheels= (RadioButton) findViewById(R.id.Wheels);
                RadioButton oil = (RadioButton) findViewById(R.id.Oil);
                RadioButton  battery= (RadioButton) findViewById(R.id.battery);
                RadioButton bumper = (RadioButton) findViewById(R.id.bumper);



                if (Wheels.isChecked()) {
                    Intent page = new Intent(car_problems.this, Wheels_steps.class);
                    startActivity(page);
                } else if (battery.isChecked()) {
                    Intent page = new Intent(car_problems.this, battery_steps.class);
                    startActivity(page);
                } else if (oil.isChecked()) {
                    Intent page = new Intent(car_problems.this, Scan.class);
                    startActivity(page);
                } else if (bumper.isChecked()) {
                    Intent page = new Intent(car_problems.this, Scan.class);
                    startActivity(page);
                }
            }
        });
    }
}