package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
int score = 0,scoreb=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    void reset(View view){
        score = scoreb = 0;
        displayForTeamA();
        displayForTeamB();
    }
    void add3(View view){
        score+=3;
        displayForTeamA();
    }
    void add2(View view){
        score+=2;
        displayForTeamA();
    }
    void add1(View view){
        score++;
        displayForTeamA();
    }
    void add3b(View view){
        scoreb+=3;
        displayForTeamB();
    }
    void add2b(View view){
        scoreb+=2;
        displayForTeamB();
    }
    void add1b(View view){
        scoreb++;
        displayForTeamB();
    }
    public void displayForTeamA() {

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);

        scoreView.setText(String.valueOf(score));

    }
    public void displayForTeamB() {

        TextView scoreView = (TextView) findViewById(R.id.team_b_score);

        scoreView.setText(String.valueOf(scoreb));

    }
}
