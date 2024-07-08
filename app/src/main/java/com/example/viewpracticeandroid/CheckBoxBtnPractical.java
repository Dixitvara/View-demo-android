package com.example.viewpracticeandroid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CheckBoxBtnPractical extends AppCompatActivity {

    CheckBox checkBox1,checkBox2, checkBox3, checkBox4;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_btn_practical);

        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);

        btn = findViewById(R.id.submitBtn);

        btn.setOnClickListener(view ->{
            StringBuilder stringBuilder = new StringBuilder();
            if(checkBox1.isChecked())
                stringBuilder.append(checkBox1.getText().toString().toLowerCase()).append(" ");
            if(checkBox2.isChecked())
                stringBuilder.append(checkBox2.getText().toString().toLowerCase()).append(" ");
            if(checkBox3.isChecked())
                stringBuilder.append(checkBox3.getText().toString().toLowerCase()).append(" ");
            if(checkBox4.isChecked())
                stringBuilder.append(checkBox4.getText().toString().toLowerCase()).append(" ");
            Toast.makeText(getApplicationContext(), stringBuilder + " is selected", Toast.LENGTH_SHORT).show();
        });

    }

}