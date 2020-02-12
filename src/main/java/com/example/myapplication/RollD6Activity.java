package com.example.myapplication;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.cunoraz.gifview.library.GifView;

import java.util.Random;

public class RollD6Activity extends AppCompatActivity {
    private ImageView d6View;
    private Random randomNumGen = new Random();
    private GifView gifView;
    private Button roll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.roll_d6_activity);

        d6View = findViewById(R.id.diceView);
        roll = (Button) findViewById(R.id.button);
        gifView = findViewById(R.id.gifView);
        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }
    private void rollDice()
    {
        d6View.setVisibility(View.INVISIBLE);
        final MediaPlayer sound = MediaPlayer.create(this, R.raw.dicesound);
        Handler h = new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                gifView.setVisibility(gifView.INVISIBLE);
                int randomNum = randomNumGen.nextInt(6) + 1;
                makeVisible(d6View);
                switch (randomNum)
                {
                    case 1:
                        d6View.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        d6View.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        d6View.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        d6View.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        d6View.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        d6View.setImageResource(R.drawable.dice6);
                        break;
                    default:
                        d6View.setImageResource(R.drawable.blank);

                }
            }
        }, 950);
        sound.start();
        gifView.setVisibility(gifView.VISIBLE);

    }
    public void makeVisible(View view) {
        view.setVisibility(View.VISIBLE);
    }
    }
