package com.example.madlib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendInfo(View v) {
        Intent intent = null;
// getting a reference to my edit text fields
            EditText myNoun = (EditText) findViewById(R.id.myNoun);
            EditText myAdjective = (EditText) findViewById(R.id.myAdjective);
            EditText myVerb = (EditText) findViewById(R.id.myVerb);
            EditText myAnimal = (EditText) findViewById(R.id.myAnimal);
            EditText myNumber = (EditText) findViewById(R.id.myNumber);
// extracting the text from those edit text fields
            String myNounStr = myNoun.getText().toString();
            String myAdjectivestr = myAdjective.getText().toString();
            String myVerbstr = myVerb.getText().toString();
            String myAnimalstr = myAnimal.getText().toString();
            String myNumberstr = myNumber.getText().toString();
            //error check
        if (myNounStr.length() == 0)
            myNounStr = "ERROR";
        if (myAdjectivestr.length() == 0)
            myAdjectivestr = "ERROR";
        if (myVerbstr.length() == 0)
            myVerbstr = "ERROR";
        if (myAnimalstr.length() == 0)
            myAnimalstr = "ERROR";
        if (myNumberstr.length() == 0)
            myNumberstr = "ERROR";

        boolean containsWhitespaceNoun = false;
        for (int i = 0; i < myNounStr.length() && !containsWhitespaceNoun; i++) {
            if (Character.isWhitespace(myNounStr.charAt(i))) {
                containsWhitespaceNoun = true;
            }
        }
        if (containsWhitespaceNoun == true)
            myNounStr = "ERROR";

        boolean containsWhitespaceAdjective = false;
        for (int i = 0; i < myAdjectivestr.length() && !containsWhitespaceAdjective; i++) {
            if (Character.isWhitespace(myAdjectivestr.charAt(i))) {
                containsWhitespaceAdjective = true;
            }
        }
        if (containsWhitespaceAdjective == true)
            myAdjectivestr = "ERROR";

        boolean containsWhitespaceVerb = false;
        for (int i = 0; i < myVerbstr.length() && !containsWhitespaceVerb; i++) {
            if (Character.isWhitespace(myVerbstr.charAt(i))) {
                containsWhitespaceVerb = true;
            }
        }
        if (containsWhitespaceVerb == true)
            myVerbstr = "ERROR";

        boolean containsWhitespaceAnimal = false;
        for (int i = 0; i < myAnimalstr.length() && !containsWhitespaceAnimal; i++) {
            if (Character.isWhitespace(myAnimalstr.charAt(i))) {
                containsWhitespaceAnimal = true;
            }
        }
        if (containsWhitespaceVerb == true)
            myAnimalstr = "ERROR";

        boolean containsWhitespaceNumber = false;
        for (int i = 0; i < myNumberstr.length() && !containsWhitespaceNumber; i++) {
            if (Character.isWhitespace(myNumberstr.charAt(i))) {
                containsWhitespaceNumber = true;
            }
        }
        if (containsWhitespaceNumber == true)
            myNumberstr = "ERROR";
// Creating the intent object so I can send data
            intent = new Intent(this, Story.class);
// putting data from edit text fields into intent to send to other activity
// MY_Name and MY_AGE are public constants in InfoActivity class
            intent.putExtra(Story.MY_NOUN, myNounStr);
            intent.putExtra(Story.MY_ADJECTIVE, myAdjectivestr);
            intent.putExtra(Story.MY_VERB, myVerbstr);
            intent.putExtra(Story.MY_ANIMAL, myAnimalstr);
            intent.putExtra(Story.MY_NUMBER, myNumberstr);
// loads the next activity
            startActivity(intent);
    }

    public void sendInfo2(View v) {
        Intent intent = null;
// getting a reference to my edit text fields
            EditText myNoun = (EditText) findViewById(R.id.myNoun);
            EditText myAdjective = (EditText) findViewById(R.id.myAdjective);
            EditText myVerb = (EditText) findViewById(R.id.myVerb);
            EditText myAnimal = (EditText) findViewById(R.id.myAnimal);
            EditText myNumber = (EditText) findViewById(R.id.myNumber);
// extracting the text from those edit text fields
            String myNounStr = myNoun.getText().toString();
            String myAdjectivestr = myAdjective.getText().toString();
            String myVerbstr = myVerb.getText().toString();
            String myAnimalstr = myAnimal.getText().toString();
            String myNumberstr = myNumber.getText().toString();
        //error check
        if (myNounStr.length() == 0)
            myNounStr = "ERROR";
        if (myAdjectivestr.length() == 0)
            myAdjectivestr = "ERROR";
        if (myVerbstr.length() == 0)
            myVerbstr = "ERROR";
        if (myAnimalstr.length() == 0)
            myAnimalstr = "ERROR";
        if (myNumberstr.length() == 0)
            myNumberstr = "ERROR";

        boolean containsWhitespaceNoun = false;
        for (int i = 0; i < myNounStr.length() && !containsWhitespaceNoun; i++) {
            if (Character.isWhitespace(myNounStr.charAt(i))) {
                containsWhitespaceNoun = true;
            }
        }
        if (containsWhitespaceNoun == true)
            myNounStr = "ERROR";

        boolean containsWhitespaceAdjective = false;
        for (int i = 0; i < myAdjectivestr.length() && !containsWhitespaceAdjective; i++) {
            if (Character.isWhitespace(myAdjectivestr.charAt(i))) {
                containsWhitespaceAdjective = true;
            }
        }
        if (containsWhitespaceAdjective == true)
            myAdjectivestr = "ERROR";

        boolean containsWhitespaceVerb = false;
        for (int i = 0; i < myVerbstr.length() && !containsWhitespaceVerb; i++) {
            if (Character.isWhitespace(myVerbstr.charAt(i))) {
                containsWhitespaceVerb = true;
            }
        }
        if (containsWhitespaceVerb == true)
            myVerbstr = "ERROR";

        boolean containsWhitespaceAnimal = false;
        for (int i = 0; i < myAnimalstr.length() && !containsWhitespaceAnimal; i++) {
            if (Character.isWhitespace(myAnimalstr.charAt(i))) {
                containsWhitespaceAnimal = true;
            }
        }
        if (containsWhitespaceVerb == true)
            myAnimalstr = "ERROR";

        boolean containsWhitespaceNumber = false;
        for (int i = 0; i < myNumberstr.length() && !containsWhitespaceNumber; i++) {
            if (Character.isWhitespace(myNumberstr.charAt(i))) {
                containsWhitespaceNumber = true;
            }
        }
        if (containsWhitespaceNumber == true)
            myNumberstr = "ERROR";
// Creating the intent object so I can send data
            intent = new Intent(this, Story2.class);
// putting data from edit text fields into intent to send to other activity
// MY_Name and MY_AGE are public constants in InfoActivity class
            intent.putExtra(Story2.MY_NOUN, myNounStr);
            intent.putExtra(Story2.MY_ADJECTIVE, myAdjectivestr);
            intent.putExtra(Story2.MY_VERB, myVerbstr);
            intent.putExtra(Story2.MY_ANIMAL, myAnimalstr);
            intent.putExtra(Story2.MY_NUMBER, myNumberstr);
// loads the next activity
            startActivity(intent);
    }

    public void sendInfo3(View v) {
        Intent intent = null;
        try {
// getting a reference to my edit text fields
            EditText myNoun = (EditText) findViewById(R.id.myNoun);
            EditText myAdjective = (EditText) findViewById(R.id.myAdjective);
            EditText myVerb = (EditText) findViewById(R.id.myVerb);
            EditText myAnimal = (EditText) findViewById(R.id.myAnimal);
            EditText myNumber = (EditText) findViewById(R.id.myNumber);
// extracting the text from those edit text fields
            String myNounStr = myNoun.getText().toString();
            String myAdjectivestr = myAdjective.getText().toString();
            String myVerbstr = myVerb.getText().toString();
            String myAnimalstr = myAnimal.getText().toString();
            String myNumberstr = myNumber.getText().toString();
            //error check
            if (myNounStr.length() == 0)
                myNounStr = "ERROR";
            if (myAdjectivestr.length() == 0)
                myAdjectivestr = "ERROR";
            if (myVerbstr.length() == 0)
                myVerbstr = "ERROR";
            if (myAnimalstr.length() == 0)
                myAnimalstr = "ERROR";
            if (myNumberstr.length() == 0)
                myNumberstr = "ERROR";

            boolean containsWhitespaceNoun = false;
            for (int i = 0; i < myNounStr.length() && !containsWhitespaceNoun; i++) {
                if (Character.isWhitespace(myNounStr.charAt(i))) {
                    containsWhitespaceNoun = true;
                }
            }
            if (containsWhitespaceNoun == true)
                myNounStr = "ERROR";

            boolean containsWhitespaceAdjective = false;
            for (int i = 0; i < myAdjectivestr.length() && !containsWhitespaceAdjective; i++) {
                if (Character.isWhitespace(myAdjectivestr.charAt(i))) {
                    containsWhitespaceAdjective = true;
                }
            }
            if (containsWhitespaceAdjective == true)
                myAdjectivestr = "ERROR";

            boolean containsWhitespaceVerb = false;
            for (int i = 0; i < myVerbstr.length() && !containsWhitespaceVerb; i++) {
                if (Character.isWhitespace(myVerbstr.charAt(i))) {
                    containsWhitespaceVerb = true;
                }
            }
            if (containsWhitespaceVerb == true)
                myVerbstr = "ERROR";

            boolean containsWhitespaceAnimal = false;
            for (int i = 0; i < myAnimalstr.length() && !containsWhitespaceAnimal; i++) {
                if (Character.isWhitespace(myAnimalstr.charAt(i))) {
                    containsWhitespaceAnimal = true;
                }
            }
            if (containsWhitespaceVerb == true)
                myAnimalstr = "ERROR";

            boolean containsWhitespaceNumber = false;
            for (int i = 0; i < myNumberstr.length() && !containsWhitespaceNumber; i++) {
                if (Character.isWhitespace(myNumberstr.charAt(i))) {
                    containsWhitespaceNumber = true;
                }
            }
            if (containsWhitespaceNumber == true)
                myNumberstr = "ERROR";
// Creating the intent object so I can send data
            intent = new Intent(this, Story3.class);
// putting data from edit text fields into intent to send to other activity
// MY_Name and MY_AGE are public constants in InfoActivity class
            intent.putExtra(Story3.MY_NOUN, myNounStr);
            intent.putExtra(Story3.MY_ADJECTIVE, myAdjectivestr);
            intent.putExtra(Story3.MY_VERB, myVerbstr);
            intent.putExtra(Story3.MY_ANIMAL, myAnimalstr);
            intent.putExtra(Story3.MY_NUMBER, myNumberstr);
// loads the next activity
            startActivity(intent);
        } catch (Exception e) {
            intent.putExtra(Story3.MY_NOUN, "error");
            intent.putExtra(Story3.MY_ADJECTIVE, "error");
            intent.putExtra(Story3.MY_VERB, "error");
            intent.putExtra(Story3.MY_ANIMAL, "error");
            intent.putExtra(Story3.MY_NUMBER, "error");
        }
    }
}
