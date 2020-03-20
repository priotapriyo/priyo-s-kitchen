package com.example.practiceproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourthActivity extends AppCompatActivity implements View.OnClickListener {
    Button enterPrev1ActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        enterPrev1ActivityButton=(Button) findViewById(R.id.exit_button);
        enterPrev1ActivityButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent back1Intent = new Intent(FourthActivity.this,ThirdActivity.class);
        startActivity(back1Intent);

    }
}
