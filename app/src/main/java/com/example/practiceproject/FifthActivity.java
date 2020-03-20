package com.example.practiceproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FifthActivity extends AppCompatActivity implements View.OnClickListener {
    Button enterPrev2ActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        enterPrev2ActivityButton=(Button) findViewById(R.id.exit_button);
        enterPrev2ActivityButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent back2Intent = new Intent(FifthActivity.this,ThirdActivity.class);
        startActivity(back2Intent);

    }
}
