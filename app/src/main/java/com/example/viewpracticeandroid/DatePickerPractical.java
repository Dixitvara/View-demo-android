package com.example.viewpracticeandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DatePickerPractical extends AppCompatActivity {

    DatePicker datePicker;
    TextView dateTextView;
    Button changeDateBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker_practical);

        datePicker = findViewById(R.id.datePicker);
        dateTextView = findViewById(R.id.dateTextView);
        changeDateBtn = findViewById(R.id.changeDateBtn);

        changeDateBtn.setOnClickListener( v -> dateTextView.setText(getDate()));
    }

    public String getDate() {
        return datePicker.getDayOfMonth() + "/" +
                datePicker.getMonth() + "/" +
                datePicker.getYear();
    }
}