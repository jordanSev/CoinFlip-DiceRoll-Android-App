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

public class RollD10Activity extends AppCompatActivity {
    private ImageView d10View;
    private Random randomNumGen = new Random();
    private Button roll;
    private GifView gifView;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.roll_d10_activity);

        d10View = findViewById(R.id.diceView);
        roll = (Button) findViewById(R.id.button);
        gifView = findViewById(R.id.gifView);
        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    private void rollDice () {
        d10View.setVisibility(View.INVISIBLE);
        final MediaPlayer sound = MediaPlayer.create(this, R.raw.dicesound);
        Handler h = new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                gifView.setVisibility(gifView.INVISIBLE);
                int randomNum = randomNumGen.nextInt(10) + 1;
                makeVisible(d10View);
                switch (randomNum) {
                    case 1:
                        d10View.setImageResource(R.drawable.one);
                        break;
                     case 2:
                         d10View.setImageResource(R.drawable.two);
                         break;
                     case 3:
                         d10View.setImageResource(R.drawable.three);
                         break;
                     case 4:
                         d10View.setImageResource(R.drawable.four);
                         break;
                     case 5:
                         d10View.setImageResource(R.drawable.five);
                         break;
                     case 6:
                         d10View.setImageResource(R.drawable.six);
                         break;
                     case 7:
                         d10View.setImageResource(R.drawable.seven);
                         break;
                     case 8:
                         d10View.setImageResource(R.drawable.eight);
                         break;
                     case 9:
                         d10View.setImageResource(R.drawable.nine);
                         break;
                     case 10:
                         d10View.setImageResource(R.drawable.ten);
                         break;
                     default:
                         d10View.setImageResource(R.drawable.blank);

                    }
                }
            }, 950);
        sound.start();
        gifView.setVisibility(gifView.VISIBLE);

        }

        public void makeVisible (View view){
            view.setVisibility(View.VISIBLE);
        }
    }

   