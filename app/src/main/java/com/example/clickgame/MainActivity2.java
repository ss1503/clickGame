package com.example.clickgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView p1ResultTxt, p2ResultTxt, winnerTxt;

    int p1Points, p2Points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent gi = getIntent();

        p1ResultTxt = (TextView) findViewById(R.id.p1ResultTxt);
        p2ResultTxt = (TextView) findViewById(R.id.p2ResultTxt);
        winnerTxt = (TextView) findViewById(R.id.winnerTxt);

        p1Points = gi.getIntExtra("ResultP1", -1);
        p2Points = gi.getIntExtra("ResultP2", -2);




        p1ResultTxt.setText("player 1 points:" + p1Points);
        p2ResultTxt.setText("player 2 points:" + p2Points);

        if(p1Points > p2Points)
        {
            winnerTxt.setText("The winner is player 1!!!");
        }
        else if(p2Points > p1Points)
        {
            winnerTxt.setText("The winner is player 2!!!");
        }
        else
        {
            winnerTxt.setText("Draw :(");
        }
    }

    public void back(View view)
    {
        finish();
    }
}