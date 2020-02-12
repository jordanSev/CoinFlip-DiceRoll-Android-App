package com.example.myapplication;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Button coinFlipButton;
    private Button rollD4Button;
    private Button rollD6Button;
    private Button rollD8Button;
    private Button rollD10Button;
    private Button rollD20Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coinFlipButton = (Button) findViewById(R.id.coinButton);
        rollD4Button = (Button) findViewById(R.id.d4Button);
        rollD6Button = (Button) findViewById(R.id.d6Button);
        rollD8Button = (Button) findViewById(R.id.d8Button);
        rollD10Button = (Button) findViewById(R.id.d10Button);
        rollD20Button = (Button) findViewById(R.id.d20Button);

        coinFlipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCoinActivity();
            }
        });
        rollD4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRollD4Activity();
            }
        });
        rollD6Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRollD6Activity();
            }
        });
        rollD8Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRollD8Activity();
            }
        });
        rollD10Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRollD10Activity();
            }
        });
        rollD20Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRollD20Activity();
            }
        });
    }
        public void openCoinActivity() {
            Intent intent = new Intent(this, CoinFlipActivity.class);
            startActivity(intent);
        }
        public void openRollD4Activity() {
            Intent intent = new Intent(this, RollD4Activity.class);
            startActivity(intent);
        }
        public void openRollD6Activity() {
            Intent intent = new Intent(this, RollD6Activity.class);
            startActivity(intent);
        }
        public void openRollD8Activity() {
            Intent intent = new Intent(this, RollD8Activity.class);
            startActivity(intent);
        }
        public void openRollD10Activity() {
            Intent intent = new Intent(this, RollD10Activity.class);
            startActivity(intent);
        }
        public void openRollD20Activity() {
            Intent intent = new Intent(this, RollD20Activity.class);
            startActivity(intent);
        }
    }

