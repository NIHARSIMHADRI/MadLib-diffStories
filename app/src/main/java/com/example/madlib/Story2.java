package com.example.madlib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.CollationElementIterator;

public class Story2 extends AppCompatActivity {

    public static final String MY_NOUN = "noun";
    public static final String MY_ADJECTIVE = "adjective";
    public static final String MY_VERB = "verb";
    public static final String MY_ANIMAL = "animal";
    public static final String MY_NUMBER = "number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView str = null;
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_story2);
            Intent intent = getIntent();
            String myNoun = intent.getStringExtra(MY_NOUN);
            String myAdjective = intent.getStringExtra(MY_ADJECTIVE);
            String myVerb = intent.getStringExtra(MY_VERB);
            String myAnimal = intent.getStringExtra(MY_ANIMAL);
            String myNumber = intent.getStringExtra(MY_NUMBER);
            String oceanDisplay = "In the ocean there was a blue " + myNoun + ". The " + myNoun + " hated to "
                    + myVerb + " and was the worst at it. One day he found a " +
                    myAdjective + " conch and decided to show it to a " + myAnimal + ". Due to his generosity he was rewarded with " + myNumber + " fish to eat.";

            str = (TextView) findViewById(R.id.oceanstory);
            str.setText(oceanDisplay);
        } catch (Exception e) {
            String errorMessage = "Your input is invalid. Please try again.";
            str.setText(errorMessage);
        }
    }
}
