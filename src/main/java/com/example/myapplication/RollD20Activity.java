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

public class RollD20Activity extends AppCompatActivity {
    private ImageView d20View;
    private Random randomNumGen = new Random();
    private Button roll;
    private GifView gifView;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.roll_d20_activity);

        d20View = findViewById(R.id.diceView);
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
        d20View.setVisibility(View.INVISIBLE);
        final MediaPlayer sound = MediaPlayer.create(this, R.raw.dicesound);
        Handler h = new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                gifView.setVisibility(gifView.INVISIBLE);
                int randomNum = randomNumGen.nextInt(20) + 1;
                makeVisible(d20View);
                switch (randomNum) {
                    case 1:
                        d20View.setImageResource(R.drawable.one);
                        break;
                    case 2:
                        d20View.setImageResource(R.drawable.two);
                        break;
                    case 3:
                        d20View.setImageResource(R.drawable.three);
                        break;
                    case 4:
                        d20View.setImageResource(R.drawable.four);
                        break;
                    case 5:
                        d20View.setImageResource(R.drawable.five);
                        break;
                    case 6:
                        d20View.setImageResource(R.drawable.six);
                        break;
                    case 7:
                        d20View.setImageResource(R.drawable.seven);
                        break;
                    case 8:
                        d20View.setImageResource(R.drawable.eight);
                        break;
                    case 9:
                        d20View.setImageResource(R.drawable.nine);
                        break;
                    case 10:
                        d20View.setImageResource(R.drawable.ten);
                        break;
                    case 11:
                        d20View.setImageResource(R.drawable.eleven);
                        break;
                    case 12:
                        d20View.setImageResource(R.drawable.twelve);
                        break;
                    case 13:
                        d20View.setImageResource(R.drawable.thirteen);
                        break;
                    case 14:
                        d20View.setImageResource(R.drawable.fourteen);
                        break;
                    case 15:
                        d20View.setImageResource(R.drawable.fifteen);
                        break;
                    case 16:
                        d20View.setImageResource(R.drawable.sixteen);
                        break;
                    case 17:
                        d20View.setImageResource(R.drawable.seventeen);
                        break;
                    case 18:
                        d20View.setImageResource(R.drawable.eighteen);
                        break;
                    case 19:
                        d20View.setImageResource(R.drawable.nineteen);
                        break;
                    case 20:
                        d20View.setImageResource(R.drawable.twenty);
                        break;
                    default:
                        d20View.setImageResource(R.drawable.blank);

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
