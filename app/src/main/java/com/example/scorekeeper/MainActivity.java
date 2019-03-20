package com.example.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // for team A
    TextView textView_score_teamA;
    TextView textView_fouls_teamA;

    // for team B
    TextView textView_score_teamB;
    TextView textView_fouls_teamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // for team A
        textView_score_teamA = (TextView)findViewById(R.id.scoreTeamA);
        textView_fouls_teamA = (TextView)findViewById(R.id.foulsToTeamA);

        // for team B
        textView_score_teamB = (TextView)findViewById(R.id.scoreTeamB);
        textView_fouls_teamB = (TextView)findViewById(R.id.foulsToTeamB);
    }

    public void plusThreeToTeamA(View view) {
        int score = Integer.valueOf(textView_score_teamA.getText().toString());
        score += 3;
        updateScoreTeamA(score);
    }

    public void plusTwoToTeamA(View view) {
        int score = Integer.valueOf(textView_score_teamA.getText().toString());
        score += 2;
        updateScoreTeamA(score);
    }

    public void plusOneToTeamA(View view) {
        int score = Integer.valueOf(textView_score_teamA.getText().toString());
        score += 1;
        updateScoreTeamA(score);

        // update fouls
        int fouls = Integer.valueOf(textView_fouls_teamA.getText().toString());
        fouls += 1;
        updateFoulsTeamA(fouls);
    }

    public void foulToTeamA(View view) {
        int fouls = Integer.valueOf(textView_fouls_teamA.getText().toString());
        fouls += 1;
        updateFoulsTeamA(fouls);
    }

    public void plusThreeToTeamB(View view) {
        int score = Integer.valueOf(textView_score_teamB.getText().toString());
        score += 3;
        updateScoreTeamB(score);
    }

    public void plusTwoToTeamB(View view) {
        int score = Integer.valueOf(textView_score_teamB.getText().toString());
        score += 2;
        updateScoreTeamB(score);
    }

    public void plusOneToTeamB(View view) {
        int score = Integer.valueOf(textView_score_teamB.getText().toString());
        score += 1;
        updateScoreTeamB(score);

        // update fouls
        int fouls = Integer.valueOf(textView_fouls_teamB.getText().toString());
        fouls += 1;
        updateFoulsTeamB(fouls);
    }

    public void foulToTeamB(View view) {
        int fouls = Integer.valueOf(textView_fouls_teamB.getText().toString());
        fouls += 1;
        updateFoulsTeamB(fouls);
    }

    private void updateScoreTeamA(int score){
        textView_score_teamA.setText(Integer.toString(score));
    }

    private void updateFoulsTeamA(int fouls){
        textView_fouls_teamA.setText(Integer.toString(fouls));
    }

    // for team B
    private void updateScoreTeamB(int score){
        textView_score_teamB.setText(Integer.toString(score));
    }

    private void updateFoulsTeamB(int fouls){
        textView_fouls_teamB.setText(Integer.toString(fouls));
    }

    public void resetTextViews(View view) {
        textView_score_teamA.setText("0");
        textView_fouls_teamA.setText("0");
        textView_score_teamB.setText("0");
        textView_fouls_teamB.setText("0");
    }
}
