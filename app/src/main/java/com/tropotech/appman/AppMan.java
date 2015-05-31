package com.tropotech.appman;

/**
 * Created by tom on 5/31/2015.
 */


import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.os.Bundle;


public class AppMan  extends Activity implements View.OnClickListener {

    private static final String TAG = "AppMan main activity";


    Button spotifyButton;
    Button scoresButton;
    Button libraryButton;
    Button buildItButton;
    Button XYZReaderButton;
    Button capstoneButton;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayButtons();
    }

    public void displayButtons(){
        spotifyButton = (Button) findViewById(R.id.button1);
        spotifyButton.setOnClickListener(this);
        scoresButton = (Button) findViewById(R.id.button2);
        scoresButton.setOnClickListener(this);
        libraryButton = (Button) findViewById(R.id.button3);
        libraryButton.setOnClickListener(this);
        buildItButton = (Button) findViewById(R.id.button4);
        buildItButton.setOnClickListener(this);
        XYZReaderButton = (Button) findViewById(R.id.button5);
        XYZReaderButton.setOnClickListener(this);
        capstoneButton = (Button) findViewById(R.id.button6);
        capstoneButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        Toast.makeText(this, R.string.appClick, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }



}
