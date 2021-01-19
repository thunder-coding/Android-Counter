package com.example.myapplication;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int countInt = 0;
    private TextView count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countInt = 0;
        count = findViewById(R.id.count);
    }

    public void OnClickPlusOne(View view){
        Log.e("Hello", "+1 Clicked");
        ++countInt;
        count.setText(String.valueOf(countInt));
    }

    public void onClickMinusOne(View view){
        Log.e("Hello", "-1 Clicked");
        --countInt;
        count.setText(String.valueOf(countInt));
    }

    public void onClickReset(View view){
        countInt = 0;
        count.setText(String.valueOf(countInt));
    }

    public void onClickRandomColor(View view){
        ScrollView scrollView = findViewById(R.id.ScrollView);
        Random random = new Random();
        scrollView.setBackgroundColor(Color.argb(255,random.nextInt(256),random.nextInt(256), random.nextInt(256)));
    }
}