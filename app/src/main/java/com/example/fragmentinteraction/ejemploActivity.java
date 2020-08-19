package com.example.fragmentinteraction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ejemploActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}