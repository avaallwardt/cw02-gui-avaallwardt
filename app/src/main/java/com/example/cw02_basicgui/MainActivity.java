package com.example.cw02_basicgui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView myGreeting;
    Button myButton;
    // if you're only clicking the button to move to a new screen, you technically dont need to make it an object
    EditText namePrompt;
    // apps live in 1 of 6 states (creation, paused, resumed, closed out of app), only required to have an onCreate state
    @Override
    // if you don't specify, protected is the access modifier it gets by default (can only access the class if in the same package)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // the two above must always be the first bc must first establish the main screen
        // want to divide code up into smaller methods
        initializeView();
        // namePrompt
        namePrompt = findViewById(R.id.input_Name);
    }
    
    public void initializeView(){
        // initialize myGreeting here -- now myGreeting refers to the textView_Greeting
        myGreeting = findViewById(R.id.textView_Greeting);
        // this will override whatever value is there
        myGreeting.setText("Goodbye, World");
        myButton = findViewById(R.id.button_MyButton);
        myButton.setText("Click Me");
    }

    public void buttonPressed(View view){
        // oldButton will be whatever button is clicked even if every button refers to this method when clicked
        Button oldButton = (Button) view;
        String buttonText = oldButton.getText().toString();
        myGreeting.setText(buttonText);
        myButton.setText("Ouch! That hurts!");
    }

    public void loadScreen(View view){
        // android studio provides the SecondScreen class
        // intent - allows you to go from one activity to another (one screen to another)
            // intent is used only for switching screens and passing data between it
        // the first one will always be this
        Intent intent = new Intent(this, SecondScreen.class);
       String nameFromInput = namePrompt.getText().toString();
        // allows you to take things to the second screen
        intent.putExtra("theName", nameFromInput);
        // android studio provides the startActivity() method
        // this line brings you to the next screen
        startActivity(intent);
    }





}