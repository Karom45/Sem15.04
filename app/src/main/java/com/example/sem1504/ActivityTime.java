package com.example.sem1504;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


import java.text.SimpleDateFormat;
import java.util.Date;


public class ActivityTime extends AppCompatActivity {
    TextView tvView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String time = sdf.format(new Date(System.currentTimeMillis()));

        TextView tvTime = (TextView) findViewById(R.id.tvTime);
        tvTime.setText(time);

        Intent intent = getIntent();
        tvView = (TextView) findViewById(R.id.tvView);
        String lName = intent.getStringExtra("lname");
        tvView.setText("Your name is: " + lName);

    }
}
