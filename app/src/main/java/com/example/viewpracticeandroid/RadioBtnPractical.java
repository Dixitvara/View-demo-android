package com.example.viewpracticeandroid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RadioBtnPractical extends AppCompatActivity {

    RadioGroup radioGroup;
    Button submitBtn;
    RadioButton clickedBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_btn_practical);

        submitBtn = findViewById(R.id.submitBtn);
        radioGroup = findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener((radioGroup, i) -> clickedBtn = findViewById(i));
        submitBtn.setOnClickListener(view -> Toast.makeText(getApplicationContext(), clickedBtn.getText(), Toast.LENGTH_SHORT).show());
    }
}