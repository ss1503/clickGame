package com.example.clickgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener {

    Button blueBtn;
    Button redBtn;

    int p1Points, p2Points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blueBtn = (Button) findViewById(R.id.blueBtn);
        redBtn = (Button) findViewById(R.id.redBtn);

        p1Points = 0;
        p2Points = 0;


        blueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1Points++;
            }
        });

        redBtn.setOnLongClickListener(this);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        p1Points = 0;
        p2Points = 0;
    }

    @Override
    public boolean onLongClick(View v) {
        p2Points += 2;
        return false;
    }

    public void SeeResults(View view)
    {
        Intent si = new Intent(this, MainActivity2.class);
        si.putExtra("ResultP1", p1Points);
        si.putExtra("ResultP2", p2Points);
        startActivity(si);
    }
}