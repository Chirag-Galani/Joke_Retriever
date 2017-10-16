package com.example.jokeandroidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    public static String JOKE_INTENT_KEY="JOKE_INTENT_KEY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);
        TextView textViewJokeDisplay= (TextView)findViewById(R.id.textViewJokeDisplay);
        if(getIntent()!=null) {
            String joke = getIntent().getStringExtra(JOKE_INTENT_KEY);
            textViewJokeDisplay.setText(joke);
        }
    }
}
