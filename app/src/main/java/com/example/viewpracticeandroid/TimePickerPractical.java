package com.example.viewpracticeandroid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

public class TimePickerPractical extends AppCompatActivity {

    Button changeTimeBtn;
    TextView viewTimeTextView;
    TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker_practical);

        timePicker = findViewById(R.id.timePicker);
        viewTimeTextView = findViewById(R.id.timeTextView);
        changeTimeBtn = findViewById(R.id.changeTimeBtn);

        changeTimeBtn.setOnClickListener(v -> viewTimeTextView.setText(getTime()));
    }

    String getTime() {
        return timePicker.getHour() + ":" +
                timePicker.getMinute();
    }
}