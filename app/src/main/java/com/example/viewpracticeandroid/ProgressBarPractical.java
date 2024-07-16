package com.example.viewpracticeandroid;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ProgressBarPractical extends AppCompatActivity {

    Button startBtn;
    ProgressDialog progressBar;
    private int progressBarStatus = 0;
    private long fileSize = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar_practical);

        addListenerOnButton();
    }

    public void addListenerOnButton() {
        startBtn = findViewById(R.id.getProgress);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar = new ProgressDialog(v.getContext());
                progressBar.setCancelable(false);
                progressBar.setTitle("File uploading");
                progressBar.setMessage("File is downloading...");
                progressBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                progressBar.setProgress(0);
                progressBar.setMax(100);
                progressBar.show();
            }
        });
    }
}