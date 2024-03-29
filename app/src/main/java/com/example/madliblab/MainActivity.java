package com.example.madliblab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * @author Xander Endre
 * @name Madlib Labs
 * @project_description A simple Madlib game that utilizes three different input boxes
 * @date 13 October 2021
 * @class CSC110
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
     * TODO LIST:
     *  [x] Create a UI that allows the user to enter each field required by your madlib
     *  [x] The UI should have buttons that the user cna click to signal they are entering balues.
     *  [x] Button should have a click handler:
     *      [x] Grabs the entered values
     *      [x] Converts them to appropriate value by casting or parsing
     *      [x] Use values with any String literals
     *      [x] Place the MadLib in Text Control visible to user
     *  [x]  For added fun, and to be sure we're correctly parsing numeric inputs, double any number
     *        provided by the user before putting in the finished version of your mad lib output.
     *
     */

    public void onClick(View view) {

        // Capture all of the inputs

        // Grab Animal
        EditText etAnimal = (EditText) findViewById(R.id.etAnimal);
        // Save the string
        String animal = etAnimal.getText().toString();
        // Modify the visibility to be hidden
        etAnimal.setVisibility(View.GONE);

        // Grab Name
        EditText etName = (EditText) findViewById(R.id.etName);
        String name = etName.getText().toString();
        etName.setVisibility(View.GONE);

        // Grab Food
        EditText etFood = (EditText) findViewById(R.id.etFood);
        String food = etFood.getText().toString();
        etFood.setVisibility(View.GONE);

        // Grab Place
        EditText etPlace = (EditText) findViewById(R.id.etPlace);
        String place = etPlace.getText().toString();
        etPlace.setVisibility(View.GONE);

        // Grab Second Place
        EditText etPlaceTwo = (EditText) findViewById(R.id.etPlace2);
        String placeTwo = etPlaceTwo.getText().toString();
        etPlaceTwo.setVisibility(View.GONE);

        // Grab Adjective
        EditText etAdjective = (EditText) findViewById(R.id.etAdjective);
        String adjective = etAdjective.getText().toString();
        etAdjective.setVisibility(View.GONE);

        // Grab Second Name
        EditText etNameTwo = (EditText) findViewById(R.id.etName2);
        String nameTwo = etNameTwo.getText().toString();
        etNameTwo.setVisibility(View.GONE);

        // Grab Numbers
        EditText etNumber = (EditText) findViewById(R.id.etNumber);
        // Parse the number as an Integer
        int number = Integer.parseInt(etNumber.getText().toString());
        // Multiply it by two
        number *= 2;
        etNumber.setVisibility(View.GONE);

        // Grab the button
        Button btn = (Button) findViewById(R.id.button);
        // Hide the button
        btn.setVisibility(View.GONE);

        // Build the paragraph
        String paragraph =
                "Once there was a " + animal + " named " + name
                        + ". Their favorite thing to eat is " + food
                        + " but they cannot find any! They searched " + place
                        + " and " + placeTwo + " but had no luck! By the end"
                        + " of the day, " + name + " was so " + adjective
                        + ". Little did they know, their best friend, " + nameTwo
                        + " had taken " + number + " of " + name + "'s favorite " + food + ".";

        // Grab the paragraph
        TextView finalParagraph = (TextView) findViewById(R.id.paragraph);
        // Set the text
        finalParagraph.setText(paragraph);
        // Change the visibility to visible
        finalParagraph.setVisibility(View.VISIBLE);
    }
}