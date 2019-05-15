package com.example.ex5a;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final String DIGITS_TAG = "Digits";
    private final String TV_MSG =  "you have entered: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button go_fish_btn = findViewById(R.id.go_fish_btn);
        TextView tap_tv = findViewById(R.id.tap_btn);

        // Check for additional arguments
        Bundle args = getIntent().getExtras();
        if(args !=null) {
            String value = args.getString(DIGITS_TAG);
            String message =  TV_MSG + value;
            tap_tv.setText(message);
        }
        go_fish_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // upon clicking the button - will direct the user to another activity
                startActivity(new Intent(MainActivity.this, gofish.class));
            }
        });

        tap_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, digits_insertion.class));

            }
        });

    }
}

