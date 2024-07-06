package com.example.viewpracticeandroid;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ToggleBtnPractical extends AppCompatActivity {

    ToggleButton toggleBtn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_btn_practical);

        toggleBtn = findViewById(R.id.toggleBtn);
        textView = findViewById(R.id.txtViewAction);

        toggleBtn.setOnClickListener(view -> {
            if (toggleBtn.getText().toString().toLowerCase().equals("on"))
                textView.setText("off");
            else
                textView.setText("on");
        });
    }
}