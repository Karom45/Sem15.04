package com.example.sem1504;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ActivityDate extends AppCompatActivity {
    TextView tvView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);
        SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy");
        String time = sdf.format(new Date(System.currentTimeMillis()));

        TextView tvDate = (TextView) findViewById(R.id.tvDate);
        tvDate.setText(time);

        Intent intent = getIntent();
        tvView = (TextView) findViewById(R.id.tvView);
        String lName = intent.getStringExtra("lname");
        tvView.setText("Your name is: " + lName);
    }
}
