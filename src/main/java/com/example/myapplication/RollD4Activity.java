package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.view.View;
import android.widget.ImageView;

import com.cunoraz.gifview.library.GifView;

import java.util.Random;

public class RollD4Activity extends AppCompatActivity {
    private ImageView d4View;
    private Random randomNumGen = new Random();
    private GifView gifView;
    private Button roll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.roll_d4_activity);

        d4View = findViewById(R.id.diceView);
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
            d4View.setVisibility(View.INVISIBLE);
            final MediaPlayer sound = MediaPlayer.create(this, R.raw.dicesound);
            Handler h = new Handler();
            h.postDelayed(new Runnable() {
                @Override
                public void run() {
                    gifView.setVisibility(gifView.INVISIBLE);
                    int randomNum = randomNumGen.nextInt(4) + 1;
                    makeVisible(d4View);
                    switch (randomNum)
                    {
                        case 1:
                            d4View.setImageResource(R.drawable.one);
                            break;
                        case 2:
                            d4View.setImageResource(R.drawable.two);
                            break;
                        case 3:
                            d4View.setImageResource(R.drawable.three);
                            break;
                        case 4:
                            d4View.setImageResource(R.drawable.four);
                            break;
                        default:
                            d4View.setImageResource(R.drawable.blank);

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
