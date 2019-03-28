package com.durga.balaji66.intentserviceexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //This service will start at the time of onCreate() method executes.
        Intent intent =new Intent(this,HelloIntentService.class);
        startService(intent);

        button =findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //This service will start at the time of  button click.
                Intent intent =new Intent(MainActivity.this,HelloIntentService.class);
                startService(intent);
            }
        });
    }
}
