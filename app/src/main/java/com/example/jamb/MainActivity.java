package com.example.jamb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private ImageView imageViewDice1;
    private ImageView imageViewDice2;
    private ImageView imageViewDice3;
    private ImageView imageViewDice4;
    private ImageView imageViewDice5;
    private Button button;
    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice1 = findViewById(R.id.image_view_dice1);
        imageViewDice2 = findViewById(R.id.image_view_dice2);
        imageViewDice3 = findViewById(R.id.image_view_dice3);
        imageViewDice4 = findViewById(R.id.image_view_dice4);
        imageViewDice5 = findViewById(R.id.image_view_dice5);
        button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    private void rollDice() {
        int randomNumber = rng.nextInt(6) + 1;
        int randomNumber1 = rng.nextInt(6) + 1;
        int randomNumber2 = rng.nextInt(6) + 1;
        int randomNumber3 = rng.nextInt(6) + 1;
        int randomNumber4 = rng.nextInt(6) + 1;
        int randomNumber5 = rng.nextInt(6) + 1;

        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                break;
        }
        switch (randomNumber1) {
            case 1:
                imageViewDice1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDice1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice1.setImageResource(R.drawable.dice6);
                break;
        }
        switch (randomNumber2) {
            case 1:
                imageViewDice2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDice2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice2.setImageResource(R.drawable.dice6);
                break;
        }
        switch (randomNumber3) {
            case 1:
                imageViewDice3.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDice3.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice3.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice3.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice3.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice3.setImageResource(R.drawable.dice6);
                break;
        }
        switch (randomNumber4) {
            case 1:
                imageViewDice4.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDice4.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice4.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice4.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice4.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice4.setImageResource(R.drawable.dice6);
                break;
        }
        switch (randomNumber5) {
            case 1:
                imageViewDice5.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDice5.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice5.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice5.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice5.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice5.setImageResource(R.drawable.dice6);
                break;
        }

    }
}