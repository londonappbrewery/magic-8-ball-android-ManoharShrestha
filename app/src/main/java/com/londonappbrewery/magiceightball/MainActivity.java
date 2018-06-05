package com.londonappbrewery.magiceightball;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button askBtn = findViewById(R.id.ask_Btn);

        final ImageView magicBall = findViewById(R.id.magic_Ball);

        final int[] magic_array = {

                R.drawable.ball13x,

                R.drawable.ball23x,

                R.drawable.ball33x,

                R.drawable.ball43x,

                R.drawable.ball53x
        };

        askBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("magic","key pressed");
                Random magicballgenerator = new Random();
                int number = magicballgenerator.nextInt(5);
                Log.d("magic","magic pressed" + number);
                magicBall.setImageResource(magic_array[number]);


            }
        });
    }
}
