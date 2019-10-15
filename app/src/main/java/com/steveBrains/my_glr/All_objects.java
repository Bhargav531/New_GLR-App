package com.steveBrains.my_glr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class All_objects extends AppCompatActivity {

    Button car,bike,mobile,priter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.all_objects);


        car=findViewById(R.id.car);
        bike=findViewById(R.id.bike);
        mobile=findViewById(R.id.mobile);
        priter=findViewById(R.id.printer);


        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(All_objects.this, "Your Object is detected", Toast.LENGTH_LONG).show();
                Intent i =new Intent(All_objects.this,car_problems.class);
                startActivity(i);

            }
        });

        bike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(All_objects.this, "Your Object is detected", Toast.LENGTH_LONG).show();
                Intent i =new Intent(All_objects.this,bike_problems.class);
                startActivity(i);

            }
        });

        mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(All_objects.this, "Your Object is detected", Toast.LENGTH_LONG).show();
                Intent i =new Intent(All_objects.this,mobile_problems.class);
                startActivity(i);

            }
        });

        priter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(All_objects.this, "Your Object is detected", Toast.LENGTH_LONG).show();
                Intent i =new Intent(All_objects.this,priter_problems.class);
                startActivity(i);

            }
        });
    }

}
