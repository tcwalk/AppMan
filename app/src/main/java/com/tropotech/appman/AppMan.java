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


//public class AppMan  extends Activity implements View.OnClickListener {
public class AppMan  extends Activity {

    private static final String TAG = "AppMan main activity";

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makeToast(View v) {
        Toast.makeText(this, R.string.appClick, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}
