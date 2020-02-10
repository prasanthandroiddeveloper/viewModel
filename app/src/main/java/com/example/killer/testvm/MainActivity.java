package com.example.killer.testvm;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    
    Button addScoreButton, resetScoreButton;
    TextView scoreTextView;
    ScoreViewModel scoreViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        scoreTextView = findViewById(R.id.scoreTextView);
        addScoreButton = findViewById(R.id.addScoreButton);
        resetScoreButton = findViewById(R.id.resetScoreButton);

        scoreViewModel = ViewModelProviders.of(this).get(ScoreViewModel.class);
        scoreTextView.setText(String.valueOf(ScoreViewModel.getdata()));

        addScoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addScore();
            }
        });

        resetScoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetScore();
            }
        });
    }
    public void addScore() {
        scoreViewModel.adddata();
        scoreTextView.setText(String.valueOf(ScoreViewModel.getdata()));
    }
    
    public void resetScore() {
        scoreViewModel.removedata();
        scoreTextView.setText(String.valueOf(ScoreViewModel.getdata()));
    }
    
    
    
    
    
}
