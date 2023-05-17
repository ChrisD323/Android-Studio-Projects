package com.example.dialejh_11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        TextView txtGreeting = findViewById(R.id.txtGreeting);
        String location = intent.getStringExtra("location");
        txtGreeting.setText("Temperature for "+location+ ":");
        Bundle bundle = new Bundle();
        bundle.putString("location", location);
        com.example.dialejh_11.WeatherFragment fragment = new com.example.dialejh_11.WeatherFragment();
        fragment.setArguments(bundle);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment2, fragment).commit();
    }
}