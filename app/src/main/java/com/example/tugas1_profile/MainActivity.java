package com.example.tugas1_profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tugas1_profile.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void profile(View view){
        Intent a = new Intent(MainActivity.this,
                com.example.tugas1teori_profile.activity_profile.class);
        startActivity(a);
    }
}