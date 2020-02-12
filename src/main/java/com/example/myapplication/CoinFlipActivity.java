package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.ImageView;
import android.os.Handler;

import com.cunoraz.gifview.library.GifView;

import java.util.Random;

public class CoinFlipActivity extends AppCompatActivity{
    private ImageView coinView;
    private GifView gifView;
    private Random randomNumGen = new Random();
    private Button flip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flip_coin_activity);
        flip = (Button) findViewById(R.id.button);
        coinView = findViewById(R.id.coinImage);
        gifView = findViewById(R.id.gifView);
        flip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flipCoin();
            }
        });
    }
        private void flipCoin()
        {
            coinView.setVisibility(View.INVISIBLE);
            final MediaPlayer sound = MediaPlayer.create(this, R.raw.coinsound);
            Handler h = new Handler();
            h.postDelayed(new Runnable() {
                @Override
                public void run() {
                    gifView.setVisibility(gifView.INVISIBLE);
                    int randomNum = randomNumGen.nextInt(2);
                    switch (randomNum)
                    {
                        case 0:
                            coinView.setImageResource(R.drawable.tails);
                            makeVisible(coinView);
                            break;
                        case 1:
                            coinView.setImageResource(R.drawable.heads);
                            makeVisible(coinView);
                            break;
                        default:
                            coinView.setImageResource(R.drawable.blank);
                            makeVisible(coinView);

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

