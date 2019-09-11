package com.example.madlib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Story3 extends AppCompatActivity {

    public static final String MY_NOUN = "noun";
    public static final String MY_ADJECTIVE = "adjective";
    public static final String MY_VERB = "verb";
    public static final String MY_ANIMAL = "animal";
    public static final String MY_NUMBER = "number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story3);
        Intent intent = getIntent();
        String myNoun = intent.getStringExtra(MY_NOUN);
        String myAdjective = intent.getStringExtra(MY_ADJECTIVE);
        String myVerb = intent.getStringExtra(MY_VERB);
        String myAnimal = intent.getStringExtra(MY_ANIMAL);
        String myNumber = intent.getStringExtra(MY_NUMBER);
        String dessertDisplay = "In the dessert there was an orange " + myNoun + ". The " + myNoun + " use to "
                + myVerb + " every day in the dessert. One day he found a " +
                myAdjective + " cactus and decided to show it to a " + myAnimal + ". Due to his generosity he was rewarded with " + myNumber + " litres of water.";

        TextView str = (TextView) findViewById(R.id.dessertstory);
        str.setText(dessertDisplay);
    }
}
