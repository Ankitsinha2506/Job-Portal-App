package com.project.jobportal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    RelativeLayout leftUpperCard, rightUpperCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the toolbar
        toolbar = findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        // You can add further logic here, such as setting up fragment transactions or handling user interactions

        leftUpperCard = findViewById(R.id.leftUpperCard);
        rightUpperCard = findViewById(R.id.rightUpperCard);

        // Handle the click event of left upper card.
        leftUpperCard.setOnClickListener(v -> {
            // Intent to open the leftUpperCard Actitvity.
            Intent intent = new Intent(MainActivity.this, LeftUpperCardActivity.class);
            startActivity(intent);

        });

        rightUpperCard.setOnClickListener(v -> {
            // Intent to open the leftUpperCard Actitvity.
            Intent intent = new Intent(MainActivity.this, RightUpperCardActivity.class);
            startActivity(intent);

        });
    }
}
