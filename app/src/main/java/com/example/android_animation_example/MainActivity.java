package com.example.android_animation_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    enum Player {

        ONE, TWO

    }

    Player currentPlayer = Player.ONE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void imageViewIsTapped (View imageView) {

        ImageView tappedImageView = (ImageView) imageView;

        tappedImageView.setTranslationX(-2000);

        if (currentPlayer == Player.ONE) {

            tappedImageView.setImageResource(R.drawable.tiger);
            currentPlayer = Player.TWO;

        } else if (currentPlayer == Player.TWO) {

            tappedImageView.setImageResource(R.drawable.lion);
            currentPlayer = Player.ONE;

        }
        tappedImageView.animate().translationXBy(2000).alpha(1).rotation(3600).setDuration(1000);

    }

}
