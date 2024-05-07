package com.example.radiobtngrp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout screenL;
    Switch switchBtn;
    RadioButton rBRed, rBBlue, rBYellow, rBWhite;
    Button changeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchBtn = findViewById(R.id.switchBtn);
        rBRed = findViewById(R.id.rBRed);
        rBBlue = findViewById(R.id.rBBlue);
        rBYellow= findViewById(R.id.rBYellow);
        rBWhite = findViewById(R.id.rBWhite);
        changeBtn = findViewById(R.id.changeBtn);
        screenL = findViewById(R.id.screen);

    }


    public void changeClicked(View view) {
        if(switchBtn.isChecked())
        {
            changeColorRB();
        }
    }

    public void clickedRBtn(View view) {
        if(!switchBtn.isChecked())
        {
            changeColorRB();
        }
    }

    public void changeColorRB()
    {
        if(rBRed.isChecked())
        {
            screenL.setBackgroundColor(Color.parseColor("#E89494"));
        }
        else if(rBBlue.isChecked())
        {
            screenL.setBackgroundColor(Color.parseColor("#BDDDF1"));
        }
        else if(rBYellow.isChecked())
        {
            screenL.setBackgroundColor(Color.parseColor("#F6DFB9"));
        }
        else
        {
            screenL.setBackgroundColor(Color.parseColor("#FDF6FE"));
        }
    }
}