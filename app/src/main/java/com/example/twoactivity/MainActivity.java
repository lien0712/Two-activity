package com.example.twoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG=MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lanchSecondActivity(View view) {
        Log.d(LOG_TAG,"Button Clicked");

        Intent intent = new Intent(this,Activity2.class);
        intent.putExtra("message","Hello");
        intent.putExtra("so",1234567);

        startActivity(intent);

    }

}