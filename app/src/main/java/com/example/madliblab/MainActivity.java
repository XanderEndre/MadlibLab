package com.example.madliblab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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
     *  [] Create a UI that allows the user to enter each field required by your madlib
     *  [] The UI should have buttons that the user cna click to signal they are entering balues.
     *  [] Button should have a click handler:
     *      [] Grabs the entered values
     *      [] Converts them to appropriate value by casting or parsing
     *      [] Use values with any String literals
     *      [] Place the MadLib in Text Control visible to user
     *  []  For added fun, and to be sure we're correctly parsing numeric inputs, double any number
     *        provided by the user before putting in the finished version of your mad lib output.
     *
     */
}