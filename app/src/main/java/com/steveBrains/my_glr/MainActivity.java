package com.steveBrains.my_glr;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static int KSV = 3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        boolean connected = false;
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED)
        {
            //we are connected to a network
            connected = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intant = new Intent(MainActivity.this, Instactions.class);
                    intant.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intant);

                    this.overridePendingTransition(1000, 1000);
                    finish();

                }

                private void overridePendingTransition(int i, int i1) {
                }


            }, KSV);

        } else {

            connected = false;
            Toast.makeText(this, "You are not connected to Internet", Toast.LENGTH_SHORT).show();

        }




    }
}






