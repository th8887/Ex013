package com.example.ex013;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    RadioButton green,purple,ltblue,gray;
    Switch on;
    LinearLayout background;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        green=(RadioButton) findViewById(R.id.green);
        gray=(RadioButton) findViewById(R.id.gray);
        purple=(RadioButton) findViewById(R.id.purple);
        ltblue=(RadioButton) findViewById(R.id.ltblue);
        on=(Switch) findViewById(R.id.on);
        background=(LinearLayout) findViewById(R.id.background);
    }
    public void colors(){
        if (green.isChecked())
            background.setBackgroundColor(Color.GREEN);
        else{
            if (gray.isChecked())
                background.setBackgroundColor(Color.GRAY);
            else
                if (purple.isChecked())
                    background.setBackgroundColor(Color.MAGENTA);
                else
                    background.setBackgroundColor(Color.CYAN);
        }
    }

    public void change_color2(View view) {
        colors();
        }

    public void change_green(View view) {
        if(on.isChecked())
            background.setBackgroundColor(Color.GREEN);
    }

    public void change_gray(View view) {
        if(on.isChecked())
            background.setBackgroundColor(Color.GRAY);
    }

    public void change_purple(View view) {
        if(on.isChecked())
            background.setBackgroundColor(Color.MAGENTA);
    }

    public void change_ltblue(View view) {
        if(on.isChecked())
            background.setBackgroundColor(Color.CYAN);
    }

    public void change_color1(View view) {
        if (on.isChecked())
            colors();
    }
}
