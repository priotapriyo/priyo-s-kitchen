package com.example.practiceproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SixthActivity extends AppCompatActivity implements View.OnClickListener {
    Button enterPrev3ActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

        enterPrev3ActivityButton=(Button) findViewById(R.id.exit_button);
        enterPrev3ActivityButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent back3Intent = new Intent(SixthActivity.this,ThirdActivity.class);
        startActivity(back3Intent);

    }
}
