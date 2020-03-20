package com.example.practiceproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button enterNewActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterNewActivityButton = (Button) findViewById(R.id.goButton);
        enterNewActivityButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent goIntent = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(goIntent);



    }
}
