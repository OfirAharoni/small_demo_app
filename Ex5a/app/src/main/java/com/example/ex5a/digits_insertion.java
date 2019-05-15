package com.example.ex5a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class digits_insertion extends AppCompatActivity {

    private final int MAX_SIZE = 5;
    private final String DIGITS_TAG = "Digits";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digits_insertion);

        final EditText editText = findViewById(R.id.digits_et);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editText.getText().toString().length()== MAX_SIZE)     //size as per your requirement
                {
                    // directs to the main screen with the typed value
                    Intent i = new Intent(digits_insertion.this, MainActivity.class);
                    i.putExtra(DIGITS_TAG, editText.getText().toString());
                    startActivity(i);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
