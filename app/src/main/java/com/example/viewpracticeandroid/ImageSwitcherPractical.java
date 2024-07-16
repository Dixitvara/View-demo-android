package com.example.viewpracticeandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Field;
import java.util.Random;

public class ImageSwitcherPractical extends AppCompatActivity {

    ImageSwitcher imageSwitcher;
    Button button;
    int counter = -1;
    Random rand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_switcher_practical);

        Class<R.mipmap> mipmapClass = R.mipmap.class;
        Field[] fields = mipmapClass.getFields();
        rand = new Random();

        imageSwitcher = findViewById(R.id.imageSwitcher);
        button = findViewById(R.id.nextBtn);

        imageSwitcher.setFactory(() -> {
            ImageView switcherImageView = new ImageView(getApplicationContext());
            switcherImageView.setScaleType(ImageView.ScaleType.CENTER);
            try {
                switcherImageView.setImageResource(fields[rand.nextInt(40)].getInt(mipmapClass));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
            return switcherImageView;
        });

        button.setOnClickListener(v -> {
            try {
                imageSwitcher.setImageResource(fields[rand.nextInt(40)].getInt(mipmapClass));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        });

    }
}