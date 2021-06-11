package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.button.MainENGOE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton m1 = findViewById(R.id.monster01);
        ImageButton m2 = findViewById(R.id.monster02);
        ImageButton m3 = findViewById(R.id.monster03);

        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainENGOE.class);
                intent.putExtra("course_image", R.drawable.html);
                intent.putExtra("course_name", "FRONT-END WEB DESIGN " +
                        "Front-end web development, also known as client-side development\n" +
                        "is the practice of producing HTML, CSS and JavaScript for a website or\n" +
                        "Web Application so that a user can see and interact with them directly.\n" +
                        "The challenge associated with front end development is that the tools and\n" +
                        "techniques used to create the front end of a website change constantly and\n" +
                        "so the developer needs to constantly be aware of how the field is developing.\"");

                startActivity(intent);
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainENGOE.class);
                intent.putExtra("course_image", R.drawable.datascience1);
                intent.putExtra("course_name", "DATA SCIENCE" +
                        "Data science is the field of study that \n" +
                        "combines domain expertise, programming \n" +
                        "skills, and knowledge of mathematics and \n" +
                        "statistics to extract meaningful insights \n" +
                        "from data. Data science practitioners apply\n" +
                        "machine learning algorithms to numbers, text, \n" +
                        "images, video, audio, and more to produce \n" +
                        "artificial intelligence (AI) systems to perform \n" +
                        "tasks that ordinarily require human intelligence. \n" +
                        "In turn, these systems generate insights which analysts\n" +
                        " and business users can translate into tangible business value.");
                startActivity(intent);
            }
        });

        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainENGOE.class);
                intent.putExtra("course_image", R.drawable.mobile);
                intent.putExtra("course_name", "MOBILE APP DEVELOPMENT" +
                        "Mobile application development is the process\n" +
                        "to making software for smartphones and digital \n" +
                        "assistants, most commonly for Android and iOS.\n" +
                        "The software can be preinstalled on the device,\n" +
                        "downloaded from a mobile app store or accessed \n" +
                        "through a mobile web browser. The programming \n" +
                        "and markup languages used for this kind of software\n" +
                        "development include Java, Swift, C# and HTML5..");
                startActivity(intent);
            }
        });



    }
}