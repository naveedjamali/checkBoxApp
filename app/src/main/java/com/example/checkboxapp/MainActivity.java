package com.example.checkboxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox1, checkBox2, checkBox3;
    Button selectButton;
    TextView label;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox1 = (CheckBox) findViewById(R.id.checkBox);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        selectButton = (Button) findViewById(R.id.selectBtn);
        label = (TextView) findViewById(R.id.label);

        selectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = "";

                if (checkBox1.isChecked()) {
                    text += checkBox1.getText();
                }
                if (checkBox2.isChecked()) {
                    text += " " + checkBox2.getText();
                }
                if (checkBox3.isChecked()) {
                    text += " " + checkBox3.getText();
                }

                label.setText(text);
            }
        });


    }

}