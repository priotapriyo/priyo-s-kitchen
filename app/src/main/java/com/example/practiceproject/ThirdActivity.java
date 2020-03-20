package com.example.practiceproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {
    Button enterNewActivityButtonB;
    Button enterNewActivityButtonL;
    Button enterNewActivityButtonS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        enterNewActivityButtonB=(Button) findViewById(R.id.breakfastButton);
        enterNewActivityButtonB.setOnClickListener(this);
        enterNewActivityButtonB.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Intent breakfastIntent = new Intent(ThirdActivity.this, FourthActivity.class);
                startActivity(breakfastIntent);

            }
        }
            );

        enterNewActivityButtonL=(Button) findViewById(R.id.lunchButton);
        enterNewActivityButtonL.setOnClickListener(this);
        enterNewActivityButtonL.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Intent lunchIntent = new Intent(ThirdActivity.this, FifthActivity.class);
                startActivity(lunchIntent);
                                                       }
                                                   }
                );

        enterNewActivityButtonS=(Button) findViewById(R.id.snackstButton);
        enterNewActivityButtonS.setOnClickListener(this);
        enterNewActivityButtonS.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent snacksIntent = new Intent(ThirdActivity.this, SixthActivity.class);
                startActivity(snacksIntent);
            }

        }
        );
            }

    @Override
    public void onClick(View v) {

    }
}

