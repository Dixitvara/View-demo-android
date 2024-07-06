package com.example.viewpracticeandroid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button toggleBtn, checkBoxBtn, customCheckBtn, radioBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleBtn = findViewById(R.id.toggleButton);
        checkBoxBtn = findViewById(R.id.checkBox);
        customCheckBtn = findViewById(R.id.customCheckBox);
        radioBtn = findViewById(R.id.radioButton);

        toggleBtn.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), ToggleBtnPractical.class));
        });

        checkBoxBtn.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), CheckBoxBtnPractical.class));
        });

        customCheckBtn.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), CustomCheckBtnPractical.class));
        });

        radioBtn.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), RadioBtnPractical.class));
        });
    }
}