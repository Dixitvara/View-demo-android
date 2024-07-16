package com.example.viewpracticeandroid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button toggleBtn, checkBoxBtn, customCheckBtn, radioBtn, webViewBtn, seekBarBtn, datePickerBtn, timePickerBtn, progressBarBtn, imageSwitcherBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleBtn = findViewById(R.id.toggleButton);
        checkBoxBtn = findViewById(R.id.checkBox);
        customCheckBtn = findViewById(R.id.customCheckBox);
        radioBtn = findViewById(R.id.radioButton);
        webViewBtn = findViewById(R.id.webViewButton);
        seekBarBtn = findViewById(R.id.seekBarButton);
        datePickerBtn = findViewById(R.id.datePicker);
        timePickerBtn = findViewById(R.id.timePicker);
        progressBarBtn = findViewById(R.id.progressBar);
        imageSwitcherBtn = findViewById(R.id.imageSwitcher);

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

        webViewBtn.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), WebViewBtnPractical.class));
        });

        seekBarBtn.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), SeekBarPractical.class));
        });

        datePickerBtn.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), DatePickerPractical.class));
        });
        timePickerBtn.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), TimePickerPractical.class));
        });
        progressBarBtn.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), ProgressBarPractical.class));
        });
        imageSwitcherBtn.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), ImageSwitcherPractical.class));
        });
    }
}