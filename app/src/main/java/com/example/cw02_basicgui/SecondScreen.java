package com.example.cw02_basicgui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {

    TextView textName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        textName = findViewById(R.id.textView_Screen2_name);
        // you type in key here. you search through all of the different strings associated with that one; it's like an array
        // with an index value but the string is the index value here
        // this gets the extra string
        String nameFromScreen1 = getIntent().getStringExtra("theName");
        textName.setText(nameFromScreen1);
    }
}