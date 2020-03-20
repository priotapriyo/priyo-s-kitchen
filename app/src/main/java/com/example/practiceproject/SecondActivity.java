package com.example.practiceproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    Button enterNewActivityButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        enterNewActivityButton1 = (Button) findViewById(R.id.loginButton);
        enterNewActivityButton1.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent loginIntent = new Intent(SecondActivity.this,ThirdActivity.class);
        startActivity(loginIntent);

    }
}
