package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainENGOE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_e_n_g_o_e);

        TextView nameView = findViewById(R.id.course_name);
        ImageView imageView = findViewById(R.id.course_image);

        String name = getIntent().getExtras().getString("course_name");
        int imageRes = getIntent().getExtras().getInt("course_image");

        nameView.setText(name);
        imageView.setImageResource(imageRes);

    }}